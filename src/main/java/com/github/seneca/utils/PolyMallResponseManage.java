package com.github.seneca.utils;

import com.github.seneca.constants.PolyConstants;
import com.github.seneca.constants.PolyMallConstants;
import com.github.seneca.enums.PolyMallRefundStatusEnum;
import com.github.seneca.response.*;
import lombok.Data;

import java.util.List;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城manage
 */
@Data
public class PolyMallResponseManage {

    /**
     * common fail common response
     *
     * @param subcode
     * @param submessage
     * @return
     */
    public static PolyMallCommonResponse fail(String subcode, String submessage) {
        PolyMallCommonResponse response = new PolyMallCommonResponse();
        response.setCode(PolyConstants.Response.FAIL_CODE);
        response.setMessage(PolyConstants.Response.FAIL_MESSAGE);
        response.setSubcode(subcode);
        response.setSubmessage(submessage);
        return response;
    }

    /**
     * order success response.
     *
     * @return
     */
    public static PolyMallOrderResponse orderSuccess(List<PolyMallOrder> orderList, Long numtotalorder) {
        PolyMallOrderResponse response = new PolyMallOrderResponse();
        response.setOrders(orderList);
        response.setNumtotalorder(numtotalorder);
        response.setCode(PolyConstants.Response.SUCCESS_CODE);
        response.setMessage(PolyConstants.Response.SUCCESS_MESSAGE);
        response.setSubmessage(null);
        response.setSubcode(null);
        return response;
    }

    /**
     * none refund success response.
     *
     * @return
     */
    public static PolyMallRefundResponse noneRefund() {
        PolyMallRefundResponse response = new PolyMallRefundResponse();
        response.setRefundStatus(PolyMallRefundStatusEnum.JH_07.getCode());
        response.setRefundStatusdescription(PolyMallRefundStatusEnum.JH_07.getDesc());
        response.setCode(PolyConstants.Response.SUCCESS_CODE);
        response.setMessage(PolyConstants.Response.SUCCESS_MESSAGE);
        response.setSubmessage(PolyMallRefundStatusEnum.JH_07.getDesc());
        return response;
    }

    /**
     * send refund success response.
     *
     * @return
     */
    public static PolyMallCommonResponse sendSuccess() {
        PolyMallCommonResponse response = new PolyMallCommonResponse();
        response.setCode(PolyConstants.Response.SUCCESS_CODE);
        response.setMessage(PolyConstants.Response.SUCCESS_MESSAGE);
        response.setSubmessage(PolyMallConstants.Response.SEND_SUCCESS);
        return response;
    }

    /**
     * sync stock success response.
     *
     * @return
     */
    public static PolyMallCommonResponse syncStockSuccess(Integer quantity) {
        PolyMallSyncStockResponse response = new PolyMallSyncStockResponse();
        response.setCode(PolyConstants.Response.SUCCESS_CODE);
        response.setMessage(PolyConstants.Response.SUCCESS_MESSAGE);
        response.setQuantity(quantity);
        return response;
    }

    /**
     * download product success response.
     *
     * @return
     */
    public static PolyMallCommonResponse downloadProductSuccess(int totalcount, List<PolyMallProduct> goodslist) {
        PolyMallProductResponse response = new PolyMallProductResponse();
        response.setCode(PolyConstants.Response.SUCCESS_CODE);
        response.setMessage(PolyConstants.Response.SUCCESS_MESSAGE);
        response.setTotalcount(totalcount);
        response.setGoodslist(goodslist);
        return response;
    }


}
