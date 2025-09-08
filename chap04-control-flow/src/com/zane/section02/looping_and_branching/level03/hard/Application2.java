package com.zane.section02.looping_and_branching.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        int random = (int)(Math.random() * 100) + 1;
        int i=1;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력하세요 : ");
            int number = sc.nextInt();

            if(number==random){
                System.out.println("정답입니다. "+ i +"회 만에 정답을 맞추셨습니다.");
                break;
            }
            else if(number<random){
                System.out.println("입력하신 정수보다 큽니다.");
                i++;
            }
            else {
                System.out.println("입력하신 정수보다 작습니다.");
                i++;
            }
        }
    }
}
