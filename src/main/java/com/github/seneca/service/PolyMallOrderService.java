package com.github.seneca.service;

import com.github.seneca.exception.PolyMallException;
import com.github.seneca.request.PolyMallCommonRequest;
import com.github.seneca.response.PolyMallCommonResponse;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城service
 */
public interface PolyMallOrderService {

    /**
     * 拉取订单
     *
     * @param request
     * @return
     * @throws PolyMallException
     */
    PolyMallCommonResponse queryOrders(PolyMallCommonRequest request) throws PolyMallException;

    /**
     * 检查售后
     *
     * @param request
     * @return
     * @throws PolyMallException
     */
    PolyMallCommonResponse checkRefund(PolyMallCommonRequest request) throws PolyMallException;

    /**
     * 发货
     *
     * @param request
     * @return
     * @throws PolyMallException
     */
    PolyMallCommonResponse send(PolyMallCommonRequest request) throws PolyMallException;

}
