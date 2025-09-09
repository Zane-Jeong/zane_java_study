package com.zane.section01.array.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        String[] fruits = new String[5];
        fruits[0] = "딸기";
        fruits[1] = "바나나";
        fruits[2] = "복숭아";
        fruits[3] = "키위";
        fruits[4] = "사과";
        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력해세요 : ");
        int num = sc.nextInt();
        if(num>=0 && num<5){
            System.out.println(fruits[num]);
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }


    }
}
