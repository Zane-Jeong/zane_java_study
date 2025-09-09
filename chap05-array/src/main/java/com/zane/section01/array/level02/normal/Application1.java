package com.zane.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String str = sc.nextLine();
        System.out.print("검색할 문자를 입력하세요 : ");
        String search = sc.nextLine();
        char c = search.charAt(0);
        int value = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                value++;
            }
        }
        System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + c + "은" + value + " 개입니다.");
    }
}
