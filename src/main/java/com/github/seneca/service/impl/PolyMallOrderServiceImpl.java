package com.github.seneca.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.github.seneca.exception.PolyMallException;
import com.github.seneca.request.PolyMallCommonRequest;
import com.github.seneca.request.PolyMallOrderRequest;
import com.github.seneca.request.PolyMallSendRequest;
import com.github.seneca.response.PolyMallCommonResponse;
import com.github.seneca.service.PolyMallOrderService;
import com.github.seneca.utils.PolyMallResponseManage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城 order
 */
@Slf4j
@Service
public class PolyMallOrderServiceImpl implements PolyMallOrderService {

    @Override
    public PolyMallCommonResponse queryOrders(PolyMallCommonRequest request) throws PolyMallException {
        PolyMallOrderRequest orderRequest = JSONObject.parseObject(request.getBizcontent()).toJavaObject(PolyMallOrderRequest.class);
        orderRequest.checkRequest();

        //TODO 处理自己的分页和业务逻辑..

        return PolyMallResponseManage.orderSuccess(Collections.EMPTY_LIST, 10L);
    }

    @Override
    public PolyMallCommonResponse checkRefund(PolyMallCommonRequest request) {
        //根据自己业务来，无退款就写死无退款
        return PolyMallResponseManage.noneRefund();
    }

    @Override
    public PolyMallCommonResponse send(PolyMallCommonRequest request) throws PolyMallException {
        PolyMallSendRequest sendRequest = JSONObject.parseObject(request.getBizcontent()).toJavaObject(PolyMallSendRequest.class);
        sendRequest.checkRequest();

        //TODO 处理自己的业务逻辑..

        return PolyMallResponseManage.sendSuccess();
    }

}
