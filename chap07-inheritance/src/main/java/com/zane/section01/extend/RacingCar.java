package com.zane.section01.extend;

public class RacingCar extends Car {
    @Override
    public void run() {
//        super.run(); // 부모 인스턴스의 주소값
        System.out.println("레이싱카가 전속력으로 질주합니다!!!");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }

    /* 레이싱카는 경적을 울리는 기능이 필요하지 않지만
    * Car를 상속 받았기 때문에 어쩔 수 없이 해당 기능을 보유하게 되었음.
    * => 상속 구조로 인해 불필요한 기능이 추가 될 수도 있음 */
    @Override
    public void soundHorn() {
//        System.out.println("");
    }
}
