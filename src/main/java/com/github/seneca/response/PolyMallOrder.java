package com.github.seneca.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 16:54
 * @description: 菠萝派自建商城订单bean
 */
@Data
public class PolyMallOrder implements Serializable {

    /**
     * ？接口文档的json和文档内容不匹配的字段，不知道是什么字段
     */
    private int couponprice;

    /**
     * 是否必填:    必填
     * 描述:  订单号
     */
    private String PlatOrderNo;
    /**
     * 是否必填:    必填
     * 描述:  订单交易状态
     * (等待买家付款=JH_01，等待卖家发货=JH_02，等待买家确认收货=JH_03，
     * 交易成功=JH_04，交易关闭=JH_05，其他=JH_98（根据订单号查详情时）
     * ，所有订单=JH_99)（目前会抓取JH_01,JH_02,JH_05三种状态的订单, 但ERP只会处理JH_02待发货的订单）
     */
    private String tradeStatus;
    /**
     * 是否必填:    可选
     * 描述:  订单交易说明
     * 示例值: 等待卖家发货
     */
    private String tradeStatusdescription;
    /**
     * 是否必填:    必填
     * 描述:  交易时间(格式:yyyy-MM-dd HH:mm:ss) 起始时间格式不可以为0000-00-00
     * 示例值: 1900-01-01 00:00:00
     */
    private String tradetime;
    /**
     * 是否必填:    可选
     * 描述:  支付单号（跨境场景必填，申报海关用的支付流水号）
     * 示例值: 60551570518
     */
    private String payorderno;
    /**
     * 是否必填:    可选
     * 描述:  支付申报单号
     * 示例值: 60551570518
     */
    private String innerTransactionId;
    /**
     * 是否必填:    可选
     * 描述:  国家二位简码或国家名称
     * 示例值: CN
     */
    private String country;
    /**
     * 是否必填:   必填
     * 描述:  州/省
     * 示例值: 浙江省
     */
    private String province;
    /**
     * 是否必填:   必填
     * 描述:  城市
     * 示例值: 杭州市
     */
    private String city;
    /**
     * 是否必填:   必填
     * 描述:  区县
     * 示例值: 西湖区
     */
    private String area;
    /**
     * 是否必填:   可选
     * 描述:  镇/街道
     * 示例值: 三墩镇
     */
    private String town;
    /**
     * 是否必填:    必填
     * 描述:  地址
     * 示例值: 尚坤生态创业园A211
     */
    private String address;
    /**
     * 是否必填:    可选
     * 描述:  邮编
     * 示例值: 310000
     */
    private String zip;
    /**
     * 是否必填:    必填
     * 描述:  电话（电话、手机必填一个）
     * 示例值: 0571-89845712
     */
    private String phone;
    /**
     * 是否必填:    必填
     * 描述:  手机（电话、手机必填一个）
     * 示例值: 15067888888
     */
    private String mobile;
    /**
     * 是否必填:    可选
     * 描述:  Email
     * 示例值: differ@test.com
     */
    private String email;
    /**
     * 是否必填:    可选
     * 描述:  买家备注
     * 示例值: 包装好
     */
    private String customerremark;
    /**
     * 是否必填:    可选
     * 描述:  卖家备注
     * 示例值: 我会的
     */
    private String sellerremark;
    /**
     * 是否必填:    可选
     * 描述:  邮资
     * 示例值: 0
     */
    private BigDecimal postfee;
    /**
     * 是否必填:    必填
     * 描述:  货款金额
     * 示例值: 500
     */
    private BigDecimal goodsfee;
    /**
     * 是否必填:    必填
     * 描述:  合计应收（针对卖家）
     * 示例值: 500
     */
    private BigDecimal totalmoney;
    /**
     * 是否必填:    可选
     * 描述:  实际支付金额（用户支付金额，已减去优惠金额，开发票给用户时可用此金额）
     * 示例值: 500
     */
    private BigDecimal realpaymoney;
    /**
     * 是否必填:    必填
     * 描述:  订单优惠金额（针对整个订单的优惠）
     * 示例值: 100
     */
    private BigDecimal favourablemoney;
    /**
     * 是否必填:    可选
     * 描述:  平台优惠金额（由平台承担，优惠金额平台会返给商家，开发票给平台时可使用此金额）
     * 示例值: 100
     */
    private BigDecimal platdiscountmoney;
    /**
     * 是否必填:    可选
     * 描述:  佣金
     * 示例值: 10
     */
    private BigDecimal commissionvalue;
    /**
     * 是否必填:    可选
     * 描述:  订单税费总额
     * 示例值: 77.21
     */
    private BigDecimal taxamount;
    /**
     * 是否必填:    可选
     * 描述:  订单关税金额
     * 示例值: 77.21
     */
    private BigDecimal tariffamount;
    /**
     * 是否必填:    可选
     * 描述:  订单增值税金额
     * 示例值: 77.21
     */
    private BigDecimal addedvalueamount;
    /**
     * 是否必填:    可选
     * 描述:  订单消费税金额
     * 示例值: 77.21
     */
    private BigDecimal consumptiondutyamount;
    /**
     * 是否必填:    可选
     * 描述:  货运方式（物流方式匹配 见常见问题解析七）(适用于网店管家）
     * 示例值: 申通快递、申通快递带纸盒、顺丰普惠、顺丰普惠带纸盒
     */
    private String sendstyle;
    /**
     * 是否必填:    可选
     * 描述:  配送方式
     * JH_ExpressSend=快递，JH_FetchSend=到店自提，JH_LocalSend=同城配送，JH_PlatSend=平台配送，JH_BusinessMen=商家配送
     * 示例值: JH_ExpressSend
     */
    private String sendtype;
    /**
     * 是否必填:    可选
     * 描述:  QQ
     * 示例值: 136548751
     */
    private String qq;
    /**
     * 是否必填:    可选
     * 描述:  支付时间(格式:yyyy-MM-dd HH:mm:ss)
     * 示例值: 1900-01-01 00:00:00
     */
    private String paytime;
    /**
     * 是否必填:    可选
     * 描述:  发票抬头
     * 示例值: 杭州笛佛软件有限公司
     */
    private String invoicetitle;
    /**
     * 是否必填:    可选
     * 描述:  纳税人识别号
     * 示例值: 9133047250399591T
     */
    private String taxpayerident;
    /**
     * 是否必填:    可选
     * 描述:  发票类型（0：不开票，1：纸质发票，2：电子发票 ，4：纸质专票 ）
     * 示例值: 1
     */
    private String invoicetype;
    /**
     * 是否必填:    可选
     * 描述:  发票内容
     * 示例值: 办公用品
     */
    private String invoicecontent;
    /**
     * 是否必填:    可选
     * 描述:  公司注册地址
     * 示例值: 杭州西湖区西园路
     */
    private String registeredaddress;
    /**
     * 是否必填:    可选
     * 描述:  公司注册电话
     * 示例值: 0571-88223300
     */
    private String registeredphone;
    /**
     * 是否必填:    可选
     * 描述:  开户行
     * 示例值: 中国建设银行宁波支行
     */
    private String depositbank;
    /**
     * 是否必填:    可选
     * 描述:  开户行账号
     * 示例值: 3330028513601050
     */
    private String bankaccount;
    /**
     * 是否必填:    可选
     * 描述:  COD服务费
     * 示例值: 0
     */
    private BigDecimal codservicefee;
    /**
     * 是否必填:    可选
     * 描述:  货币类型
     * 示例值: USD
     */
    private String currencycode;
    /**
     * 是否必填:    可选
     * 描述:  证件类型(身份证=JH_01，护照=JH_02，港澳通行证=JH_03) 跨境场景必填
     * 示例值: JH_01
     */
    private String cardtype;
    /**
     * 是否必填:    可选
     * 描述:  证件号码（跨境场景必填）
     * 示例值: 312055199001014872
     */
    private String idcard;
    /**
     * 是否必填:    可选
     * 描述:  证件真实姓名（跨境场景必填）
     * 示例值: 张三
     */
    private String idcardtruename;
    /**
     * 是否必填:    必填
     * 描述:  收货人姓名
     * 示例值: 张三
     */
    private String receivername;
    /**
     * 是否必填:    必填
     * 描述:  买家昵称（一般为买家网名）
     * 示例值: J1274551574
     */
    private String nick;
    /**
     * 是否必填:    可选
     * 描述:  商品所在仓库编号（吉客云支持该字段）
     * 示例值: KU002
     */
    private String whsecode;
    /**
     * 是否必填:    可选
     * 描述:  是否为海外购(是=1；否=0) 在客户端该字段没有体现，暂时无法区分哪些是海外购
     * 示例值: 1
     */
    private int IsHwgFlag;
    /**
     * 是否必填:    可选
     * 描述:  是否为预售单（是=1；否=0）（用于吉客云）
     * 示例值: 1
     */
    private int isPreSaleOrder;
    /**
     * 是否必填:    可选
     * 描述:  预售单状态
     * 定金未付,尾款未付=JH_NODEPOSIT_NOBALANCE,定金已付,尾款未付=JH_DEPOSIT_NOBALANCE,定金,尾款都付=JH_DEPOSIT_BALANCE,未知状态=JH_UNKNOW
     * 示例值: JH_DEPOSIT_NOBALANCE
     */
    private String preSaleOrder;
    /**
     * 是否必填:    可选
     * 描述:  预售金额
     * 示例值:
     */
    private String firstPayment;
    /**
     * 是否必填:    必填
     * 描述:  付款方式
     * 支付方式默认JH_Other:其他=JH_Other,支付宝=JH_Alipay,蚂蚁花呗=JH_AliMayi,微信支付=JH_WeiXin,银联=JH_UnionPay,财付通=JH_Tenpay,百度钱包=JH_BaiDu,货到付款=JH_COD,邮局汇款=jh_bypostoffice,公司转账=jh_bycompany,银行转账=JH_ByBank,在线支付=JH_Online,担保交易=JH_SecTrans,京东在线=JH_JDOnline,现金=JH_Cash,PayPal=JH_PayPal,积分=JH_Point,预存款支付=JH_Predeposit,抵扣券=JH_DiscountCoupon,购物卡=JH_ShoppingCard,免费=JH_Free,健康金=JH_Health,便利店支付=JH_Store,代金券/卡=JH_Vouchers,代付=JH_PeerPay,杉德支付=JH_SANDPAY,微信⼩程序⽀付=JH_WXApp,微信公众号⽀付=JH_WXWeb,微信收付通⽀付=JH_WXSFT,建行融易付=JH_CCBRYF,微信h5⽀付=JH_WXH5,⽀付宝h5⽀付=JH_AliPayWeb,佣金=JH_Commission,重庆易极付=JH_YIJI,商盟=JH_SHANGMENG,汇付=JH_HUIFU,通联=JH_TONGLIAN,联动支付=JH_LIANDONGZHIFU,云闪付=JH_YUNSHANFU,易付宝=JH_YIFUBAO,盛付通=JH_SHENGFUTONG,建设银行=JH_CCB,中国银行=JH_BOC,农业银行=JH_ABC,甬易支付=JH_YONGYI,富友支付=JH_FUYOU,连连支付=JH_LIANLIAN,快钱=JH_KUAIQIAN,网易宝=JH_WANGYI,银盈通支付=JH_YINYINGTONG,鄞州银行=JH_YINZHOU,智惠支付=JH_ZHIHUI,拉卡拉=JH_LAKALA,北京银联=JH_BEIJING,杭州银行（网银）=JH_HANGZHOU,易宝支付=JH_YIBAO,广州银联=JH_GUANGZHOU,上海银联=JH_SHANGHAI,首信易支付=JH_SHOUXINYI,浙江银商=JH_ZHEJIANGYINSHANG,易票联支付=JH_YIPIAOLIAN,浙江农信=JH_ZHEJIANGNONGXIN,招商银行=JH_CMB,平安付=JH_PINGANFU,易联支付=JH_YILIAN,四川商通=JH_SHANGTONG,高汇通=JH_GAOHUITONG,开联通=JH_KAILIANTONG,钱宝科技=JH_QIANBAO,云商优付=JH_YUNSHANG,智付=JH_ZHIFU,爱农=JH_AINONG,翼支付=JH_YIZHIFU,现代金控=JH_JINKONG,宝付=JH_BAOFU,交通银行宁波分行=JH_BCM,汇元银通=JH_YINTONG,唯品会支付=JH_WEIPINHUI,工商银行=JH_ICBC,易宝支付=JH_YIBAOZHIFU,高汇通支付=JH_GAOHUITONGZHIFU,汇聚支付=JH_HUIJU,合利宝支付=JH_HELIBAO,线下支付=JH_XIANXIA,有赞支付=JH_YOUZAN,国际支付宝=JH_GUOJIALIPAY,多多支付=JH_DUODUOPAY,银盛支付=JH_YINSHENG,摩宝支付=JH_MOBAO,新生支付=JH_NEWPAY,美团支付=JH_MEITUAN
     * 示例值: JH_WeiXin
     */
    private String paytype;
    /**
     * 是否必填:    必填
     * 描述:  结算方式【可选值仅有：担保交易(例：支付宝担保交易，买家收货后支付宝打款给卖家)；银行收款；现金收款(现钞、微信支付宝转账)；货到付款；欠款计应收 ；客户预存款（充值余额）；多种结算（例：余额现金混合支付）】
     * 示例值: 担保交易    （优先payType）
     */
    private String Shouldpaytype;
    /**
     * 是否必填:    可选
     * 描述:  支付公司海关备案号(仅适用于吉客云跨境模块)
     * 示例值: 44219809TC
     */
    private String payID;
    /**
     * 是否必填:    可选
     * 描述:  支付公司海关备案名称(仅适用于跨境场景)
     * 示例值:     杭州巨无霸支付有限公司
     */
    private String payName;
    /**
     * 是否必填:    可选
     * 描述:  电商平台海关备案编码(仅适用于跨境场景)
     * 示例值: 44304641HD
     */
    private String businessPlatCode;
    /**
     * 是否必填:    可选
     * 描述:  电商平台海关备案名称(仅适用于跨境场景 )
     * 示例值: 杭州巨无霸有限公司
     */
    private String businessPlatName;
    /**
     * 是否必填:    可选
     * 描述:  平台订单类型（JH_01=普通订单，JH_02=预售订单（发货日期有效才生效)，  JH_WHOLESALE=批发订单（B2B) ）
     * 示例值: JH_WHOLESALE
     */
    private String ordertype;
    /**
     * 是否必填:    可选
     * 描述:  发货日期（预计发货时间）
     * 示例值: 2020-10-10 10:10:10 （对应承诺发货时间）
     */
    private String LeftsendDate;
    /**
     * 是否必填:    可选
     * 描述:  物流单号（适用于商城已经预约好快递单号的场景）
     * 示例值: 130182172111
     */
    private String logisticno;
    /**
     * 是否必填:    可选
     * 描述:  物流公司名称
     * 示例值: 圆通快递
     */
    private String logisticname;
    /**
     * 是否必填:    可选
     * 描述:  是否外部仓发货（适用于商城使用外部仓已经发货的订单进行标记）
     * 示例值: true
     */
    private boolean IsStoreOrder;
    /**
     * 是否必填:    可选
     * 描述:  定制信息
     * 示例值: xxxx
     */
    private String Customization;
    /**
     * 是否必填:    可选
     * 描述:  父订单号
     * 示例值: TB123458141456
     */
    private String platParentOrderNo;
    /**
     * 是否必填:    可选
     * 描述:  菠萝派平台枚举 （即父订单平台来源 ）
     * 示例值: 淘宝=1,阿里健康=1086
     */
    private String encryptPlatform;
    /**
     * 是否必填:    可选
     * 描述:  淘宝oaid
     * 示例值: qweasdzxc
     */
    private String oaid;

    private List<PolyMallOrderProduct> goodinfos;
}
