package com.zane.section04.constructor;

import java.util.Date;

public class User {
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    // 생성자 선언부

    //기본 생성자
    // 클래스 내부에 작성 된 생성자가 0개일 경우 컴파일러가 자동으로 기본 생성자를 생성
    public User() {
        System.out.println("기본 생성자 동작 확인");
    }

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User id, pwd 초기화 생성자 동작 확인");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
//        동일 클래스 내에서 다른 생성자 메소드를 호출하는 구문
//        this(id, pwd);
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("User id, pwd, name, enrollDate 초기화 생성자 동작 확인");
    }


    // 메소드 선언부
    public String getInformation() {
        return id + " " + pwd + " " + name + " " + enrollDate;
    }
}
