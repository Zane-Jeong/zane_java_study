package com.zane.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String name = sc.nextLine();
        String name2 = name.replace(" ", "");

        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();
        for (int i = 0; i < name2.length(); i++) {
            char c = name2.charAt(i);
            if (c >= 'a' && c <= 'z') {
                char shifted = (char)('a' + (c - 'a' + number) % 26);
                System.out.print(shifted+" ");
            }
            if (c >= 'A' && c <= 'Z') {
                char shifted = (char)('A' + (c - 'A' + number) % 26);
                System.out.print(shifted+" ");
            }
        }
    }
}
