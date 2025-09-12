package com.zane.section01.polymorphism;

public class Application {
    public static void main(String[] args) {
        /* Rabbit은 Rabbit이기도 하지만 */

        /* 부모타입의 레퍼런스 변수를 통해 자식타입의 인스턴스를 참조할 수 있다. */
        Animal a1 =  new Rabbit();
        Animal a2 = new Tiger();

        /* 컴파일 당시에는 해당 타입(Animal)의 메소드와 연결이 되어 있다가 (정적 바인딩)
        * 런타임 당시 실제 객체 (Rabbit or Tiger)가 가진 오버라이딩 된 메소드로
        * 바인딩이 바뀌어 동작 (동적 바인딩) */
        a1.cry();
        a2.cry();

        /* 현재 레퍼런스 변수 타입은 animal 이기 때문에 Rabbit, Tiger 에만 작성한 메소드 호출 불가*/
//        a1.jump();
//        a2.sleep();
        /* Animal 타입을 Rabbit or Tiger 타입으로 형변환하면 각 메소드 호출 가능*/
        ((Rabbit)a1).jump();
        ((Tiger)a2).sleep();
    }
}
