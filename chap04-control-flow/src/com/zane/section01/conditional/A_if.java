package com.zane.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("숫자 하나 입력 : ");
        int num=scanner.nextInt();
        if(num % 2 == 0){
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfStatement(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num=scanner.nextInt();
        if(num > 0){
            if(num % 2 == 0){
                System.out.println("입력하신 숫자는 짝수입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }



}
