package com.zane.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {
        /* String : 불변 갹체, StringBuilder : 가변 객체 */
        StringBuilder sb = new StringBuilder("java");
        /* stringBuilder에도 toString이 오버라이딩 되어 관리되는 문자열을 변환해준다. */
        System.out.println(sb);
        /*object의 hashcode 반환 -> 동일 객체 비교*/
        System.out.println(sb.hashCode());
        /*문자열 수정*/
        sb.append("mariadb");
        System.out.println(sb);
        /* 기존 인스턴스의 문자열 값을 수정해도 주소 값이 동일하다는 것은
        * 새로운 인스턴스가 생성 된 것이 아니라 기존 인스턴스가 수정 된 것이라는 의미 => 기반 객체 */
        System.out.println(sb.hashCode());
    }
}
