package com.github.seneca.controller.biz;

import com.github.seneca.constants.PolyMallConstants;
import com.github.seneca.enums.PolyErrorCodeEnum;
import com.github.seneca.exception.PolyMallException;
import com.github.seneca.request.PolyMallCommonRequest;
import com.github.seneca.response.PolyMallCommonResponse;
import com.github.seneca.service.PolyMallOrderService;
import com.github.seneca.service.PolyMallService;
import com.github.seneca.utils.PolyMallResponseManage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@Slf4j
public class PolyMallBiz {
    @Autowired
    private PolyMallService service;

    @Autowired
    private PolyMallOrderService polyMallOrderService;

    /**
     * 菠萝派商城统一入口
     *
     * @param request
     * @param servletRequest
     * @return
     */
    public PolyMallCommonResponse action(PolyMallCommonRequest request, HttpServletRequest servletRequest) {
        try {
            service.checkRequestAndSign(request);

            switch (request.getMethod()) {
                case PolyMallConstants.Method.ORDER:
                    return polyMallOrderService.queryOrders(request);
                case PolyMallConstants.Method.CHECK_REFUND:
                    return polyMallOrderService.checkRefund(request);
                case PolyMallConstants.Method.SEND:
                    return polyMallOrderService.send(request);
            }
        } catch (PolyMallException e) {
            log.error("[PolyMallBiz][action]菠萝派mall业务异常：{}，请求：{}", e.getDesc(), request.toString());
            return PolyMallResponseManage.fail(e.getCode(), e.getDesc());
        } catch (Exception e) {
            log.error("[PolyMallBiz][action]菠萝派mall系统异常：{}，请求：{}", e, request.toString());
            return PolyMallResponseManage.fail(PolyErrorCodeEnum.SYSTEM_ERROR.getCode(), PolyErrorCodeEnum.SYSTEM_ERROR.getDesc());
        }

        return PolyMallResponseManage.fail(PolyErrorCodeEnum.METHOD_ERROR.getCode(), PolyErrorCodeEnum.METHOD_ERROR.getDesc());
    }

}
