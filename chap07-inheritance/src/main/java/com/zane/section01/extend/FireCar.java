package com.zane.section01.extend;

/* Car 클래스의 모든 멤버(필드, 메소드)를 상속 받을 수 있다.
* 단, 생성자는 상속 받지 못한다.
* */
public class FireCar extends Car {
    public FireCar() {
        /* 모든 생성자의 첫 줄에 supper()를 컴파일러가 자동으로 추가한다.
        * 부모의 기본 생성자를 호출하는 구문으로 명시적 or 묵시적으로 사용 가능하다. */
        super(); // 내가 명시를 하지 않아도 컴파일러가 알아서 추가를 함
        System.out.println("Fire Car 클래스 기본 생성자 호출");
    }

    /* 부모가 가진 기능을 자식이 고쳐서 사용 (재작성, 오버라이딩)
    * @Override 어노테이션을 작성하면 오버라이딩 성립 요건을 체크하여 컴파일 에러 발생 시켜줌
    * */
    @Override
    public void soundHorn() {
        /* private 접근 제어자가 붙은 필드, 메소드는 상속은 받지만 자식이 접근할 수 없다.
         * protected로 접근 제어자를 변경하면 자식이 접근할 수 있다. */
        if (isRunning()) {
            System.out.println("FireCar 경적!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다. 꺼지세요~");
        }
    }
    /* 상속은 자식 클래스가 부모 클래스를 확장하는 것이므로 FireCar만의 추가 기능도 작성 가능하다.
    * */
    public void sprayWater() {
        System.out.println("물을 뿌립니다 ============>>>>>>>>>>>");
    }
}
