package com.pers.deliver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.pers.deliver.config.WxDeliveryConfig;
import com.pers.deliver.constant.RequestConstant;
import com.pers.deliver.model.request.AddOrderRequest;
import com.pers.deliver.model.request.AddTipRequest;
import com.pers.deliver.model.request.CancelOrderRequest;
import com.pers.deliver.model.request.CommonRequest;
import com.pers.deliver.service.ImmediateDeliveryService;
import com.pers.deliver.util.HttpClient;
import com.pers.deliver.util.ParamBuilder;

import java.io.IOException;
import java.util.Map;


public class ImmediateDeliveryServiceImpl implements ImmediateDeliveryService {

    private WxDeliveryConfig wxDeliveryConfig;

    public void setWxDeliveryConfig(WxDeliveryConfig wxDeliveryConfig) {
        this.wxDeliveryConfig = wxDeliveryConfig;
    }


    /**
     * 拉取已绑定账号
     *
     * @return
     * @throws IOException
     */
    @Override
    public Map getBindAccount() throws IOException {
        String responseString = HttpClient.post(RequestConstant.GETBINDACCOUNT + "?access_token=" + wxDeliveryConfig.getAccess_token(), null);
        if (responseString != null) {
            return JSONObject.parseObject(responseString,Map.class);
        }
        return null;
    }

    /**
     * 获取已支持的配送公司列表接口
     *
     * @return
     * @throws IOException
     */
    @Override
    public Map getAllImmeDelivery() throws IOException {
        String responseString = HttpClient.post(RequestConstant.GETALLIMMEDELIVERY + "?access_token=" + wxDeliveryConfig.getAccess_token(), null);
        if (responseString != null) {
            return JSONObject.parseObject(responseString,Map.class);
        }
        return null;
    }

    /**
     * 预下配送单接口
     *
     * @param request
     * @return
     * @throws IOException
     */
    @Override
    public Map preAddOrder(AddOrderRequest request) throws IOException {
        Map<String, String> params = ParamBuilder.convertToMap(request);
        String responseString = HttpClient.post(RequestConstant.PREADDORDER, params);
        if (responseString != null) {
            return JSONObject.parseObject(responseString,Map.class);
        }
        return null;
    }

    /**
     * 下配送单接口
     *
     * @param request
     * @return
     * @throws IOException
     */
    @Override
    public Map addOrder(AddOrderRequest request) throws IOException {
        Map<String, String> params = ParamBuilder.convertToMap(request);
        String responseString = HttpClient.post(RequestConstant.ADDORDER, params);
        if (responseString != null) {
            return JSONObject.parseObject(responseString,Map.class);
        }
        return null;
    }

    /**
     * 重新下单接口
     *
     * @param request
     * @return
     * @throws IOException
     */
    @Override
    public Map reOrder(AddOrderRequest request) throws IOException {
        Map<String, String> params = ParamBuilder.convertToMap(request);
        String responseString = HttpClient.post(RequestConstant.REORDER, params);
        if (responseString != null) {
            return JSONObject.parseObject(responseString,Map.class);
        }
        return null;
    }

    /**
     * 增加小费接口
     *
     * @param request
     * @return
     * @throws IOException
     */
    @Override
    public Map addTip(AddTipRequest request) throws IOException {
        Map<String, String> params = ParamBuilder.convertToMap(request);
        String responseString = HttpClient.post(RequestConstant.ADDTIP, params);
        if (responseString != null) {
            return JSONObject.parseObject(responseString,Map.class);
        }
        return null;
    }

    /**
     * 预取消配送单接口
     *
     * @param request
     * @return
     * @throws IOException
     */
    @Override
    public Map preCancelOrder(CancelOrderRequest request) throws IOException {
        Map<String, String> params = ParamBuilder.convertToMap(request);
        String responseString = HttpClient.post(RequestConstant.PRECANCELORDER, params);
        if (responseString != null) {
            return JSONObject.parseObject(responseString,Map.class);
        }
        return null;
    }

    /**
     * 取消配送单接口
     *
     * @param request
     * @return
     * @throws IOException
     */
    @Override
    public Map cancelOrder(CancelOrderRequest request) throws IOException {
        Map<String, String> params = ParamBuilder.convertToMap(request);
        String responseString = HttpClient.post(RequestConstant.CANCELORDER, params);
        if (responseString != null) {
            return JSONObject.parseObject(responseString,Map.class);
        }
        return null;
    }

    /**
     * 异常件退回商家商家确认收货接口
     *
     * @param request
     * @return
     * @throws IOException
     */
    @Override
    public Map abnormalConfirm(CommonRequest request) throws IOException {
        Map<String, String> params = ParamBuilder.convertToMap(request);
        String responseString = HttpClient.post(RequestConstant.ABNORMALCONFIRM, params);
        if (responseString != null) {
            return JSONObject.parseObject(responseString,Map.class);
        }
        return null;
    }

    /**
     * 拉取配送单信息
     *
     * @param request
     * @return
     * @throws IOException
     */
    @Override
    public Map getOrder(CommonRequest request) throws IOException {
        Map<String, String> params = ParamBuilder.convertToMap(request);
        String responseString = HttpClient.post(RequestConstant.GETORDER, params);
        if (responseString != null) {
            return JSONObject.parseObject(responseString,Map.class);
        }
        return null;
    }


}
