package com.pers.deliver.model.response;

import lombok.Data;

@Data
public class CancelOrderResponse extends  CommonResponse{
    //预计扣除的违约金(单位：元)，精确到分
    int deduct_fee;
    //说明
    String desc;
}
