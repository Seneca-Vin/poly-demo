package com.github.seneca.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 商品下载 商品 sku bean
 */
@Data
public class PolyMallProductGoods implements Serializable {
    /**
     * 是否必填:    必填
     * 描述:  平台规格ID（此为平台自动生成的编码或者序号)
     * 示例值: 01231
     */
    private String SkuID;
    /**
     * 是否必填:    必填
     * 描述:  子规格编码，能够对应到某主商品下的子规格的编码。此为编码 一般为商家自己填写。
     * 示例值: 2017shoe43
     */
    private String skuOuterID;
    /**
     * 是否必填:    必填
     * 描述:  规格价格
     * 示例值: 500
     */
    private BigDecimal skuprice;
    /**
     * 是否必填:    必填
     * 描述:  规格数量
     * 示例值: 1
     */
    private int skuQuantity;
    /**
     * 是否必填:    必填
     * 描述:  规格名称
     * 示例值: 大号
     */
    private String skuname;
    /**
     * 是否必填:    可选
     * 描述:  规格属性
     * 示例值: 170cm
     */
    private String skuproperty;
    /**
     * 是否必填:    可选
     * 描述:  规格图片URL
     * 示例值: http://img.18bg.com/2015-12/31/2015123109351.3719.jpg
     */
    private String skupictureurl;
}
