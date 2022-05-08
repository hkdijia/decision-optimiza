package com.gotkx.decisionoptimiza.service.impl.buss;

import com.gotkx.decisionoptimiza.constants.SysConstants;
import com.gotkx.decisionoptimiza.emuns.ProductEnum;
import com.gotkx.decisionoptimiza.request.AlipayRequest;
import com.gotkx.decisionoptimiza.response.AlipayResponse;
import com.gotkx.decisionoptimiza.service.impl.AbstractPreCheckServiceStrategyImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.gotkx.decisionoptimiza.service.impl.AbstractPreCheckServiceStrategyImpl.BEAN_PREFIX;

/**
 * @author HuangKai
 * @date 2022/5/8 23:12
 */
@Service(AbstractPreCheckServiceStrategyImpl.BEAN_PREFIX + SysConstants.API_PROVIDER_ALIPAY)
@Slf4j
public class AlipayStrategyImpl extends AbstractPreCheckServiceStrategyImpl<AlipayRequest, AlipayResponse> {

    @Override
    public String getProductType() {
        return ProductEnum.ALIPAY.getCode();
    }
}
