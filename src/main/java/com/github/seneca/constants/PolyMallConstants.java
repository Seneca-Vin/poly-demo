package com.github.seneca.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 10:29
 * @description: 菠萝派电商常量
 */
public class PolyMallConstants {

    public static List<String> supportedMethodList = new ArrayList<>();

    /**
     * 返回常量.
     */
    public static class Response {
        public static final String SEND_SUCCESS = "发货成功";
    }

    /**
     * 方法常量.
     */
    public static class Method {
        /**
         * 订单查询.
         */
        public static final String ORDER = "Differ.JH.Business.GetOrder";
        /**
         * 订单退款状态查询.
         */
        public static final String CHECK_REFUND = "Differ.JH.Business.CheckRefundStatus";
        /**
         * 订单发货
         */
        public static final String SEND = "Differ.JH.Business.Send";
        /**
         * 商品查询
         */
        public static final String DOWNLOAD_PRODUCT = "Differ.JH.Business.DownloadProduct";
        /**
         * 商品库存同步
         */
        public static final String SYNC_STOCK = "Differ.JH.Business.SyncStock";
        /**
         * 退货退款单下载
         */
        public static final String REFUND = "Differ.JH.Business.GetRefund";
    }

    static {
        supportedMethodList.add(Method.ORDER);
        supportedMethodList.add(Method.CHECK_REFUND);
        supportedMethodList.add(Method.SEND);
        supportedMethodList.add(Method.DOWNLOAD_PRODUCT);
        supportedMethodList.add(Method.SYNC_STOCK);
        supportedMethodList.add(Method.REFUND);
    }

    //获取支持的方法集合
    public static List<String> acquireSupportedMethod() {
        return supportedMethodList;
    }

}
