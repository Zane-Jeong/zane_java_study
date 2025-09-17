package com.zane.section01.intro;

public class Application1 {
    public static void main(String[] args) {
        /* 인터페이스에 정의 된 추상 메소드를 활용하는 방법 */

        /* 1. 인터페이스를 구현한 클래스를 정의하며 기능을 완성한 뒤 사용한다. */
        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.sumTwoNumber(10, 20));

        /* 2. 익명 클래스를 사용해서 기능을 완성한 뒤 사용한다. */
        Calculator calculator2 = new CalculatorImpl() {
            @Override
            public int sumTwoNumber(int a, int b) {
                return a + b;
            }
        };
        System.out.println(calculator2.sumTwoNumber(10, 50));

        /* 3. 람다식을 이용한 방법 */
        Calculator calculator3 = (a, b) -> a + b;
        System.out.println(calculator3.sumTwoNumber(10, 90));
    }
}
