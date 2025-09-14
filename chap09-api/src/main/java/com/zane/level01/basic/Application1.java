package com.zane.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        System.out.print("문자열 입력: ");
        String text = sc.nextLine(); // String 입력
        String[] arr = new String[text.length()];
        String[] newText = text.split(" ");
        System.out.print("반환된 문자열: ");
        for(int i = 0; i < newText.length; i++) {
            arr[i] = newText[i].substring(0, 1).toUpperCase() + newText[i].substring(1);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n총 단어 개수: " + newText.length);
    }
}
