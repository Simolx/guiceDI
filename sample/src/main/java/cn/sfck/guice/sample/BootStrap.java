package cn.sfck.guice.sample;

import cn.sfck.guice.sample.impl.Person;
import cn.sfck.guice.sample.module.CustomModuleBuilder;
import cn.sfck.guice.sample.module.HumanModule;
import cn.sfck.guice.sample.module.Tool2Module;
import cn.sfck.guice.sample.module.ToolModule;
import com.google.inject.Injector;

public class BootStrap {
    public static void main(String[] args) {
        CustomModuleBuilder moduleBuilder = new CustomModuleBuilder();
        moduleBuilder.add(new ToolModule());
        moduleBuilder.add(new HumanModule());
        moduleBuilder.add(new Tool2Module());
        Injector injector = moduleBuilder.createInjector();
        Person person = injector.getInstance(Person.class);
        person.startWork();
        ITool iTool = injector.getInstance(ITool.class);
        iTool.doWork();
    }
}
