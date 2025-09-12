package com.zane.section01.string;

public class Application2 {
    public static void main(String[] args) {
        /* 문자열 객체를 만드는 2가지 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리
        * new String ("문자열") : 매번 새로운 인스턴스 생성
        * */
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));

        /* */
        System.out.println("str1.hashCode() : " +  str1.hashCode());
        System.out.println("str2.hashCode() : " +  str2.hashCode());
        System.out.println("str3.hashCode() : " +  str3.hashCode());
        System.out.println("str4.hashCode() : " +  str4.hashCode());
        System.out.println("-----");
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        /*문자열은 불변이라는 특성을 가진다.*/
//        str2 += "mariadb";
        System.out.println("str1 == str2 : " + (str1 == str2));

        /**/
        System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
        System.out.println("str1.equals(str3) : " + (str2.equals(str3)));
        System.out.println("str1.equals(str4) : " + (str3.equals(str4)));
        System.out.println("str1.equals(str4) : " + (str2.equals(str4)));
    }
}

