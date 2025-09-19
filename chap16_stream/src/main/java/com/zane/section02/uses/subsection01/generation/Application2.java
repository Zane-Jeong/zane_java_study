package com.zane.section02.uses.subsection01.generation;

import java.util.stream.LongStream;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        /* 기본 자료형 스트림 생성에 대해 이해하고 사용할 수 있다. */
        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5, 10);
        longStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /* Wrapper 클래스 자료형의 스트림으로 변환이 필요한 경우 boxing 할 수 있다. */
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /* 문자열을 IntStream으로 변환 */
        IntStream helloworldchars = "hello world".chars();
        helloworldchars.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /* 문자열을 split 해서 Stream 생성 */
        Stream<String> splitStream
                = Pattern.compile(", ")
                .splitAsStream("html, css, javascript");
        splitStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /* Stream.of() */
        Stream<String> strStream1 = Stream.of("hello", "world");
        Stream<String> strStream2 = Stream.of("java", "mariadb");

        /* 스트림은 1회용으로만 사용할 수 있다. 최종 연산 (ex. forEach) 등이 수행 된 스트림은
         * 재사용 될 수 없다.
         * 재사용하면 java.lang.IllegalStateException: stream has already been operated upon or closed
         * 와 같은 Exception이 발생한다.
         * */
//        strStream1.forEach(i -> System.out.print(i + " "));

        /* concat() : 스트림 합치기 */
        Stream<String> strStream = Stream.concat(strStream1, strStream2);
        strStream.forEach(i -> System.out.print(i + " "));
        System.out.println();


    }
}
