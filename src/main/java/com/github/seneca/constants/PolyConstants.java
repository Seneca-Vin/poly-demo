package com.github.seneca.constants;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 10:29
 * @description: 菠萝派公共常量
 */
public class PolyConstants {

    /**
     * 最大条数
     */
    public static final int PAGE_SIZE_MAX = 100;

    /**
     * 返回常量.
     */
    public static class Response {
        public static final String FAIL_MESSAGE = "FAIL";
        public static final String SUCCESS_MESSAGE = "SUCCESS";
        public static final String SUCCESS_CODE = "10000";
        public static final String FAIL_CODE = "40000";
    }

    /**
     * 签名常量.
     */
    public static class DeclaredField {
        public static final String APPKEY = "appkey";
        public static final String TOKEN = "token";
        public static final String BIZCONTENT = "bizcontent";
        public static final String METHOD = "method";
    }

}
