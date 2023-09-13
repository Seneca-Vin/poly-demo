package com.github.seneca.request;

import com.github.seneca.exception.PolyMallException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城公共request
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PolyMallCommonRequest implements Serializable {
    private static final long serialVersionUID = -4766915659779847060L;
    /**
     * 是否必填:    必填
     * 描述:  方法名称
     * 示例值: Differ.JH.Business.GetOrder
     */
    private String method;
    /**
     * 是否必填:    必填
     * 描述:  应用编号
     * 示例值: 438b2f6ff103422a98a9349507293bb2
     */
    private String appkey;
    /**
     * 是否必填:    必填
     * 描述:  访问令牌
     * 示例值: 9415c33b04d24c7dae320b0185f42fb0
     */
    private String token;
    /**
     * 是否必填:    必填
     * 描述:  私有请求参数json格式串
     * 示例值: {}
     */
    private String bizcontent;
    /**
     * 是否必填:    必填
     * 描述:  签名串
     * 示例值: deerde15w5622s6w9552x2d25w5e8e55dd2d255essw
     */
    private String sign;
    /**
     * 业务值：菠萝派密匙
     */
    private String appSecret;

    public void checkRequest() throws PolyMallException {}
}
