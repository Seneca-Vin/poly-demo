package com.github.seneca.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 商品下载 商品bean
 */
@Data
public class PolyMallProduct implements Serializable {
    /**
     * 是否必填:    必填
     * 描述:  平台商品ID（此为平台自动生成的编码或者序号）
     * 示例值: 123
     */
    private String PlatProductID;
    /**
     * 是否必填:    必填
     * 描述:  商品名称
     * 示例值: 鞋子
     */
    private String name;
    /**
     * 是否必填:    必填
     * 描述:  货品编码（商家编码），能够对应到某一货品。此为编码 一般为商家自己填写。
     * 示例值: 2017shoe
     */
    private String OuterID;
    /**
     * 是否必填:    必填
     * 描述:  单价
     * 示例值: 500
     */
    private BigDecimal price;
    /**
     * 是否必填:    必填
     * 描述:  商品数量
     * 示例值: 1
     */
    private int num;
    /**
     * 是否必填:    可选
     * 描述:  图片URL
     * 示例值: http://img.abc.com/20151.jpg
     */
    private String pictureurl;
    /**
     * 是否必填:    可选
     * 描述:  商品所在仓库编号
     * 示例值: KU002
     */
    private String whsecode;
    /**
     * 是否必填:    必填
     * 描述:  规格 集合（若商家无多规格商品可以不写）
     * 示例值: []
     */
    private List<PolyMallProductGoods> skus;
}
