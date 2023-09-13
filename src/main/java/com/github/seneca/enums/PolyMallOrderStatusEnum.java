package com.github.seneca.enums;

import lombok.Getter;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派商城订单状态enum
 */
public enum PolyMallOrderStatusEnum {
    JH_01("JH_01", "等待买家付款"),
    JH_02("JH_02", "等待卖家发货"),
    JH_03("JH_03", "等待买家确认收货"),
    JH_04("JH_04", "交易成功"),
    JH_05("JH_05", "交易关闭"),
    JH_08("JH_08", "卖家部分发货");

    @Getter
    private final String code;

    @Getter
    private final String desc;

    PolyMallOrderStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
