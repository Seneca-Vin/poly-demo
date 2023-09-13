package com.github.seneca.enums;

import lombok.Getter;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城售后状态码
 */
public enum PolyMallRefundStatusEnum {

    JH_01("JH_01", "买家已经申请退款等待卖家同意"),
    JH_02("JH_02", "卖家已经同意退款等待买家退货"),
    JH_03("JH_03", "买家已经退货等待卖家确认收货"),
    JH_04("JH_04", "卖家拒绝退款"),
    JH_05("JH_05", "退款关闭"),
    JH_06("JH_06", "退款成功"),
    JH_07("JH_07", "没有退款"),
    JH_09("JH_09", "部分退款"),
    JH_99("JH_99", "其他");

    @Getter
    private final String code;

    @Getter
    private final String desc;

    PolyMallRefundStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
