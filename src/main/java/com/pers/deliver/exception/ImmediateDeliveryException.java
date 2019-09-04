package com.pers.deliver.exception;

import com.pers.deliver.enums.ImmediateDeliveryResultEnum;

public class ImmediateDeliveryException extends RuntimeException {

    private Integer code;

    public ImmediateDeliveryException(ImmediateDeliveryResultEnum resultEnum) {
        super(resultEnum.getMsg());
        code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }
}
