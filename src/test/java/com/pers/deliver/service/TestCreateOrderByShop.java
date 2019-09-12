package com.pers.deliver.service;

import com.pers.deliver.config.OpenApiConfig;
import com.pers.deliver.constant.RequestConstant;
import com.pers.deliver.model.request.AddOrderRequest;
import com.pers.deliver.util.DateUtil;
import com.pers.deliver.util.HttpClient;
import com.pers.deliver.util.ParamBuilder;
import com.pers.deliver.util.SignHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import java.util.Map;

/**
 * 创建订单 例子
 */
public class TestCreateOrderByShop {
    private static final Log logger = LogFactory.getLog(TestCreateOrderByShop.class);

    // TEST_DELIVERY_ID，配送唯一标识，实际实现时需要替换为自己的delivery_id
    private static Long TEST_DELIVERY_ID = Long.valueOf(DateUtil.unixTime());

    // TEST_ORDER_ID 订单号，实际实现时需要替换为自己的订单id
    private static String TEST_ORDER_ID = String.valueOf(DateUtil.unixTime());


    @Test
    public void testCreateOrderByShop() throws Exception {
        String appkey = OpenApiConfig.TEST_APP_KEY;
        String secret = OpenApiConfig.TEST_SECRET;

        AddOrderRequest request = buildMockRequest(appkey);

        Map<String, String> params = ParamBuilder.convertToMap(request);
        String sign = SignHelper.generateSign(params, secret);

        params.put("sign", sign);

        try {
            String res = HttpClient.post(RequestConstant.ADDORDER, params);
            logger.info(String.format("reponse data: %s", res));
        } catch (Exception e) {
            throw e;
        }
    }

    private AddOrderRequest buildMockRequest(String appkey) {
        AddOrderRequest request = new AddOrderRequest();
        /*request.setAppkey(appkey);
        request.setTimestamp(DateUtil.unixTime());
        request.setVersion("1.0");

        // 设置订单号及配送服务标识
        request.setDeliveryId(TEST_DELIVERY_ID);
        request.setOrderId(TEST_ORDER_ID);

        // 设置订单类型为即时单
        request.setOrderType(OrderType.NORMAL);

        *
         * 设置配送服务编码
         *
         * 飞速达:4002
         * 快速达:4011
         * 及时达:4012
         * 集中送:4013

        request.setDeliveryServiceCode(4011);

        // 设置测试门店 id，测试门店的坐标地址为 97235456,31065079（高德坐标），配送范围3km
        request.setShopId("test_0001");

        // 设置取货人信息，请根据测试门店地址 在测试发单时合理设置送货地址
        request.setReceiverName("测试收货人");
        request.setReceiverAddress("测试收货人地址");
        request.setReceiverPhone("18523657373");
        // 收件人坐标
        request.setReceiverLng(97235458);
        request.setReceiverLat(31065074);
        // 收件人坐标类型
        request.setCoordinateType(0);

        // 设置预计送达时间为1小时以后
        request.setExpectedDeliveryTime(DateUtil.unixTime() + 3600L);

        // 设置门店流水号，门店流水号为一天中单个门店的订单序号，方便骑手线下到门店取货
        request.setPoiSeq("1");

        // 设置商品重量，单位为kg
        request.setGoodsWeight(new BigDecimal(3));

        // 设置商品详情
        OpenApiGoods openApiGoods = new OpenApiGoods();

        OpenApiGood openApiGood1 = new OpenApiGood();
        // 商品数量
        openApiGood1.setGoodCount(1);
        // 商品名称
        openApiGood1.setGoodName("进口红提");
        // 商品单价
        openApiGood1.setGoodPrice(new BigDecimal("20.5"));
        // 商品数量单位
        openApiGood1.setGoodUnit("盒");

        OpenApiGood openApiGood2 = new OpenApiGood();
        // 商品数量
        openApiGood2.setGoodCount(1);
        // 商品名称
        openApiGood2.setGoodName("进口芒果");
        // 商品单价
        openApiGood2.setGoodPrice(new BigDecimal("40.5"));
        // 商品数量单位
        openApiGood2.setGoodUnit("盒");

        openApiGoods.setGoods(Arrays.asList(openApiGood1, openApiGood2));

        request.setGoodsDetail(openApiGoods);

        // 设置备注信息
        request.setNote("小哥麻烦要一下发票");*/
        return request;
    }

}
