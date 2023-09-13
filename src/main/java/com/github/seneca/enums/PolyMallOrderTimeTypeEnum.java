package com.github.seneca.enums;

import lombok.Getter;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派商城订单时间类型
 */
public enum PolyMallOrderTimeTypeEnum {
    JH_01("JH_01", "修改时间"),
    JH_02("JH_02", "订单创建时间");

    @Getter
    private final String code;

    @Getter
    private final String desc;

    PolyMallOrderTimeTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
