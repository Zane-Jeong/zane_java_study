package com.zane.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하시오.");
        int korean = sc.nextInt();
        System.out.print("수학 점수를 입력하시오.");
        int math = sc.nextInt();
        System.out.print("영어 점수를 입력하시오.");
        int english = sc.nextInt();
        int avg =  ((korean + math + english)/3);
        if (avg <= 60) {
            System.out.println("평균 점수 미달로 불합격입니다.");
        }
        if (korean <= 40) {
            System.out.println("국어 점수 미달로 불합격입니다.");
        }
        if (math <= 40) {
            System.out.println("수학 점수 미달로 불합격입니다.");
        }
        if (english <= 40) {
            System.out.println("영어 점수 미달로 불합격입니다.");
        }
        if (avg > 60 && korean > 40 && english > 40 && math > 40) {
            System.out.println("합격입니다!");
        }

//        if (avg > 60 && korean > 40 && english > 40 && math > 40) {
//            System.out.println("합격입니다!");
//        } else if (avg > 60 && korean > 40 && english > 40) {
//            System.out.println("수학 점수 미달로 불합격입니다.");
//        } else if (avg > 60 && korean > 40 && math > 40) {
//            System.out.println("영어 점수 미달로 불합격입니다.");
//        } else if (avg > 60 && math > 40 && english > 40) {
//            System.out.println("국어 점수 미달로 불합격입니다.");
//        } else if (korean > 40 && math > 40) {
//            System.out.println("평균 점수 미달로 불합격입니다.");
//            System.out.println("영어 점수 미달로 불합격입니다.");
//        } else if (english > 40 && math > 40) {
//            System.out.println("평균 점수 미달로 불합격입니다.");
//            System.out.println("국어 점수 미달로 불합격입니다.");
//        } else if (english > 40 && korean > 40) {
//            System.out.println("평균 점수 미달로 불합격입니다.");
//            System.out.println("수학 점수 미달로 불합격입니다.");
//        } else if (english > 40) {
//            System.out.println("평균 점수 미달로 불합격입니다.");
//            System.out.println("국어 점수 미달로 불합격입니다.");
//            System.out.println("수학 점수 미달로 불합격입니다.");
//        } else if (math > 40) {
//            System.out.println("평균 점수 미달로 불합격입니다.");
//            System.out.println("영어 점수 미달로 불합격입니다.");
//            System.out.println("국어 점수 미달로 불합격입니다.");
//        } else if (korean > 40) {
//            System.out.println("평균 점수 미달로 불합격입니다.");
//            System.out.println("영어 점수 미달로 불합격입니다.");
//            System.out.println("수학 점수 미달로 불합격입니다.");
//        } else {
//            System.out.println("평균 점수 미달로 불합격입니다.");
//            System.out.println("영어 점수 미달로 불합격입니다.");
//            System.out.println("수학 점수 미달로 불합격입니다.");
//            System.out.println("국어 점수 미달로 불합격입니다.");
//        }
    }
}
