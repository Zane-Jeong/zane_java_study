package com.zane.level01.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList();
        boolean check = true;
        double sum = 0.0;
        while(check){
            Scanner sc = new Scanner(System.in);
            System.out.print("학생 성적 : ");
            score.add(sc.nextInt());
            System.out.print("추가 입력하려면 y : ");
            char ch = sc.next().charAt(0);
            if((ch == 'n')||(ch == 'N')){
                check = false;
            }
        }
        for(int i=0; i<score.size(); i++){
            sum += score.get(i);
        }
        System.out.println("학생 인원 : " + score.size());
        System.out.println("평균 점수 : " + sum/3);
    }
}
