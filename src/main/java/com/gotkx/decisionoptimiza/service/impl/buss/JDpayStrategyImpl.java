package com.gotkx.decisionoptimiza.service.impl.buss;

import com.gotkx.decisionoptimiza.constants.SysConstants;
import com.gotkx.decisionoptimiza.emuns.ProductEnum;
import com.gotkx.decisionoptimiza.request.JDpayRequest;
import com.gotkx.decisionoptimiza.response.JDpayResponse;
import com.gotkx.decisionoptimiza.service.impl.AbstractPreCheckServiceStrategyImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author HuangKai
 * @date 2022/5/8 23:12
 */
@Service(AbstractPreCheckServiceStrategyImpl.BEAN_PREFIX + SysConstants.API_PROVIDER_JDPAY)
@Slf4j
public class JDpayStrategyImpl extends AbstractPreCheckServiceStrategyImpl<JDpayRequest, JDpayResponse> {

    @Override
    public String getProductType() {
        return ProductEnum.JDPAY.getCode();
    }
}
