package com.zane.section03.grammar;

public class Application {
    public static void main(String[] args) {
        /* Enum Type의 메소드 정리 */
        /* 1. value() : 열거 타입의 모든 값을 배열로 반환 */
        for(EnumType enumType : EnumType.values()){
            System.out.println("Type = " + enumType);
        }
        /* 2. valueOf() : 해당 이름을 가진 열거 타입 상수 반환 */
        for(EnumType enumType : EnumType.values()){
            if(enumType == EnumType.valueOf("JAVA")) {
                System.out.println("valueOf = " + enumType);
            }
        }
        /* 3. ordinal() : 열거 타입의 상수 순서를 리턴 */
        for(EnumType enumType : EnumType.values()){
            System.out.println("ordinal = " + enumType.ordinal());
        }
        /* 4. name() : 열거 타입의 문자열 리턴 */
        for(EnumType enumType : EnumType.values()){
            System.out.println("name = " + enumType.name());
        }

        System.out.println(EnumType.MARIADB.ordinal());
        System.out.println(EnumType.MARIADB.name());
        System.out.println(EnumType.MARIADB.toString());
    }
}
