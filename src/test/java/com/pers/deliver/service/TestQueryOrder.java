package com.pers.deliver.service;

import com.pers.deliver.config.OpenApiConfig;
import com.pers.deliver.constant.RequestConstant;
import com.pers.deliver.model.request.CancelOrderRequest;
import com.pers.deliver.util.HttpClient;
import com.pers.deliver.util.ParamBuilder;
import com.pers.deliver.util.SignHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import java.util.Map;

/**
 * 订单查询例子
 */
public class TestQueryOrder {
    private static final Log logger = LogFactory.getLog(TestCancelOrder.class);

    // 测试delivery_id，可以替换为之前测试创建时返回的delivery_id
    private static Long TEST_DELIVERY_ID = 1497257791L;

    // 测试美团配送id，可以替换为之前测试创建时返回的mt_peisong_id
    private static String TEST_MT_PEISONG_ID = "1497257786087057";

    @Test
    public void testQueryOrder() throws Exception {
        String appkey = OpenApiConfig.TEST_APP_KEY;
        String secret = OpenApiConfig.TEST_SECRET;

        CancelOrderRequest request = buildMockRequest(appkey);

        Map<String, String> params = ParamBuilder.convertToMap(request);
        String sign = SignHelper.generateSign(params, secret);

        params.put("sign", sign);

        try {
            String res = HttpClient.post(RequestConstant.GETORDER, params);
            logger.info(String.format("reponse data: %s", res));
        } catch (Exception e) {
            throw e;
        }
    }

    private CancelOrderRequest buildMockRequest(String appkey) {
        CancelOrderRequest request = new CancelOrderRequest();
        /*request.setAppkey(appkey);
        request.setTimestamp(DateUtil.unixTime());
        request.setVersion("1.0");
        request.setDeliveryId(TEST_DELIVERY_ID);
        request.setMtPeisongId(TEST_MT_PEISONG_ID);*/
        return request;
    }
}
