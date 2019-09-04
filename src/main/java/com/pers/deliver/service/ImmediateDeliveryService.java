package com.pers.deliver.service;

import com.pers.deliver.model.request.AddOrderRequest;
import com.pers.deliver.model.request.AddTipRequest;
import com.pers.deliver.model.request.CancelOrderRequest;
import com.pers.deliver.model.request.CommonRequest;
import com.pers.deliver.model.response.CommonResponse;

public interface ImmediateDeliveryService {

    String getAccessToken();

    CommonResponse getBindAccount();

    CommonResponse getAllImmeDelivery();

    CommonResponse preAddOrder(AddOrderRequest addOrderRequest);

    CommonResponse addOrder(AddOrderRequest addOrderRequest);

    CommonResponse reOrder(AddOrderRequest addOrderRequest);

    CommonResponse addTip(AddTipRequest addTipRequest);

    CommonResponse preCancelOrder(CancelOrderRequest cancelOrderRequest);

    CommonResponse cancelOrder(CancelOrderRequest cancelOrderRequest);

    CommonResponse abnormalConfirm(CommonRequest commonRequest);

    CommonResponse getOrder(CommonRequest commonRequest);
}
