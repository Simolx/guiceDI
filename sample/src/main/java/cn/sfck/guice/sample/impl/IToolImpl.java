package cn.sfck.guice.sample.impl;

import cn.sfck.guice.sample.ITool;

public class IToolImpl implements ITool {
    @Override
    public void doWork() {
        System.out.println("use tool to work");
    }
}
