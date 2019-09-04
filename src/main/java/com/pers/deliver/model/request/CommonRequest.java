package com.pers.deliver.model.request;

import com.pers.deliver.config.WxDeliveryConfig;
import com.pers.deliver.model.*;
import lombok.Data;

@Data
public class CommonRequest {

    //接口调用凭证
    String access_token;
    //预下单接口返回的参数
    String delivery_token;
    //商家id
    String shopid;
    //唯一标识订单的 ID，由商户生成
    String shop_order_id;
    //商家门店编号
    String shop_no;
    //下单用户的openid
    String openid;
    //子商户id
    String sub_biz_id;
    //用配送公司提供的appSecret加密的校验串
    String delivery_sign;
    //配送公司ID
    String delivery_id;
    //配送单id
    String waybill_id;
    //备注
    String remark;

    public void setCommon(WxDeliveryConfig wxDeliveryConfig){
        this.setAccess_token("");
        this.setDelivery_id("");
        this.setWaybill_id("");
        this.setSub_biz_id("");
        this.setShop_no("");
        this.setShop_order_id("");
        this.setShopid("");
        this.setDelivery_sign("");
        this.setDelivery_token("");
        this.setRemark("");
        this.setOpenid("");
    }
}
