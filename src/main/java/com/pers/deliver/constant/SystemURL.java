package com.pers.deliver.constant;

public class SystemURL {
    /**
     * 账号相关
     */
    //获取accessToken
    public static final String GETACCESSTOKEN = "https://api.weixin.qq.com/cgi-bin/token";
    //拉取已绑定账号
    public static final String GETBINDACCOUNT = "https://api.weixin.qq.com/cgi-bin/express/local/business/shop/get";

    /**
     * 下单接口
     */
    //获取已支持的配送公司列表
    public static final String GETALLIMMEDELIVERY = "https://api.weixin.qq.com/cgi-bin/express/local/business/delivery/getall";
    //预下配送单
    public static final String PREADDORDER = "https://api.weixin.qq.com/cgi-bin/express/local/business/order/pre_add?access_token=ACCESS_TOKEN";
    //下配送单
    public static final String ADDORDER = "https://api.weixin.qq.com/cgi-bin/express/local/business/order/add?access_token=ACCESS_TOKEN";
    //重新下单
    public static final String REORDER = "https://api.weixin.qq.com/cgi-bin/express/local/business/order/readd?access_token=ACCESS_TOKEN";
    //增加小费
    public static final String ADDTIP = "https://api.weixin.qq.com/cgi-bin/express/local/business/order/addtips";

    /**
     * 取消接口
     */
    //预取消配送单
    public static final String PRECANCELORDER = "https://api.weixin.qq.com/cgi-bin/express/local/business/order/precancel?access_token=ACCESS_TOKEN";
    //取消配送单
    public static final String CANCELORDER = "https://api.weixin.qq.com/cgi-bin/express/local/business/order/cancel?access_token=ACCESS_TOKEN";
    //异常件退回商家商家确认收货
    public static final String ABNORMALCONFIRM = "https://api.weixin.qq.com/cgi-bin/express/local/business/order/confirm_return?access_token=ACCESS_TOKEN";

    /**
     * 拉取配送单信息
     */
    public static final String GETORDER = "https://api.weixin.qq.com/cgi-bin/express/local/business/order/get?access_token=ACCESS_TOKEN";


}
