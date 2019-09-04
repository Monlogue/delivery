package com.pers.deliver.model;

import lombok.Data;

@Data
public class Sender {
    //姓名，最长不超过256个字符
    String name;
    //城市名称，如广州市
    String city;
    //地址(街道、小区、大厦等，用于定位)
    String address;
    //地址详情(楼号、单元号、层号)
    String address_detail;
    //电话/手机号，最长不超过64个字符
    String phone;
    //经度
    int lng;
    //纬度
    int lat;
    //坐标类型
    int coordinate_type;
}
