package com.github.seneca.response;

import lombok.*;

import java.io.Serializable;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城公共response
 */
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PolyMallCommonResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 返回码
     * 示例值:只能返回 成功：10000 或 失败：40000,
     */
    private String code;
    /**
     * 返回消息
     * 示例值:成功：SUCCESS；失败：错误信息
     */
    private String message;
    /**
     * 错误子码（无错误信息可以不反回）
     * 示例值:LXO.OpenMall.REQUEST_FAIL
     */
    private String subcode;
    /**
     * 错误详细信息
     * 示例值:Appkey不能为空
     */
    private String submessage;

}
