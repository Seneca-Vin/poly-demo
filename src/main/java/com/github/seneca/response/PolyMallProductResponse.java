package com.github.seneca.response;

import lombok.Data;

import java.util.List;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 商品下载response
 */
@Data
public class PolyMallProductResponse extends PolyMallCommonResponse {
    /**
     * 是否必填:    必填
     * 描述:  商品总数量(默认值：1)
     * 示例值: 1
     */
    private int totalcount;
    /**
     * 是否必填:    必填
     * 描述:  订单 集合 若没有订单也必须返回空数组
     * 示例值: []
     */
    private List<PolyMallProduct> goodslist;

}
