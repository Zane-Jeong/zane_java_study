package com.zane.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        String birthdate = sc.nextLine();
        String copy = birthdate.substring(0, 7);
        System.out.print(copy + "******");
    }
}
