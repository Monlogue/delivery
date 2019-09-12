package com.pers.deliver.util;


import com.alibaba.fastjson.JSON;
import com.pers.deliver.model.request.AddOrderRequest;
import com.pers.deliver.model.request.AddTipRequest;
import com.pers.deliver.model.request.CancelOrderRequest;
import com.pers.deliver.model.request.CommonRequest;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求body构造器
 */
public class ParamBuilder {
    public static Map<String, String> convertToMap(AddOrderRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        if (request == null) {
            return map;
        }

        putIfNotEmpty(map, "access_token", request.getAccess_token());
        putIfNotEmpty(map, "delivery_id", request.getDelivery_id());
        putIfNotEmpty(map, "delivery_sign", request.getDelivery_sign());
        putIfNotEmpty(map, "delivery_token", request.getDelivery_token());
        putIfNotEmpty(map, "openid", request.getOpenid());
        putIfNotEmpty(map, "sub_biz_id", request.getSub_biz_id());
        putIfNotEmpty(map, "shopid", request.getShopid());
        putIfNotEmpty(map, "shop_no", request.getShop_no());
        putIfNotEmpty(map, "shop_order_id", request.getShop_order_id());
        putIfNotEmpty(map, "waybill_id", request.getWaybill_id());
        putIfNotEmpty(map, "remark", request.getRemark());

        putIfNotEmpty(map, "sender", JSON.toJSONString(request.getSender()));
        putIfNotEmpty(map, "receiver", JSON.toJSONString(request.getReceiver()));
        putIfNotEmpty(map, "cargo", JSON.toJSONString(request.getCargo()));
        putIfNotEmpty(map, "order_info", JSON.toJSONString(request.getOrder_info()));
        putIfNotEmpty(map, "shop", JSON.toJSONString(request.getShop()));

        return map;
    }

    public static Map<String, String> convertToMap(AddTipRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        if (request == null) {
            return map;
        }

        putIfNotEmpty(map, "access_token", request.getAccess_token());
        putIfNotEmpty(map, "delivery_id", request.getDelivery_id());
        putIfNotEmpty(map, "delivery_sign", request.getDelivery_sign());
        putIfNotEmpty(map, "delivery_token", request.getDelivery_token());
        putIfNotEmpty(map, "openid", request.getOpenid());
        putIfNotEmpty(map, "sub_biz_id", request.getSub_biz_id());
        putIfNotEmpty(map, "shopid", request.getShopid());
        putIfNotEmpty(map, "shop_no", request.getShop_no());
        putIfNotEmpty(map, "shop_order_id", request.getShop_order_id());
        putIfNotEmpty(map, "waybill_id", request.getWaybill_id());
        putIfNotEmpty(map, "remark", request.getRemark());

        putIfNotEmpty(map, "tips", String.valueOf(request.getTips()));

        return map;
    }

    public static Map<String, String> convertToMap(CancelOrderRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        if (request == null) {
            return map;
        }

        putIfNotEmpty(map, "access_token", request.getAccess_token());
        putIfNotEmpty(map, "delivery_id", request.getDelivery_id());
        putIfNotEmpty(map, "delivery_sign", request.getDelivery_sign());
        putIfNotEmpty(map, "delivery_token", request.getDelivery_token());
        putIfNotEmpty(map, "openid", request.getOpenid());
        putIfNotEmpty(map, "sub_biz_id", request.getSub_biz_id());
        putIfNotEmpty(map, "shopid", request.getShopid());
        putIfNotEmpty(map, "shop_no", request.getShop_no());
        putIfNotEmpty(map, "shop_order_id", request.getShop_order_id());
        putIfNotEmpty(map, "waybill_id", request.getWaybill_id());
        putIfNotEmpty(map, "remark", request.getRemark());

        putIfNotEmpty(map, "cancel_reason", request.getCancel_reason());
        putIfNotEmpty(map, "cancel_reason_id", String.valueOf(request.getCancel_reason_id()));

        return map;
    }

    public static Map<String, String> convertToMap(CommonRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        if (request == null) {
            return map;
        }

        putIfNotEmpty(map, "access_token", request.getAccess_token());
        putIfNotEmpty(map, "delivery_id", request.getDelivery_id());
        putIfNotEmpty(map, "delivery_sign", request.getDelivery_sign());
        putIfNotEmpty(map, "delivery_token", request.getDelivery_token());
        putIfNotEmpty(map, "openid", request.getOpenid());
        putIfNotEmpty(map, "sub_biz_id", request.getSub_biz_id());
        putIfNotEmpty(map, "shopid", request.getShopid());
        putIfNotEmpty(map, "shop_no", request.getShop_no());
        putIfNotEmpty(map, "shop_order_id", request.getShop_order_id());
        putIfNotEmpty(map, "waybill_id", request.getWaybill_id());
        putIfNotEmpty(map, "remark", request.getRemark());

        return map;
    }


    private static void putIfNotEmpty(Map<String, String> map, String key, String value) {
        if (StringUtils.isNotEmpty(value) && !"null".equals(value)) {
            map.put(key, value);
        }
    }

}
