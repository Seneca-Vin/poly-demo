package com.github.seneca.response;

import lombok.Data;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 库存同步
 */
@Data
public class PolyMallSyncStockResponse extends PolyMallCommonResponse {

    /**
     * 是否必填:    必填
     * 描述:  更新后的数量
     * 示例值: 180
     */
    private Integer Quantity;

}
