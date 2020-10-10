package cn.sfck.guice.sample.impl;

import cn.sfck.guice.sample.IAnimal;
import cn.sfck.guice.sample.ITool;
import com.google.inject.Inject;

import java.util.Map;

public class Person {

    private IAnimal iAnimal;
    private ITool iTool;
    private Map<String, String> map;

    @Inject
    public Person(IAnimal iAnimal, ITool iTool, Map<String, String> map) {
        this.iAnimal = iAnimal;
        this.iTool = iTool;
        this.map = map;
    }

    public void startWork() {
        iTool.doWork();
        iAnimal.work();
        for(Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
