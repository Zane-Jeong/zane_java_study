package com.zane.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("문자열 입력 : ");
        boolean isEnglish = true;
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                // 영어 문자가 아닌 경우
                isEnglish = false;
                break; // 한 글자라도 영어가 아니면 바로 탈출
            }
        }
        if (isEnglish) {
            System.out.print("문자 입력 : ");
            char a = sc.next().charAt(0);

            for(int i=0; i<name.length(); i++){
                if(name.charAt(i)==a){
                    n++;
                }
            }
            System.out.println("포함된 갯수 : "+n);
        } else {
            System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
        }
    }
}
