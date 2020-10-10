package cn.sfck.guice.sample.module;

import cn.sfck.guice.sample.impl.Person;
import com.google.inject.AbstractModule;

public class HumanModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Person.class).asEagerSingleton();
    }
}
