package com.pers.deliver.model.request;

import com.pers.deliver.model.*;
import lombok.Data;

@Data
public class CancelOrderRequest extends CommonRequest {
    //取消原因Id 1暂时不需要邮寄2价格不合适3订单信息有误，重新下单4骑手取货不及时5骑手配送不及时6其他原因
    int cancel_reason_id;
    //取消原因
    String cancel_reason;
}
