package com.pers.deliver.model;

import lombok.Data;

import java.util.List;

@Data
public class Cargo {
    //货物价格，单位为元
    int goods_value;
    //货物高度，单位为cm
    int goods_height;
    //货物长度，单位为cm
    int goods_length;
    //货物宽度，单位为cm
    int goods_width;
    //货物重量，单位为kg
    int goods_weight;
    //货物详情，最长不超过10240个字符
    GoodsDetail goods_detail;
    //货物取货信息
    String goods_pickup_info;
    //货物交付信息
    String goods_delivery_info;
    //品类一级类目
    String cargo_first_class;
    //品类二级类目
    String cargo_second_class;
}
