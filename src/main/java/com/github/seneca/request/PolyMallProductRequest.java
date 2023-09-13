package com.github.seneca.request;

import com.github.seneca.constants.PolyConstants;
import com.github.seneca.enums.PolyErrorCodeEnum;
import com.github.seneca.enums.PolyMallProductStatusEnum;
import com.github.seneca.exception.PolyMallException;
import lombok.Data;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.io.Serializable;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 商品下载
 */
@Data
public class PolyMallProductRequest extends PolyMallCommonRequest {
    /**
     * 是否必填:    可选
     * 描述:  商品外部商家编码（注，目前尚未支持此参数的查询）
     * 示例值: 2017shoe
     */
    private String ProductId;
    /**
     * 是否必填:    可选
     * 描述:  商品名称
     * 示例值: 牙刷
     */
    private String ProductName;
    /**
     * 是否必填:    可选
     * 描述:  商品状态(已上架商品=JH_01，已下架商品=JH_02，所有商品=JH_99)
     * 示例值: JH_01
     */
    private String Status;
    /**
     * 必填
     * 页码
     * 示例值: 1
     */
    private Integer PageIndex;
    /**
     * 必填
     * 每页条数（默认30）
     * 示例值: 30
     */
    private Integer PageSize;

    public void checkRequest() throws PolyMallException {
        //校验分页
        if (null == this.PageIndex || null == this.PageSize || PolyConstants.PAGE_SIZE_MAX < this.PageSize) {
            throw new PolyMallException(PolyErrorCodeEnum.PAGE_ERROR.getCode(), PolyErrorCodeEnum.PAGE_ERROR.getDesc());
        }
        //检验商品状态
        if (StringUtils.isNotEmpty(this.Status) && !EnumUtils.isValidEnum(PolyMallProductStatusEnum.class, this.Status)) {
            throw new PolyMallException(PolyErrorCodeEnum.BIZ_ERROR.getCode(), PolyErrorCodeEnum.BIZ_ERROR.getDesc());
        }
        //校验ProductId是否为数字
        if (StringUtils.isNotEmpty(this.ProductId) && !NumberUtils.isCreatable(this.ProductId)) {
            throw new PolyMallException(PolyErrorCodeEnum.BIZ_ERROR.getCode(), PolyErrorCodeEnum.BIZ_ERROR.getDesc());
        }
    }
}
