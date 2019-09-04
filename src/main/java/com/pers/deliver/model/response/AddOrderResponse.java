package com.pers.deliver.model.response;

public class AddOrderResponse extends CommonResponse {
    //实际运费(单位：元)，运费减去优惠券费用
    int fee;
    //运费(单位：元)
    int deliverfee;
    //优惠券费用(单位：元)
    int couponfee;
    //小费(单位：元)
    int tips;
    //保价费(单位：元)
    int insurancefee;
    //配送距离(单位：米)
    int distance;
    //配送单号
    String waybill_id;
    //配送状态
    int order_status;
    //收货码
    int finish_code;
    //取货码
    int pickup_code;
    //预计骑手接单时间，单位秒，比如5分钟，就填300, 无法预计填0
    int dispatch_duration;

}
