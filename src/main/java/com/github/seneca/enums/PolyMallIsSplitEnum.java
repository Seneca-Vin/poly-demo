package com.github.seneca.enums;

import lombok.Getter;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派城市enum
 */
public enum PolyMallIsSplitEnum {
    SPLIT(1, "拆单"),
    NO_SPLIT(0, "不拆单");

    @Getter
    private final Integer name;
    @Getter
    private final String code;

    PolyMallIsSplitEnum(Integer name, String code) {
        this.name = name;
        this.code = code;
    }
}
