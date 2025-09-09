package com.zane.section01.array;

public class Application1 {
    public static void main(String[] args) {

        /* 배열의 선언 및 할당 */
        int[] arr = new int[5];

        /* 하나의 이름으로 관리되는 연속된 메모리 공간이고, 공간마다 찾아갈 수 있는 번호(인덱스)를 이용해 접근한다. */
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        /* 값을 대입할때도 반복문을 사용할 수 있다. */
        for(int i = 0, value = 0; i < arr.length; i++){
            arr[i] = value += 10;
        }

        /* 배열의 값을 누적해서 담을 변수 선언 */
        int sum1 = 0;

        /* 일반적인 변수처럼 사용할 수 도 있다. */
        sum1 += arr[0];
        sum1 += arr[1];
        sum1 += arr[2];
        sum1 += arr[3];
        sum1 += arr[4];

        System.out.println("sum1 : " + sum1);

        /* 배열의 값을 반복문을 이용해서 누적하여 담을 변수 */
        int sum2 = 0;

        /* 값을 누적시킬 때도 반복문을 사용할 수 있다. */
        for(int i = 0, value = 0; i < arr.length; i++){
            sum2 += arr[i];
        }

        System.out.println("sum2 : " + sum2);
    }
}
