package com.zane.section02.dimensional;

public class Application2 {
    public static void main(String[] args) {
        // 2차원 기반 배열을 선언 및 할당하여 사용할 수 있다.
        // 기반 배열의 경우 각 인덱스 별 1차원 배열을 별도로 할당해야 한다.
        int[][] arr = new int[3][];
        System.out.println(arr);
        System.out.println(arr[0]);
//        System.out.println(arr[0][0]);

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        int value = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
