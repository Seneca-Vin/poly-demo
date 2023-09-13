package com.github.seneca.enums;

import lombok.Getter;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派错误码
 */
public enum PolyErrorCodeEnum {

    // ——————————————————公共错误——————————————————
    COMPANY_ERROR("COMPANY_ERROR", "匹配公司失败，请联系我方负责人检查公司仓库配置信息！"),
    APPKEY_ERROR("APPKEY_ERROR", "appkey校验错误！"),
    TOKEN_ERROR("TOKEN_ERROR", "token校验错误！"),
    PARAMS_ERROR("PARAMS_EMPTY", "请求参数不能为空！"),
    METHOD_EMPTY("METHOD_EMPTY", "方法不能为空！"),
    METHOD_ERROR("METHOD_ERROR", "不支持的方法！"),
    SIGN_EMPTY("SIGN_EMPTY", "签名不能为空！"),
    SIGN_ERROR("SIGN_ERROR", "签名校验错误！"),

    // ——————————————————请求错误——————————————————
    PAGE_ERROR("PAGE_ERROR", "分页参数不合法！"),
    BIZ_ERROR("BIZ_ERROR", "业务参数不合法！"),

    // ——————————————————系统错误——————————————————
    SYSTEM_ERROR("SYSTEM_ERROR", "系统异常,请稍后再试!");

    @Getter
    private final String code;
    @Getter
    private final String desc;

    PolyErrorCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }


}
