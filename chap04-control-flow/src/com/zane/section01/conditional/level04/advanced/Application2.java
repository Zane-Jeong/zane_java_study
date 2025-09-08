package com.zane.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여액 : ");
        int salary = sc.nextInt();
        System.out.print("월 매출액 : ");
        int sales = sc.nextInt();
        double bonus;

        if (sales > 50000000) {
            bonus = 0.05;
        } else if (sales > 30000000) {
            bonus = 0.03;
        } else if (sales > 10000000) {
            bonus = 0.01;
        } else {
            bonus = 0;
        }

        double pay = (salary+(sales*bonus));

        System.out.println("======================");
        System.out.println("매출액 : " + sales);
        System.out.println("보너스율 : " + bonus);
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + (sales*bonus));
        System.out.println("======================");
        System.out.println("총 급여 : " + pay);
    }
}
