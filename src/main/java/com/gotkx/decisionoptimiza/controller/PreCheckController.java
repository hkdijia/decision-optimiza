package com.gotkx.decisionoptimiza.controller;

import com.gotkx.decisionoptimiza.emuns.ProductEnum;
import com.gotkx.decisionoptimiza.response.AbstractRequest;
import com.gotkx.decisionoptimiza.response.AbstractResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 前置事件控制器
 * @author HuangKai
 * @date 2022/5/6 0:01
 */

@RestController
@Slf4j
public class PreCheckController <T extends AbstractRequest, S extends AbstractResponse> extends AbstractControllerStrategyImpl<T, S> {

    @PostMapping("/preCheck")
    public void preCheck(T request){
        ProductEnum productEnum = ProductEnum.of(request.getProductType());

    }

}
