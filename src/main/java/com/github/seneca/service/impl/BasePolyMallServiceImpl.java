package com.github.seneca.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.github.seneca.constants.PolyConstants;
import com.github.seneca.constants.PolyMallConstants;
import com.github.seneca.enums.PolyErrorCodeEnum;
import com.github.seneca.exception.PolyMallException;
import com.github.seneca.request.PolyMallCommonRequest;
import com.github.seneca.service.PolyMallService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
abstract class BasePolyMallServiceImpl implements PolyMallService {

    @Value("${poly.mall.appKey}")
    private String appKey;

    @Value("${poly.mall.token}")
    private String token;

    @Value("${poly.mall.appSecret}")
    private String appSecret;

    @Override
    public void checkRequest(PolyMallCommonRequest request) throws PolyMallException {
        // 如果只有一个仓库就很简单,根据传过来的key和token做比较即可
        if (null == request.getAppkey() || !StringUtils.equals(appKey, request.getAppkey())) {
            throw new PolyMallException(PolyErrorCodeEnum.APPKEY_ERROR.getCode(), PolyErrorCodeEnum.APPKEY_ERROR.getDesc());
        }
        if (null == request.getToken() || !StringUtils.equals(token, request.getToken())) {
            throw new PolyMallException(PolyErrorCodeEnum.TOKEN_ERROR.getCode(), PolyErrorCodeEnum.TOKEN_ERROR.getDesc());
        }
        if (StringUtils.isBlank(request.getSign())) {
            throw new PolyMallException(PolyErrorCodeEnum.SIGN_EMPTY.getCode(), PolyErrorCodeEnum.SIGN_EMPTY.getDesc());
        }
        if (StringUtils.isBlank(request.getBizcontent())) {
            throw new PolyMallException(PolyErrorCodeEnum.PARAMS_ERROR.getCode(), PolyErrorCodeEnum.PARAMS_ERROR.getDesc());
        }
        if (StringUtils.isBlank(request.getMethod())) {
            throw new PolyMallException(PolyErrorCodeEnum.METHOD_EMPTY.getCode(), PolyErrorCodeEnum.METHOD_EMPTY.getDesc());
        }
        if (!PolyMallConstants.supportedMethodList.contains(request.getMethod())) {
            throw new PolyMallException(PolyErrorCodeEnum.METHOD_ERROR.getCode(), PolyErrorCodeEnum.METHOD_ERROR.getDesc());
        }
        if (StringUtils.isBlank(request.getSign())) {
            throw new PolyMallException(PolyErrorCodeEnum.SIGN_EMPTY.getCode(), PolyErrorCodeEnum.SIGN_EMPTY.getDesc());
        }
        request.setAppSecret(appSecret);
    }

    @Override
    public void checkSign(PolyMallCommonRequest request) throws PolyMallException {
        Map<String, String> map = new HashMap<>(4);
        map.put(PolyConstants.DeclaredField.APPKEY, request.getAppkey());
        map.put(PolyConstants.DeclaredField.TOKEN, request.getToken());
        map.put(PolyConstants.DeclaredField.METHOD, request.getMethod());
        map.put(PolyConstants.DeclaredField.BIZCONTENT, request.getBizcontent());

        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getKey));
        Iterator<Map.Entry<String, String>> iterator = list.stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue,
                LinkedHashMap::new
        )).entrySet().iterator();

        StringBuilder signString = new StringBuilder();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            signString.append(entry.getKey()).append(entry.getValue());
        }
        signString.insert(0, request.getAppSecret());
        signString.append(request.getAppSecret());

        String localSign = DigestUtils.md5Hex(signString.toString().toLowerCase());

        if (!request.getSign().equals(localSign)) {
            throw new PolyMallException(PolyErrorCodeEnum.SIGN_ERROR.getCode(), PolyErrorCodeEnum.SIGN_ERROR.getDesc());
        }
    }

    @Override
    public void checkRequestAndSign(PolyMallCommonRequest request) throws PolyMallException {
        log.info("[PolyMall]菠萝派请求：{}", JSONObject.toJSONString(request));
        this.checkRequest(request);
        this.checkSign(request);
    }

    //本地签名生成工具
    public static void main(String[] args) {
        PolyMallCommonRequest request = PolyMallCommonRequest.builder()
                .appkey("8085dbc11647487ea3d9425f9102eb1c") //替换自己的key
                .token("8085dbc11647487ea3d9425f9102eb1c") //替换自己的token
                .method("Differ.JH.Business.GetOrder") //调用的方法
                .bizcontent("{\"OrderStatus\":\"JH_99\",\"PlatOrderNo\":\"\",\"StartTime\":\"2023-04-18 14:34:49\",\"EndTime\":\"2023-04-25 14:34:49\",\"TimeType\":\"JH_02\",\"PageIndex\":1,\"PageSize\":30}") //把接口测试工具的入参json贴过来
                .build();
        // 创建一个Map对象
        Map<String, String> map = new HashMap<>(4);
        map.put(PolyConstants.DeclaredField.APPKEY, request.getAppkey());
        map.put(PolyConstants.DeclaredField.TOKEN, request.getToken());
        map.put(PolyConstants.DeclaredField.METHOD, request.getMethod());
        map.put(PolyConstants.DeclaredField.BIZCONTENT, request.getBizcontent());
        // 将Map转换为List集合
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        // 对List集合进行排序
        list.sort(Comparator.comparing(Map.Entry::getKey));
        // 将排好序的List集合转换回Map
        Iterator<Map.Entry<String, String>> iterator = list.stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue,
                LinkedHashMap::new
        )).entrySet().iterator();
        StringBuilder acquireSign = new StringBuilder();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            acquireSign.append(entry.getKey()).append(entry.getValue());
        }
        acquireSign.insert(0, "8085dbc11647487ea3d9425f9102eb1c");//替换自己的Secret
        acquireSign.append("8085dbc11647487ea3d9425f9102eb1c");//替换自己的Secret
        // 本地生成的签名
        System.out.println("————————————————————————————————————————————————");
        String localSign = DigestUtils.md5Hex(acquireSign.toString().toLowerCase());
        System.out.println(localSign);
        System.out.println("————————————————————————————————————————————————");
    }

}
