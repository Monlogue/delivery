package com.pers.deliver.model.request;

import lombok.Data;

@Data
public class AddTipRequest extends CommonRequest {
    //小费金额(单位：元) 各家配送公司最大值不同
    int tips;

}
