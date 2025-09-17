package com.zane.section02.extend;

public class MethodFarm {
    public <T> void animalType (T t1, T t2) {}
    public <T extends Mammal> void mammalType (T t) {}
    public <T extends Reptile> void reptileType (T t) {}
}
