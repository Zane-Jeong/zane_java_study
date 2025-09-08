package com.zane.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();
        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);
        int result = 0;


        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case  '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }
        System.out.println("첫 번째 정수 = " + num1);
        System.out.println("두 번째 정수 = " + num2);
        System.out.println("연산 결과 = " + result);
    }
}
