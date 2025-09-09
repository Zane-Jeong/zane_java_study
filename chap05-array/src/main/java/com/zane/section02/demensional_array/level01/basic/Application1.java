package com.zane.section02.demensional_array.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        int value = 1;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                array[i][j] = value++;
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
