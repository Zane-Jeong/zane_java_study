package com.zane.section01.array.level04.advanced;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] rotto = new int[6];
        for (int i = 0; i < rotto.length; i++) {
            int randomNum = (int)(Math.random() * 45) + 1;

            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (rotto[j] == randomNum) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) {
                i--; // 같은 숫자 나오면 다시 뽑기
            } else {
                rotto[i] = randomNum;
            }
        }
        Arrays.sort(rotto);
        System.out.println(Arrays.toString(rotto));
    }
}
