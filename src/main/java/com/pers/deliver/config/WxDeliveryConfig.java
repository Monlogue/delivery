package com.pers.deliver.config;

import lombok.Data;

@Data
public class WxDeliveryConfig {
    private String appId;
    private String appSecret;
    private String mchId;
    private String mchKey;
    private String keyPath;
    private String secret;
    //接口调用凭证
    private String access_token;
    //预下单接口返回的参数
    private String delivery_token;
    //商家id
    private String shopid;
    //唯一标识订单的 ID，由商户生成
    private String shop_order_id;
    //商家门店编号
    private String shop_no;
    //下单用户的openid
    private String openid;
    //子商户id
    private String sub_biz_id;
    //用配送公司提供的appSecret加密的校验串
    private String delivery_sign;
    //配送公司ID
    private String delivery_id;
    //配送单id
    private String waybill_id;
    //备注
    private String remark;
}
