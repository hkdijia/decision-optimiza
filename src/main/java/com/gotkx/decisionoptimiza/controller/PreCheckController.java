package com.gotkx.decisionoptimiza.controller;

import com.gotkx.decisionoptimiza.emuns.ProductEnum;
import com.gotkx.decisionoptimiza.request.AbstractRequest;
import com.gotkx.decisionoptimiza.response.AbstractResponse;
import com.gotkx.decisionoptimiza.service.PreCheckServiceStrategy;
import com.gotkx.decisionoptimiza.service.impl.AbstractPreCheckServiceStrategyImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 前置事件控制器
 *
 * @author HuangKai
 * @date 2022/5/6 0:01
 */

@RestController
@Slf4j
public class PreCheckController<T extends AbstractRequest, S extends AbstractResponse> extends AbstractControllerStrategyImpl<T, S> {

//    @Autowired
//    private PreCheckServiceStrategy preCheckServiceStrategy;

    @Autowired
    private ApplicationContext applicationContext;

    @PostMapping("/preCheck")
    public void preCheck(@RequestBody T request) {
        ProductEnum productEnum = ProductEnum.of(request.getProductType());
        // 进入不同的产品【前置】事件逻辑
        log.info("进入PreCheckController的preCheck方法");
        String beanName = AbstractPreCheckServiceStrategyImpl.BEAN_PREFIX + request.getProductType();
        PreCheckServiceStrategy strategy = applicationContext.getBean(beanName, PreCheckServiceStrategy.class);
        strategy.doPreCheck(request);
    }

}
