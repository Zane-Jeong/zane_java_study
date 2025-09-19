package com.zane.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        /* 스트림의 중계 연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다. */
        List<List<String>> list = Arrays.asList(
                Arrays.asList("Java", "Spring", "Spring Boot"),
                Arrays.asList("JAVA", "SPRING", "SPRING BOOT")
        );

        System.out.println(list);

        List<String> flatList = list
                .stream()
                .flatMap(Collection::stream)                // 중간 연산
                .collect(Collectors.toList());              // 최종 연산 (Stream -> List) //추가 수정 가능

        System.out.println(flatList);

        /* collect(Collectors.toList()) vs toList() */
        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java Stream API",
                "flatMap Example"
        );
        System.out.println(sentences);

        List<String> words = sentences
                .stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .toList(); // 읽기 전용이므로 list이지만 추가 수정이 불가능

        System.out.println(words);

        // 반환 된 리스트는 수정 불가 읽기 전용이므로 add 시 Exception 발생
        // java.lang.UnsupportedOperationException
//        words.add("단어 추가");

    }
}
