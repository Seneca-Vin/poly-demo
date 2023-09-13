package com.github.seneca.request;

import com.github.seneca.enums.PolyErrorCodeEnum;
import com.github.seneca.exception.PolyMallException;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 订单发货
 */
@Data
public class PolyMallSendRequest extends PolyMallCommonRequest {

    /**
     * 是否必填:    可选
     * 描述:  配送方式
     * JH_ExpressSend=快递，JH_FetchSend=到店自提，JH_LocalSend=同城配送，JH_PlatSend=平台配送，JH_BusinessMen=商家配送
     * 示例值: JH_ExpressSend
     */
    private String SendType;
    /**
     * 是否必填:    必填
     * 描述:  物流公司名称
     * 示例值: 圆通快递
     */
    private String LogisticName;
    /**
     * 是否必填:    必填
     * 描述:  快递类别(JH前缀为国内快递 ，JHI为国际快递)详见物流公司代码对照表
     * 示例值: LogisticType
     */
    private String LogisticType;
    /**
     * 是否必填:    必填
     * 描述:  快递运单号（无需物流则返回空）
     * 示例值: LogisticNo
     */
    private String Logisticno;
    /**
     * 是否必填:    必填
     * 描述:  平台订单号
     * 示例值: NO2545661
     */
    private String PlatOrderNo;
    /**
     * 是否必填:    必填
     * 描述:  是否拆单发货(拆单=1 ，不拆单=0)
     * 示例值: 0
     */
    private Integer IsSplit;
    /**
     * 是否必填:    可选
     * 描述:  平台子订单交易单号，支持订单拆分为不同商品不同数量发货,多个商品用"|"隔开, 为空则视为整单发货包含子订单编号和商品发货数量，格式suborderno1:count1|suborderno2:count2发货数量需为大于0的整数（无需物流场景、无拆单发货该字段返回空）
     * 示例值: 2017shoe43:2|2017shoe44:5
     */
    private String SubPlatOrderNo;
    /**
     * 是否必填:    可选
     * 描述:  发货人姓名
     * 示例值: 张三
     */
    private String SenderName;
    /**
     * 是否必填:    可选
     * 描述:  发货人联系电话
     * 示例值: 15047788954
     */
    private String SenderTel;
    /**
     * 是否必填:    可选
     * 描述:  发货人地址(省市区之间以空格分隔)
     * 示例值: 上海 上海市 宝山区 逸仙路2816号华滋奔腾大厦A栋14楼
     */
    private String SenderAddress;
    /**
     * 是否必填:    可选
     * 描述:  是否为海外购(是=1；否=0)
     * 示例值: 1
     */
    private Integer IsHwgFlag;
    /**
     * 是否必填:    可选
     * 描述:  商品识别码
     * 示例值: 序列号
     */
    private String Feature;

    /**
     * 是否必填:    可选
     * 描述: 商品集合
     * 示例值:
     */
    private List<PolyMallSendProduct> Goods;

    @Override
    public void checkRequest() throws PolyMallException {
        if (StringUtils.isBlank(this.LogisticName)) {
            throw new PolyMallException(PolyErrorCodeEnum.BIZ_ERROR.getCode(), PolyErrorCodeEnum.BIZ_ERROR.getDesc());
        }
        if (StringUtils.isBlank(this.LogisticType)) {
            throw new PolyMallException(PolyErrorCodeEnum.BIZ_ERROR.getCode(), PolyErrorCodeEnum.BIZ_ERROR.getDesc());
        }
        if (StringUtils.isBlank(this.Logisticno)) {
            throw new PolyMallException(PolyErrorCodeEnum.BIZ_ERROR.getCode(), PolyErrorCodeEnum.BIZ_ERROR.getDesc());
        }
        if (StringUtils.isBlank(this.PlatOrderNo)) {
            throw new PolyMallException(PolyErrorCodeEnum.BIZ_ERROR.getCode(), PolyErrorCodeEnum.BIZ_ERROR.getDesc());
        }
        if (null == this.IsSplit) {
            throw new PolyMallException(PolyErrorCodeEnum.BIZ_ERROR.getCode(), PolyErrorCodeEnum.BIZ_ERROR.getDesc());
        }
    }
}
