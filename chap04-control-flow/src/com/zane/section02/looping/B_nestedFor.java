package com.zane.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNice(){
        for(int j=2; j<=9; j++) {
            System.out.println("====="+j+"단=====");
            for (int i=1; i<=9; i++) {
                System.out.println(j+"*"+i+"="+(j*i));
            }
            System.out.println();
        }
    }
    public void printTringStatement(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("출력하고 싶은 행의 개수 : ");
        int row = scanner.nextInt();
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

