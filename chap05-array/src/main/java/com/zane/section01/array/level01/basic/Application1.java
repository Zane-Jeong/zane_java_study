package com.zane.section01.array.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0, num = 1; i < arr.length; i++)
        {
            arr[i]+=num;
            System.out.println(arr[i]);
            num++;
        }
    }
}
