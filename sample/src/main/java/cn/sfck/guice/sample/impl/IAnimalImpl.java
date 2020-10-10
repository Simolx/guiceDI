package cn.sfck.guice.sample.impl;

import cn.sfck.guice.sample.IAnimal;

public class IAnimalImpl implements IAnimal {

    @Override
    public void work() {
        System.out.println("animals can also do work");
    }
}
