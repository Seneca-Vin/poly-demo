package com.github.seneca.service;

import com.github.seneca.exception.PolyMallException;
import com.github.seneca.request.PolyMallCommonRequest;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城公共service
 */
public interface PolyMallService {

    /**
     * 验参
     *
     * @param request common request
     */
    void checkRequest(PolyMallCommonRequest request) throws PolyMallException;

    /**
     * 验签
     *
     * @param request common request
     */
    void checkSign(PolyMallCommonRequest request) throws PolyMallException;

    /**
     * 验参验签
     *
     * @param request common request
     */
    void checkRequestAndSign(PolyMallCommonRequest request) throws PolyMallException;

}
