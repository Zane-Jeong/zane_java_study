package com.zane.section02.assertj;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

class AssertJTests {
    /* 3rd party lib 중 AssertJ의 사용법에 대해 이해할 수 있다. */

    @Test
    @DisplayName("문자열 테스트")
    void testStringValidation() {
        //given
        String expected = "hello world";
        //when
        String actual = new String(expected);
        //then
        Assertions.assertThat(actual)
                .isNotEmpty()
                .isNotBlank()
                .contains("hello")
                .doesNotContain("haha")
                .startsWith("h")
                .endsWith("a")
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("숫자 테스트")
    void testIntegerValidation() {
        double pi = Math.PI;
        Double actual = pi;

        Assertions.assertThat(actual)
                .isPositive()
                .isGreaterThan(3)
                .isLessThan(4)
                .isEqualTo(pi);
    }

    @Test
    @DisplayName("날짜 테스트 하기")
    void testLocalDateTimeValidation() {
        String birthday = "2014-09-18T16:42:00.000";
        LocalDateTime theDay = LocalDateTime.parse(birthday);

        Assertions.assertThat(theDay)
                .hasYear(2014)
                .hasMonthValue(9)
                .hasDayOfMonth(18)
                .isBetween("2014-01-01T16:42:00.000", "2014-12-31T16:42:00.000")
                .isBefore(LocalDateTime.now());
    }

    @Test
    @DisplayName("예외 테스트 하기")
    void testExceptionValidation() {
        Throwable thrown = AssertionsForClassTypes.catchThrowable(
                () -> {
                    throw new IllegalArgumentException("잘못 된 파라미터를 입력하였습니다.");
                }
        );

        Assertions.assertThat(thrown)
                .hasMessageContaining("파라미터")
                .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    @DisplayName("filtering assertions 테스트")
    void testFilteringAssertions() {
        Member member1 = new Member(1, "user01", "홍길동", 16);
        Member member2 = new Member(2, "user02", "이순신", 20);
        Member member3 = new Member(3, "user03", "선덕여왕", 40);

        List<Member> members = Arrays.asList(
                member1, member2, member3
        );

        Assertions.assertThat(members)
                .filteredOn(member -> member.getAge() > 18)
                .containsOnly(member2, member3);

    }



}
