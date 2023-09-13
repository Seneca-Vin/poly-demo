package com.github.seneca.request;

import com.github.seneca.enums.PolyErrorCodeEnum;
import com.github.seneca.exception.PolyMallException;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 库存同步
 */
@Data
public class PolyMallSyncStockRequest extends PolyMallCommonRequest {
    /**
     * 是否必填:    必填
     * 描述:  平台商品ID
     * 示例值: 11447876487218
     */
    private String PlatProductID;
    /**
     * 是否必填:    可选
     * 描述:  平台子规格ID
     * 示例值: 114478764
     */
    private String SkuID;
    /**
     * 是否必填:    可选
     * 描述:  外部商家编码
     * 示例值: WR6685851555
     */
    private String OuterID;
    /**
     * 是否必填:    必填
     * 描述:  库存数量
     * 示例值: 180
     */
    private Integer Quantity;
    /**
     * 是否必填:    可选
     * 描述:  外部商家编码
     * 示例值: WR6685851555
     */
    private String OutSkuID;
    /**
     * 是否必填:    可选
     * 描述:  库存详情（冒号后面都是跟着对应数量）支持管家 1代表库存量  2代表订购量 3代表：待发货量 4 代表采购在途数量5代表调入在途数量7 3天内已付款和货到付款原始单占用量 8 唯品会占用量 9云集pop占用量 0 未付款数量
     * 示例值: 1:423.00;2:0.00;3:2.00;7:0;8:0;9:0;0:0;
     */
    private String DetailQuantity;
    /**
     * 是否必填:    可选
     * 描述:  仓库编码
     * 示例值: 12
     */
    private String WhseCode;
    /**
     * 是否必填:    可选
     * 描述:  仓库名称
     * 示例值: 111
     */
    private String WhseName;

    public void checkRequest() throws PolyMallException {
        //校验必填项
        if (StringUtils.isEmpty(this.PlatProductID) || null == this.Quantity) {
            throw new PolyMallException(PolyErrorCodeEnum.BIZ_ERROR.getCode(), PolyErrorCodeEnum.BIZ_ERROR.getDesc());
        }
    }

}
