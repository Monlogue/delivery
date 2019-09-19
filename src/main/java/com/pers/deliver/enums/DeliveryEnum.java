package com.pers.deliver.enums;

public enum DeliveryEnum {
    WAIT_ASSIGN(101, "配送公司接单阶段——等待分配骑手，即初始状态"),
    ASSIGN_SUCCESS(102, "配送公司接单阶段——分配骑手成功"),
    SHOP_CANCEL(103, "配送公司接单阶段——商家取消订单， 订单结束"),
    RIDER_COLLECT(201, "骑手取货阶段——骑手到店开始取货"),
    COLLECT_SUCCESS(202, "骑手取货阶段——取货成功"),
    COLLECT_FAIL_ORDER(203, "骑手取货阶段——取货失败，商家取消订单， 订单结束"),
    COLLECT_FAIL_RIDER(204, "骑手取货阶段——取货失败，骑手因自身原因取消订单， 订单结束"),
    COLLECT_FAIL_SHOP(205, "骑手取货阶段——取货失败，骑手因商家原因取消订单， 订单结束"),
    DELIVERY_PROCESS(301, "骑手配送阶段——配送中"),
    DELIVERY_SUCCESS(302, "骑手配送阶段——配送成功， 订单结束"),
    DELIVERY_FAIL_ORDER(303, "骑手配送阶段——商家取消订单，订单结束"),
    DELIVERY_FAIL_MISS(304, "骑手配送阶段——无法联系收货人，配送物品开始返还商家"),
    DELIVERY_FAIL_REFUSE(305, "骑手配送阶段——收货人拒收，配送物品开始返还商家"),
    DELIVERY_FAIL_RETURN(401, "骑手返回配送货品阶段——货品返还商户成功， 订单结束"),
    DELIVERY_FAIL_SYS(501, "因运力系统原因取消， 订单结束"),
    DELIVERY_FAIL_NATURE(502, "因不可抗拒因素（天气，道路管制等原因）取消，订单结束");



    private Integer code;

    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    DeliveryEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static DeliveryEnum getValue(int code){

        for (DeliveryEnum deliveryEnum : values()) {
            if(deliveryEnum.getCode()== code){
                return deliveryEnum;
            }
        }
        return null;
    }
}
