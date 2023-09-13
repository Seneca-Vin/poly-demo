package com.github.seneca.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 售后监测
 */
@Data
public class PolyMallRefundRequest extends PolyMallCommonRequest {

    /**
     * 是否必填:    必填
     * 描述:  平台订单号
     * 示例值: NO2545661
     */
    private String OrderID;

}
