package com.pers.deliver.model;

import lombok.Data;

@Data
public class Goods {
    //货物数量
    int good_count;
    //货品名称
    String good_name;
    //货品单价，精确到小数点后两位
    int good_price;
    //货品单位，最长不超过20个字符
    String good_unit;
    //商品缩略图 url
    String img_url;
    //商家小程序的路径，建议为订单页面
    String wxa_path;

}
