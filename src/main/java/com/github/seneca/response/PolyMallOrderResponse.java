package com.github.seneca.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城订单response
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolyMallOrderResponse extends PolyMallCommonResponse {
    /**
     * 是否必填:    必填
     * 描述:  订单总数量(这里返回的是符合条件的所有订单的总数，而不是当页订单的数量
     * ，例如总数为51，请求参数中每页为30，则应返回51)。第一页会去取两次，
     * 第一次去是为了获取订单总数，第二次去取才会按照正常分页走。
     * 示例值: 51
     */
    private Long numtotalorder;
    /**
     * 是否必填:    必填
     * 描述:  订单 集合 若没有订单也必须返回空数组
     * 示例值: []
     */
    private List<PolyMallOrder> orders;

}
