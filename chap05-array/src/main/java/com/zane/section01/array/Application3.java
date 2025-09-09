package com.zane.section01.array;

public class Application3 {
    public static void main(String[] args) {
        int[] iarr = new int[10];
        for (int i : iarr) {
            System.out.print(i + " ");
        }

        String[] sarr = new String[5];
        for (String s : sarr) {
            System.out.print(s + " ");
        }

        int[] iarr1 = new int[]{1, 2, 3, 4, 5};
        int[] iarr2 = {1, 2, 3, 4, 5};
        for(int i : iarr1) {
            System.out.print(i + " ");
        }
    }
}
