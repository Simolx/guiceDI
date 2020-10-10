package cn.sfck.guice.sample.impl;

import cn.sfck.guice.sample.ITool;

public class IToolImpl2 implements ITool {
    @Override
    public void doWork() {
        System.out.println("use tool2 to work");
    }
}
