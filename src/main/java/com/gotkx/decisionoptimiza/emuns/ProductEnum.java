package com.gotkx.decisionoptimiza.emuns;

import lombok.Getter;

import java.util.Arrays;

/**
 * 产品形态的枚举
 * @author HuangKai
 * @date 2022/5/6 0:06
 */
@Getter
public enum ProductEnum {

    //支付宝花呗
    ALIPAY("alipay","支付宝花呗"),
    //京东白条
    JDPAY("jdpay","京东白条");

    private final String code;
    private final String desc;

    ProductEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ProductEnum of(String code){
        return Arrays.stream(ProductEnum.values()).filter(e -> e.code.equals(code)).findFirst().orElse(null);
    }
}
