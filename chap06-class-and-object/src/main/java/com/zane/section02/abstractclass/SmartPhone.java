package com.zane.section02.abstractclass;

/* 추상 클래스의 상속 받는 추상 클래스로 만들 수도 있다. */
public class SmartPhone extends Product{
    /*추상 클래스를 상속받는 경우 추상 메소드를 반드시 오버라이딩해서 완성해야 한다는
    * 강제가 생긴다. (도는 본인도 추상클래스가 되어야 한다) */
    @Override
    public void abstMethod() {
        System.out.println("SmartPhone에서 abstMethod 오버라이딩");
    }
    public void printSmartPhone() {
        System.out.println("SmartPhone의 printSmartPhone 메소드 호출");
    }
}
