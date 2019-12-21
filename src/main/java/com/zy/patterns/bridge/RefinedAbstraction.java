package com.zy.patterns.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 拓展后的抽象化
 *
 * @author zy
 * @date 2019/6/29 15:16
 */
@Slf4j
public class RefinedAbstraction extends Abstraction {

    public void mutil(int times) {
        for (int i = 0; i < times; i++) {
            super.method3();
        }
    }
}
