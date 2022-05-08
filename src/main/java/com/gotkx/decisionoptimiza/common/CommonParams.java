package com.gotkx.decisionoptimiza.common;

import lombok.Data;

import java.io.Serializable;


/**
 * 常用参数
 * @author HuangKai
 */

@Data
public abstract class CommonParams implements Serializable {

    /**
     * 产品类型
     */
    String productType;

    private static final long serialVersionUID = -735840211206290841L;
}