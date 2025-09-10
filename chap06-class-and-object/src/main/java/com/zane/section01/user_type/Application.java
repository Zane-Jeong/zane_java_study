package com.zane.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /* 사용자 정의 자료형 사용하기 */
        /* 변수 선언 및 객체 생성
        * 클래스명 변수명 = new 클래스명(); <- 객체(instance)를 생성하는 구분
        * 객체를 생성하면 클래스에 정의한 필드(전역 변수)와 메소드 대로 객체가 heap 영역에 생성된다.
         */
        Member member = new Member();
        /* 필드에 접근하기 위해 레퍼런스변수명.필드명 으로 접근한다.
        * '.'은 참조연산자이며 레퍼런스 변수가 참조하는 주소로 접근한다는 의미이다.
         */
        System.out.println(member.id);
        System.out.println(member.pwd);
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.gender);
        System.out.println(member.hobby);

        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] {"축구", "볼링", "테니스"};

        System.out.println("변경 후 member.id : " + member.id);
        System.out.println("변경 후 member.pwd : " + member.pwd);
        System.out.println("변경 후 member.name : " + member.name);
        System.out.println("변경 후 member.age : " + member.age);
        System.out.println("변경 후 member.gender : " + member.gender);
        System.out.print("변경 후 member.hobby : ");
        System.out.print(Arrays.toString(member.hobby));
        for(int i = 0; i < member.hobby.length; i++) {
            System.out.print(member.hobby[i] + " ");
        }
    }
}
