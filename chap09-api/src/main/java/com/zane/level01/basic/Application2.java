package com.zane.level01.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        System.out.print("문자열 입력: ");
        String text = sc.nextLine(); // String 입력
        String onlyEnglish = text.replaceAll("[^a-zA-Z]", " "); // 텍스트에서 영어만 추출
        String textLow = onlyEnglish.toLowerCase(); // 대문자 -> 소문자 변경
        String[] newText = textLow.split(" "); // 공백 기준으로 단어 나눠서 저장
        for(int i = 0; i < newText.length; i++) {
            System.out.println("newText[" + i + "] : " + newText[i]);		//정상 출력
        }
        System.out.println("===== 단어 빈도 =====");
        for (int j = 0; j < newText.length - 1; j++) {
            for (int i = j + 1; i < newText.length; i++) {
                if (!newText[j].isEmpty() && newText[j].equals(newText[i])) {
                    System.out.println(newText[i]);
                }
            }
        }
    }
}
