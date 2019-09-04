package com.pers.deliver.model;

import lombok.Data;

@Data
public class Shop {
    //配送公司Id
    String delivery_id;
    //商家id
    String shopid;
    //审核状态 0审核通过1审核中2审核不通过
    int audit_result;
}
