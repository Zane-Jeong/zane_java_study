package com.zane.level01.basic;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         *
         * 만 20세 미만은 입장 불가입니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식 으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         *
         * 입장하셔도 됩니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         *
         * 날짜 양식을 잘못 입력하셨습니다.
         */
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            String date = sc.nextLine();

            LocalDate birthDate = LocalDate.parse(date);
            LocalDate now = LocalDate.now();
            Period period = Period.between(birthDate, now);
            int years = period.getYears();

            if(20 <= years){
                System.out.println("입장하셔도 됩니다.");
            } else {
                System.out.println("만 20세 미만은 입장 불가입니다.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        }
    }
}
