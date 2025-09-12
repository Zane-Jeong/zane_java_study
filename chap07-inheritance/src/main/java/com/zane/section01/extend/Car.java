package com.zane.section01.extend;

public class Car {
    private boolean runningStatus;

    public Car() {
        System.out.println("Car 클래스 기본 생성자 호출");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    // 클래스 내부에서 필요한 경우 호출
//    private  boolean isRunning() {
    protected  boolean isRunning() {
        return runningStatus;
    }

    public void soundHorn() {
        if (isRunning()) {
            System.out.println("경적!");
        } else {
            System.out.println("주행 중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }
}
