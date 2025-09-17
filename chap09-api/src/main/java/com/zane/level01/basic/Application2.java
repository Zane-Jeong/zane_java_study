package com.zane.level01.basic;

import java.util.Scanner;
import java.util.*;

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

// 단어 빈도 저장할 HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : newText) {
            if (word.trim().length() == 0) continue; // 빈 문자열은 패스

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);   // 기존 값 +1
            } else {
                map.put(word, 1);                   // 처음 등장
            }
        }

// 단어와 빈도 출력
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

// 가장 많이 나온 단어 찾기
        String mostWord = null;
        int maxCount = 0;
        for (String key : map.keySet()) {
            int count = map.get(key);
            if (count > maxCount) {
                maxCount = count;
                mostWord = key;
            }
        }
        System.out.println("가장 빈도 높은 단어 : " + mostWord + " (" + maxCount + " 번)");
    }
}
