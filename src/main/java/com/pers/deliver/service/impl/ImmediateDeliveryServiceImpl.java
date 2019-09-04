package com.pers.deliver.service.impl;

import com.pers.deliver.config.WxDeliveryConfig;
import com.pers.deliver.constant.SystemURL;
import com.pers.deliver.model.request.AddOrderRequest;
import com.pers.deliver.model.request.AddTipRequest;
import com.pers.deliver.model.request.CancelOrderRequest;
import com.pers.deliver.model.request.CommonRequest;
import com.pers.deliver.model.response.*;
import com.pers.deliver.service.ImmediateDeliveryService;
import com.pers.deliver.util.HttpRequestUtil;
import com.pers.deliver.util.JsonUtil;


public class ImmediateDeliveryServiceImpl implements ImmediateDeliveryService {

    private WxDeliveryConfig wxDeliveryConfig;

    public void setWxDeliveryConfig(WxDeliveryConfig wxDeliveryConfig) {
        this.wxDeliveryConfig = wxDeliveryConfig;
    }


    /**
     * 获取小程序全局唯一后台接口调用凭据（access_token）
     *
     * @return
     */
    @Override
    public String getAccessToken() {
        String responseString = HttpRequestUtil.get(SystemURL.GETACCESSTOKEN + "?grant_type=client_credential&appid=" + wxDeliveryConfig.getAppId() + "&secret=" + wxDeliveryConfig.getAppSecret());
        if (responseString != null) {
            return responseString;
        }
        return responseString;
    }

    /**
     * 拉取已绑定账号
     *
     * @return
     */
    @Override
    public CommonResponse getBindAccount() {
        String responseString = HttpRequestUtil.post(SystemURL.GETBINDACCOUNT + "?access_token=" + wxDeliveryConfig.getAccess_token(), null);
        if (responseString != null) {
            return JsonUtil.toObject(responseString, BindAccountResponse.class);
        }
        return null;
    }

    /**
     * 获取已支持的配送公司列表接口
     *
     * @return
     */
    @Override
    public CommonResponse getAllImmeDelivery() {
        String responseString = HttpRequestUtil.post(SystemURL.GETALLIMMEDELIVERY + "?access_token=" + wxDeliveryConfig.getAccess_token(), null);
        if (responseString != null) {
            return JsonUtil.toObject(responseString, AllImmeDeliveryResponse.class);
        }
        return null;
    }

    /**
     * 预下配送单接口
     *
     * @param addOrderRequest
     * @return
     */
    @Override
    public CommonResponse preAddOrder(AddOrderRequest addOrderRequest) {
        addOrderRequest.setCommon(wxDeliveryConfig);
        String responseString = HttpRequestUtil.post(SystemURL.PREADDORDER + "?access_token=" + addOrderRequest.getAccess_token(), JsonUtil.toJson(addOrderRequest));
        if (responseString != null) {
            return JsonUtil.toObject(responseString, AddOrderResponse.class);
        }
        return null;
    }

    /**
     * 下配送单接口
     *
     * @param addOrderRequest
     * @return
     */
    @Override
    public CommonResponse addOrder(AddOrderRequest addOrderRequest) {
        addOrderRequest.setCommon(wxDeliveryConfig);
        String responseString = HttpRequestUtil.post(SystemURL.ADDORDER + "?access_token=" + addOrderRequest.getAccess_token(), JsonUtil.toJson(addOrderRequest));
        if (responseString != null) {
            return JsonUtil.toObject(responseString, AddOrderResponse.class);
        }
        return null;
    }

    /**
     * 重新下单接口
     *
     * @param addOrderRequest
     * @return
     */
    @Override
    public CommonResponse reOrder(AddOrderRequest addOrderRequest) {
        addOrderRequest.setCommon(wxDeliveryConfig);
        String responseString = HttpRequestUtil.post(SystemURL.REORDER + "?access_token=" + addOrderRequest.getAccess_token(), JsonUtil.toJson(addOrderRequest));
        if (responseString != null) {
            return JsonUtil.toObject(responseString, AddOrderResponse.class);
        }
        return null;
    }

    /**
     * 增加小费接口
     *
     * @param addTipRequest
     * @return
     */
    @Override
    public CommonResponse addTip(AddTipRequest addTipRequest) {
        addTipRequest.setCommon(wxDeliveryConfig);
        String responseString = HttpRequestUtil.post(SystemURL.ADDTIP + "?access_token=" + addTipRequest.getAccess_token(), JsonUtil.toJson(addTipRequest));
        if (responseString != null) {
            return JsonUtil.toObject(responseString, CommonResponse.class);
        }
        return null;
    }

    /**
     * 预取消配送单接口
     *
     * @param cancelOrderRequest
     * @return
     */
    @Override
    public CommonResponse preCancelOrder(CancelOrderRequest cancelOrderRequest) {
        cancelOrderRequest.setCommon(wxDeliveryConfig);
        String responseString = HttpRequestUtil.post(SystemURL.PRECANCELORDER + "?access_token=" + cancelOrderRequest.getAccess_token(), JsonUtil.toJson(cancelOrderRequest));
        if (responseString != null) {
            return JsonUtil.toObject(responseString, CancelOrderResponse.class);
        }
        return null;
    }

    /**
     * 取消配送单接口
     *
     * @param cancelOrderRequest
     * @return
     */
    @Override
    public CommonResponse cancelOrder(CancelOrderRequest cancelOrderRequest) {
        cancelOrderRequest.setCommon(wxDeliveryConfig);
        String responseString = HttpRequestUtil.post(SystemURL.CANCELORDER + "?access_token=" + cancelOrderRequest.getAccess_token(), JsonUtil.toJson(cancelOrderRequest));
        if (responseString != null) {
            return JsonUtil.toObject(responseString, CancelOrderResponse.class);
        }
        return null;
    }

    /**
     * 异常件退回商家商家确认收货接口
     *
     * @param commonRequest
     * @return
     */
    @Override
    public CommonResponse abnormalConfirm(CommonRequest commonRequest) {
        commonRequest.setCommon(wxDeliveryConfig);
        String responseString = HttpRequestUtil.post(SystemURL.ABNORMALCONFIRM + "?access_token=" + commonRequest.getAccess_token(), JsonUtil.toJson(commonRequest));
        if (responseString != null) {
            return JsonUtil.toObject(responseString, CommonResponse.class);
        }
        return null;
    }

    /**
     * 拉取配送单信息
     *
     * @param commonRequest
     * @return
     */
    @Override
    public CommonResponse getOrder(CommonRequest commonRequest) {
        commonRequest.setCommon(wxDeliveryConfig);
        String responseString = HttpRequestUtil.post(SystemURL.GETORDER + "?access_token=" + commonRequest.getAccess_token(), JsonUtil.toJson(commonRequest));
        if (responseString != null) {
            return JsonUtil.toObject(responseString, OrderResponse.class);
        }
        return null;
    }


}
