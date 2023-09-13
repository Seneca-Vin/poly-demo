package com.github.seneca.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城异常
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PolyMallException extends Exception {
    private static final long serialVersionUID = 2214381471513460742L;
    /**
     * 错误代码.
     */
    private String code;
    /**
     * 错误代码描述.
     */
    private String desc;

    public PolyMallException(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
