package com.github.seneca.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城订单bean
 */
@Data
public class PolyMallOrderProduct implements Serializable {
    /**
     * 是否必填:    必填
     * 描述:  平台商品ID或SKUID(SKUID优先)（此为平台自动生成的编码或者序号）
     * 示例值: 1231（不能为0）
     */
    private String ProductId;
    /**
     * 是否必填:    必填
     * 描述:  子订单号（若不填，ERP里用户拆单后会无法发货,对应的是subplatorderno）（拆单逻辑是按照商品来拆分，有几种商品就有几个子订单号。子订单号可以填写货品编码或者sku的编码只要保证同一主订单号下不重复即可）
     * 示例值: 2017shoe43
     */
    private String suborderno;
    /**
     * 是否必填:    必填
     * 描述:  货品编码或SKU编码(SKU编码优先)。（一般单规格商品返回货品编码，多规格商品返回能对应到该商品某一子规格的子规格编码。）（用于网店管家对接吉客云可以不传）
     * 示例值: 2017shoe43
     */
    private String tradegoodsno;
    /**
     * 是否必填:    必填
     * 描述:  平台商品ID（用于吉客云对接）
     * 示例值: 确保唯一
     */
    private String platgoodsid;
    /**
     * 是否必填:    必填
     * 描述:  平台规格ID（用于吉客云对接）
     * 示例值: 确保唯一
     */
    private String platskuid;
    /**
     * 是否必填:    必填
     * 描述:  外部商家编码（用于吉客云对接）
     * 示例值: 商家在电商平台手动维护的货品编码
     */
    private String OutItemID;
    /**
     * 是否必填:    必填
     * 描述:  外部规格编码（用于吉客云对接）
     * 示例值: 商家在电商平台手动维护的货品规格编码
     */
    private String OutSkuID;
    /**
     * 是否必填:    必填
     * 描述:  交易商品名称
     * 示例值: 新款连衣裙
     */
    private String tradegoodsname;
    /**
     * 是否必填:    必填
     * 描述:  交易商品规格
     * 示例值: 颜色：白，尺寸：XL
     */
    private String tradegoodsspec;
    /**
     * 是否必填:    必填
     * 描述:  商品数量
     * 示例值: 1
     */
    private int goodscount;
    /**
     * 是否必填:    必填
     * 描述:  单价
     * 示例值: 500
     */
    private BigDecimal price;
    /**
     * 是否必填:    可选
     * 描述:  是否是赠品
     * 示例值: 1是，0不是
     */
    private int isgift;
    /**
     * 是否必填:    可选
     * 描述:  子订单优惠金额（按照商品级别拆单）
     * 示例值: 订单中某商品单价50数量6，优惠20，该子订单金额合计为50*6-20=280
     */
    private BigDecimal discountmoney;
    /**
     * 是否必填:    可选
     * 描述:  子订单商品税费
     * 示例值: 12.21
     */
    private BigDecimal taxamount;
    /**
     * 是否必填:    可选
     * 描述:  定制信息
     * 示例值: XXXXX
     */
    private String Customization;
    /**
     * 是否必填:    可选
     * 描述:  退款状态(没有退款=JH_07，买家已经申请退款等待卖家同意=JH_01，卖家已经同意退款等待买家退货=JH_02，买家已经退货等待卖家确认收货=JH_03，卖家拒绝退款=JH_04，退款关闭=JH_05，退款成功=JH_06，其他=JH_99)
     * 示例值: JH_01
     */
    private String refundStatus;
    /**
     * 是否必填:    可选
     * 描述:  子订单交易状态(其他=JH_99，等待买家付款=JH_01，等待卖家发货=JH_02，等待买家确认收货=JH_03，交易成功=JH_04，交易关闭=JH_05)
     * 示例值: JH_01
     */
    private String Status;
    /**
     * 是否必填:    可选
     * 描述:  货品备注
     * 示例值: 记得检查
     */
    private String remark;
}
