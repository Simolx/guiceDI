package cn.sfck.guice.sample.module;

import cn.sfck.guice.sample.ITool;
import cn.sfck.guice.sample.impl.IToolImpl2;
import com.google.inject.AbstractModule;

public class Tool2Module extends AbstractModule {
    @Override
    protected void configure() {
        super.configure();
//        bind(ITool.class).to(IToolImpl2.class);
    }
}
