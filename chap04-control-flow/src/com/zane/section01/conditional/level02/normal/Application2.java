package com.zane.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 키를 입력해주세요.");
        int m = sc.nextInt();
        System.out.println("당신의 몸우게를 입력해주세요.");
        int kg = sc.nextInt();
        double bmi = kg/((m*0.01)*(m*0.01));
        if (bmi<20) {
            System.out.println("당신은 저체중 입니다.");
        } else if (bmi>20 && bmi<25) {
            System.out.println("당신은 정상체중 입니다.");
        } else if (bmi>25 && bmi<30) {
            System.out.println("당신은 과체중 입니다.");
        } else {
            System.out.println("당신은 비만입니다.");
        }
    }
}
