package com.gotkx.decisionoptimiza.controller;

import com.gotkx.decisionoptimiza.request.AbstractRequest;
import com.gotkx.decisionoptimiza.response.AbstractResponse;

/**
 * @author HuangKai
 * @date 2022/5/6 0:26
 */
public abstract class AbstractControllerStrategyImpl <T extends AbstractRequest, S extends AbstractResponse> implements ControllerStrategy<T, S> {
}
