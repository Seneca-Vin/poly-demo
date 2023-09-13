package com.github.seneca.request;

import com.github.seneca.constants.PolyConstants;
import com.github.seneca.enums.PolyErrorCodeEnum;
import com.github.seneca.enums.PolyMallOrderStatusEnum;
import com.github.seneca.enums.PolyMallOrderTimeTypeEnum;
import com.github.seneca.exception.PolyMallException;
import lombok.Data;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城订单下载request
 */
@Data
public class PolyMallOrderRequest extends PolyMallCommonRequest {
    /**
     * 是否必填:    条件
     * <p>
     * 描述:  订单交易状态
     * (等待买家付款=JH_01，等待卖家发货=JH_02，等待买家确认收货=JH_03，
     * 交易成功=JH_04，交易关闭=JH_05，其他=JH_98（根据订单号查详情时）
     * ，所有订单=JH_99)（目前会抓取JH_01,JH_02,JH_05三种状态的订单, 但ERP只会处理JH_02待发货的订单）
     * <p>
     * 示例值: JH_02
     */
    private String OrderStatus;
    /**
     * 是否必填:
     * 描述:  平台订单号，若不为空，则代表查询单个订单的数据，查询单个订单时，可不传时间、状态等
     * 示例值: NO2545661
     */
    private String PlatOrderNo;
    /**
     * 开始时间(格式:yyyy-MM-dd HH:mm:ss)
     * 示例值: 2016-06-15 12:23:32
     */
    private Date StartTime;
    /**
     * 截止时间(格式:yyyy-MM-dd HH:mm:ss)
     * 示例值: 2016-07-15 08:32:00
     */
    private Date EndTime;
    /**
     * 订单时间类别(订单修改时间=JH_01，订单创建时间=JH_02) (ERP抓单默认JH_02)
     * 示例值: JH_02
     */
    private String TimeType;
    /**
     * 必填
     * 页码
     * 示例值: 1
     */
    private Long PageIndex;
    /**
     * 必填
     * 每页条数（默认30）
     * 示例值: 30
     */
    private Long PageSize;

    @Override
    public void checkRequest() throws PolyMallException {
        //校验分页
        if (null == this.PageSize || null == this.PageIndex || PolyConstants.PAGE_SIZE_MAX < this.PageSize) {
            throw new PolyMallException(PolyErrorCodeEnum.PAGE_ERROR.getCode(), PolyErrorCodeEnum.PAGE_ERROR.getDesc());
        }
        //校验传参是否合法
        if (!EnumUtils.isValidEnum(PolyMallOrderTimeTypeEnum.class, this.TimeType)
                || !EnumUtils.isValidEnum(PolyMallOrderStatusEnum.class, this.OrderStatus)) {
            throw new PolyMallException(PolyErrorCodeEnum.BIZ_ERROR.getCode(), PolyErrorCodeEnum.BIZ_ERROR.getDesc());
        }
        //如果传了订单号 代表查这条订单数据 则其他参数置空
        if (StringUtils.isNotBlank(this.PlatOrderNo)) {
            this.setEndTime(null);
            this.setStartTime(null);
            this.setOrderStatus(null);
            this.setPlatOrderNo(null);
            this.setTimeType(null);
        }
    }

}
