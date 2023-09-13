package com.github.seneca.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派订单bean
 */
@Data
public class PolyMallRefund implements Serializable {
    /**
     * 是否必填:    可选
     * 描述:  子订单号（拆单逻辑是按照商品来拆分，有几种商品就有几个子订单号，子订单号可以填写货品编码或者sku的编码只要保证同一主订单号下不重复即可）
     * 示例值:
     */
    private String Suborderno;
    /**
     * 是否必填:    可选
     * 描述:  退款订单号
     * 示例值: RO2545661
     */
    private String refundno;
    /**
     * 是否必填:    可选
     * 描述:  商品名称
     * 示例值: 鞋子
     */
    private String ProductName;
    /**
     * 是否必填:    可选
     * 描述:  退款状态(没有退款=JH_07，买家已经申请退款等待卖家同意=JH_01，卖家已经同意退款等待买家退货=JH_02，买家已经退货等待卖家确认收货=JH_03，卖家拒绝退款=JH_04，退款关闭=JH_05，退款成功=JH_06，JH_09=部分退款，其他=JH_99)
     * 示例值: JH_01
     */
    private String refundStatus;
    /**
     * 是否必填:    可选
     * 描述:  退款状态说明
     * 示例值: 退款中
     */
    private String refundStatusdescription;
}
