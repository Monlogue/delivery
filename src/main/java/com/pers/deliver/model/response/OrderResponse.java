package com.pers.deliver.model.response;

import lombok.Data;

@Data
public class OrderResponse extends CommonResponse {
    //配送状态，枚举值
    int order_status;
    //配送单号
    String waybill_id;
    //骑手姓名
    String rider_name;
    //骑手电话
    String rider_phone;
    //骑手位置经度, 配送中时返回
    int rider_lng;
    //骑手位置纬度, 配送中时返回
    int rider_lat;
}
