package com.zane.section01.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /* Wrapper 클래스 사용법을 이해할 수 있다. */
        int num = 128;
        /*Wrapper 클래스의 생성자는 1.9 버전부터 Deprecated 되었다.*/
//        Integer num1 = new Integer(num);
        /* Boxing : int -> Interger */
        Integer num1 = Integer.valueOf(num);
        /* Auto Boxing */
        Integer num2 = num;

        /* UnBoxing : Interger -> int */
        int num3 = num2.intValue();
        /*Auto UnBoxing*/
        int num4 = num2;
        /* integer.valueOf 메소드가 byte 값의 범위는 캐싱하고 있어서 작은 숫자로 비교하면
        * num1 == num2 : true가 나올 수 있다. */
        System.out.println(num1 == num2); // 주소값 비교
        // 위에num 값의 범위가 바이트 이내이면 true인데 이거는 원칙에 어긋나는 행동
        System.out.println(num2 == num3); // 값 비교
        System.out.println(num3 == num4); // 값 비교

        // 인스턴스의 값 비교가 필요할 때 (동등성 비교)는 wquals
        System.out.println(num1.equals(num2));
    }
}
