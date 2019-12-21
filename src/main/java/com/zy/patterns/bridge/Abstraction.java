package com.zy.patterns.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 抽象化
 *
 * @author zy
 * @date 2019/6/29 15:10
 */
@Slf4j
public class Abstraction {

    private Implementor implementor;

    public void method1() {
        String rs = implementor.method1();
        log.info(rs);
    }

    public void method2() {
        String rs = implementor.method2();
        log.info(rs);
    }

    public void method3() {
        method1();
        method2();
    }

}
