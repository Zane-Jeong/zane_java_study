package com.zane.section01.array.level04.advanced;
import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        int[] num = new int[4];
        for(int i = 0; i < num.length; i++) {
            int randomNum = (int)(Math.random() * 9) + 1;

            boolean pass = false;
            for(int j = 0; j < i; j++) {
                if(num[j] == randomNum) {
                    pass = true;
                    break;
                }
            }
            if(pass) {
                i--;
            } else {
                num[i] = randomNum;
            }
        }
        System.out.println(Arrays.toString(num));
        // 4개의 난수 생성
        int count = 10;
        while(true) {
            int boll = 0, strike = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("4자리 숫자를 입력하세요 : ");
            String line = sc.nextLine();      // "1234"
            int[] num2 = new int[line.length()];
            for (int i = 0; i < line.length(); i++) {
                num2[i] = line.charAt(i) - '0';  // char → int 변환
            }
            System.out.println(Arrays.toString(num2));
            if (Arrays.equals(num, num2)) {
                System.out.println("정답입니다.");
                break;
            } else if (count == 0) {
                break;
            } else {
                count--;
                System.out.println(count + "회 남으셨습니다.");
                for (int i = 0; i < num.length; i++) {
                    for (int j = 0; j < num.length; j++) {
                        if (num[j] == num2[i]) {
                            boll++;
                        }
                    }
                }
            }
        }
    }
}
