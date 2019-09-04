package com.pers.deliver.model.request;

import com.pers.deliver.config.WxDeliveryConfig;
import com.pers.deliver.model.*;
import lombok.Data;

@Data
public class AddOrderRequest extends CommonRequest {
    //发件人信息
    Sender sender;
    //收件人信息
    Receiver receiver;
    //货物信息
    Cargo cargo;
    //订单信息
    OrderInfo order_info;
    //商品信息
    Goods shop;
}
