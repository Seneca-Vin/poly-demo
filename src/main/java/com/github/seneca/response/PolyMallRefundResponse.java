package com.github.seneca.response;

import lombok.Data;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 售后监测
 */
@Data
public class PolyMallRefundResponse extends PolyMallCommonResponse {

    /**
     * 是否必填:    必填
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

    /**
     * 是否必填:    可选
     * 描述:  子订单退款状态 集合
     * 示例值:
     */
//    private List<PolyMallRefund> childrenrefundStatus;

}
