package com.gotkx.decisionoptimiza.service;

import com.gotkx.decisionoptimiza.request.AbstractRequest;
import com.gotkx.decisionoptimiza.response.AbstractResponse;

/**
 * @author HuangKai
 * @date 2022/5/8 22:50
 */
public interface PreCheckServiceStrategy <T extends AbstractRequest, S extends AbstractResponse> {

    /**
     * 发起前置事件处理
     * @param request
     * @return
     */
    S   doPreCheck(T request);


    /**
     * 获取产品类型
     * @return
     */
    String getProductType();

}
