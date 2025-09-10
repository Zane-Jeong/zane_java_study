package com.zane.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        m1.name = "두치";
        m1.hp = 200;
        System.out.println(m1.name);
        System.out.println(m1.hp);

        Monster m2 = new Monster();
        m2.name = "뿌꾸";
        m2.hp = 200;
        System.out.println(m2.name);
        System.out.println(m2.hp);

        Monster m3 = new Monster();
        m3.name = "뿌꾸";
        m3.setHp(-100);
        System.out.println(m3.name);
        System.out.println(m3.hp);
    }
}
