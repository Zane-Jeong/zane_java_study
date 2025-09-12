package com.zane.section01.polymorphism;

public class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("Tiger eat");
    }

    @Override
    public void run() {
        System.out.println("Tiger run");
    }

    @Override
    public void cry() {
        System.out.println("Tiger cry");
    }

    public void sleep(){
        System.out.println("Tiger sleep");
    }
}
