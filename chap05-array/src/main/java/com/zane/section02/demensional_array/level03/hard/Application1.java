package com.zane.section02.demensional_array.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("가로 행의 수를 입력하세요 : ");
            int n = sc.nextInt();
            System.out.print("세로 열의 수를 입력하세요 : ");
            int m = sc.nextInt();
            if(n<=10 && m<=10){
                char[][] text =  new char[n][m];
                for (int i=0; i<text.length; i++) {
                    for (int j=0; j<text[i].length; j++) {
                        char randomAlphabet = (char) ('A' + (int)(Math.random() * 26));
                        text[i][j] = randomAlphabet;
                        System.out.print(text[i][j] + "   ");
                    }
                    System.out.println();
                }
                break;
            }
            else {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }
        }
    }
}
