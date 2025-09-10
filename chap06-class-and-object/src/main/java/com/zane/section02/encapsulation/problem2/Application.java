package com.zane.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {
        // 필드에 직접 접근이 가능한 경우 발생하는 문제점을 이해한다
        // 필드에 변경이 발생하면 사용했던 코드를 모두 수정해야 한다.
        // 이는 유지보수적인 측면에서 악영향을 끼친다.
        Monster m1 = new Monster();
//        m1.name = "두치";
        m1.hp = 200;
//        System.out.println(m1.name);
        System.out.println(m1.hp);

        Monster m2 = new Monster();
//        m2.name = "뿌꾸";
        m2.hp = 200;
//        System.out.println(m2.name);
        System.out.println(m2.hp);

        Monster m3 = new Monster();
        m3.setInfo("드라큘라");
        System.out.println(m3.getInfo());

        // 아직 직접접근이 막혀있는 상태는 아님
        System.out.println();
    }
}
