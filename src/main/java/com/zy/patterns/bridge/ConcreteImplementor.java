package com.zy.patterns.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现者
 *
 * @author zy
 * @date 2019/6/29 15:12
 */
@Slf4j
public class ConcreteImplementor implements Implementor {

    @Override
    public String method1() {
        log.info("method1");
        return "method1";
    }

    @Override
    public String method2() {
        log.info("method2");
        return "method2";
    }

}
