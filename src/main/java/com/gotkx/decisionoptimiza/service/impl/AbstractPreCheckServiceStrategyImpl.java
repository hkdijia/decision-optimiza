package com.gotkx.decisionoptimiza.service.impl;

import com.gotkx.decisionoptimiza.request.AbstractRequest;
import com.gotkx.decisionoptimiza.response.AbstractResponse;
import com.gotkx.decisionoptimiza.service.PreCheckServiceStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author HuangKai
 * @date 2022/5/8 22:54
 */
@Slf4j
public abstract class AbstractPreCheckServiceStrategyImpl <T extends AbstractRequest, S extends AbstractResponse> implements PreCheckServiceStrategy<T, S>  {

    public static final String BEAN_PREFIX = "preCheck.";

    @Override
    public S doPreCheck(T request) {
        log.info("进入AbstractPreCheckServiceStrategyImpl的doPreCheck方法:{}",getProductType());
        return null;
    }
}
