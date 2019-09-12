package com.pers.deliver.constant;

/**
 * API接口信息
 */
public class RequestConstant {

    /**
     * 开放平台接口地址，正式账号/测试账号采用同一地址
     */
    public static final String API_URL = "https://api.weixin.qq.com/cgi-bin/express/local/business";

    /**
     * 拉取已绑定账号
     */
    public static final String GETBINDACCOUNT = API_URL + "/shop/get";

    /**
     * 获取已支持的配送公司列表
     */
    public static final String GETALLIMMEDELIVERY = API_URL + "/delivery/getall";

    /**
     * 预下配送单
     */
    public static final String PREADDORDER = API_URL + "/order/pre_add";

    /**
     * 下配送单
     */
    public static final String ADDORDER = API_URL + "/order/add";

    /**
     * 重新下单
     */
    public static final String REORDER = API_URL + "order/readd";

    /**
     * 增加小费
     */
    public static final String ADDTIP = API_URL + "/order/addtips";

    /**
     * 预取消配送单
     */
    public static final String PRECANCELORDER = API_URL + "order/precancel";

    /**
     * 取消配送单
     */
    public static final String CANCELORDER = API_URL + "/order/cancel";

    /**
     * 异常件退回商家商家确认收货
     */
    public static final String ABNORMALCONFIRM = API_URL + "/order/confirm_return";

    /**
     * 拉取配送单信息
     */
    public static final String GETORDER = API_URL + "/order/get";

}
