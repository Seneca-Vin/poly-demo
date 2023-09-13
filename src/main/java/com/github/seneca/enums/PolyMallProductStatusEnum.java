package com.github.seneca.enums;

import lombok.Getter;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派商城商品状态
 */
public enum PolyMallProductStatusEnum {
    JH_01("JH_01", "已上架商品"),
    JH_02("JH_02", "已下架商品"),
    JH_99("JH_99", "所有商品");

    @Getter
    private final String code;

    @Getter
    private final String desc;

    PolyMallProductStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
