package com.pers.deliver.model.response;

import com.pers.deliver.model.Agent;
import lombok.Data;

@Data
public class DeliveryResponse {

    //快递公司小程序 UserName
    private String ToUserName;
    //微信团队的 OpenID （固定值）
    private String FromUserName;
    //事件时间，Unix时间戳
    private int CreateTime;
    //消息类型，固定为 event
    private String MsgType;
    //事件类型，固定为 udate_waybill_status，不区分大小写
    private String Event;
    //商家id， 由配送公司分配的appkey
    private String shopid;
    //唯一标识订单的 ID，由商户生成
    private String shop_order_id;
    //配送单id
    private String waybill_id;
    //Unix时间戳
    private String action_time;
    //配送状态，枚举值
    private int order_status;
    //附加信息
    private String action_msg;
    //商家门店编号， 在配送公司侧登记
    private String shop_no;
    //骑手信息
    private Agent agent;
}