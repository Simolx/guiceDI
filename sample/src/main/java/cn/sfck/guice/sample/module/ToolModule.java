package cn.sfck.guice.sample.module;

import cn.sfck.guice.sample.IAnimal;
import cn.sfck.guice.sample.ITool;
import cn.sfck.guice.sample.impl.IAnimalImpl;
import cn.sfck.guice.sample.impl.IToolImpl;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

public class ToolModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IAnimal.class).to(IAnimalImpl.class);
        bind(ITool.class).to(IToolImpl.class);

        MapBinder<String, String> mapBinder = MapBinder.newMapBinder(binder(), String.class, String.class);
        mapBinder.addBinding("testKey1").toInstance("testValue1");
        mapBinder.addBinding("testKey2").toInstance("testValue2");
    }
}
