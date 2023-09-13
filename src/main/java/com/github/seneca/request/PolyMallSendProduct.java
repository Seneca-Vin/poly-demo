package com.github.seneca.request;

import lombok.Data;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 订单发货商品
 */
@Data
public class PolyMallSendProduct extends PolyMallCommonRequest {

    /**
     * 是否必填:    可选
     * 描述:  平台商品id
     * 示例值: 99
     */
    private String PlatProductId;
    /**
     * 是否必填:    可选
     * 描述:  批号
     * 示例值: agbiagharbg
     */
    private String batchNum;
    /**
     * 是否必填:    可选
     * 描述:  有效期
     * 示例值: LogisticType
     */
    private String validityTime;
    /**
     * 是否必填:    可选
     * 描述:  货品备注
     * 示例值: LogisticNo
     */
    private String Remark;
    /**
     * 是否必填:    可选
     * 描述:  子订单号(对应抓到请求里面SubOrderNo)
     * 示例值: oid
     */
    private String SubOrderNo;
    /**
     * 是否必填:    可选
     * 描述:  skuId
     * 示例值: 3111
     */
    private Integer SkuId;

}
