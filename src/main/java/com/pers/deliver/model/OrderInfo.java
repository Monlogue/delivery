package com.pers.deliver.model;

import lombok.Data;

@Data
public class OrderInfo {
    //配送服务代码
    String delivery_service_code;
    //订单类型, 0: 即时单 1 预约单
    int order_type;
    //期望派单时间
    int expected_delivery_time;
    //期望送达时间
    int expected_finish_time;
    //期望取件时间
    int expected_pick_time;
    //门店订单流水号
    String poi_seq;
    //备注
    String note;
    //用户下单付款时间
    int order_time;
    //是否保价
    int is_insured;
    //保价金额
    int declared_value;
    //小费
    int tips;
    //是否选择直拿直送（0：不需要；1：需要
    int is_direct_delivery;
    //骑手应付金额
    int cash_on_delivery;
    //骑手应收金额
    int cash_on_pickup;
    //物流流向
    int rider_pick_method;
    //收货码
    int is_finish_code_needed;
    //取货码
    int is_pickup_code_needed;
}
