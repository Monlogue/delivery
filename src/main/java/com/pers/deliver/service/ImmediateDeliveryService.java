package com.pers.deliver.service;

import com.pers.deliver.model.request.AddOrderRequest;
import com.pers.deliver.model.request.AddTipRequest;
import com.pers.deliver.model.request.CancelOrderRequest;
import com.pers.deliver.model.request.CommonRequest;

import java.io.IOException;
import java.util.Map;

public interface ImmediateDeliveryService {

    Map getBindAccount() throws IOException;

    Map getAllImmeDelivery() throws IOException;

    Map preAddOrder(AddOrderRequest addOrderRequest)throws IOException;

    Map addOrder(AddOrderRequest addOrderRequest)throws IOException;

    Map reOrder(AddOrderRequest addOrderRequest)throws IOException;

    Map addTip(AddTipRequest addTipRequest)throws IOException;

    Map preCancelOrder(CancelOrderRequest cancelOrderRequest)throws IOException;

    Map cancelOrder(CancelOrderRequest cancelOrderRequest)throws IOException;

    Map abnormalConfirm(CommonRequest commonRequest)throws IOException;

    Map getOrder(CommonRequest commonRequest)throws IOException;
}
