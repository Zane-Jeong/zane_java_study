package com.zane.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림 중계 연산 중 하나인 Map에 대해 이해할 수 있다.
         * 중계 연산은 최종 연산 수행 전 까지 여러 번 수행할 수 있다.
         * 먼저 일어난 중계 연산의 결과가 파이프라인을 통해 다음 중계 연산으로 전달 된다.
         * map : 스트림에 담긴 데이터를 람다식을 통해 가공하고 가공 된 결과를 새로운 스트림에 전달
         * operator -> 매개변수와 반환형이 동일한 형태 */
        IntStream intStream = IntStream.range(0, 10);
        intStream.filter(i -> i % 2 == 0).map(i -> i * 10).forEach(System.out::println);
    }
}
