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

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * 模拟订单例子
 */
public class TestMockOrder {
    private static final Log logger = LogFactory.getLog(TestCancelOrder.class);

    // 测试delivery_id，可以替换为之前测试创建时返回的delivery_id
    private static Long TEST_DELIVERY_ID = 1516949299L;

    // 测试美团配送id，可以替换为之前测试创建时返回的mt_peisong_id
    private static String TEST_MT_PEISONG_ID = "1516949300027436";

    /**
     * 测试订单模拟接单
     *
     * @throws Exception
     */
    @Test
    public void testMockAcceptOrder() throws Exception {
        Map<String, String> params = buildMockRequest();

        try {
            String res = HttpClient.post(RequestConstant.GETBINDACCOUNT, params);
            logger.info(String.format("reponse data: %s", res));
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * 测试订单模拟取货
     *
     * @throws Exception
     */
    @Test
    public void testMockPickUpOrder() throws Exception {
        Map<String, String> params = buildMockRequest();

        try {
            String res = HttpClient.post(RequestConstant.GETBINDACCOUNT, params);
            logger.info(String.format("reponse data: %s", res));
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * 测试订单模拟送达
     *
     * @throws Exception
     */
    @Test
    public void testMockDeliverOrder() throws Exception {
        Map<String, String> params = buildMockRequest();

        try {
            String res = HttpClient.post(RequestConstant.GETBINDACCOUNT, params);
            logger.info(String.format("reponse data: %s", res));
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * 测试订单模拟改派骑手
     *
     * @throws Exception
     */
    @Test
    public void testMockRearrangeOrder() throws Exception {
        Map<String, String> params = buildMockRequest();

        try {
            String res = HttpClient.post(RequestConstant.GETBINDACCOUNT, params);
            logger.info(String.format("reponse data: %s", res));
        } catch (Exception e) {
            throw e;
        }
    }

    private Map<String, String> buildMockRequest() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String appkey = OpenApiConfig.TEST_APP_KEY;
        String secret = OpenApiConfig.TEST_SECRET;

        CancelOrderRequest request = new CancelOrderRequest();
       /* request.setAppkey(appkey);
        request.setTimestamp(DateUtil.unixTime());
        request.setVersion("1.0");
        request.setDeliveryId(TEST_DELIVERY_ID);
        request.setMtPeisongId(TEST_MT_PEISONG_ID);*/

        Map<String, String> params = ParamBuilder.convertToMap(request);
        String sign = SignHelper.generateSign(params, secret);

        params.put("sign", sign);
        return params;
    }
}
