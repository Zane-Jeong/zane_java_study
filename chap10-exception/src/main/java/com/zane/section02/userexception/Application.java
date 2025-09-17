package com.zane.section02.userexception;

import com.zane.section02.userexception.exception.MoneyNegativeException;
import com.zane.section02.userexception.exception.NotEnoughMoneyException;
import com.zane.section02.userexception.exception.PriceNegativeException;

public class Application {
    public static void main(String[] args) {
        /* 사용자 정의 예외 클래스를 사용할 수 있다. */
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            // 정상 수행
            exceptionTest.checkEnoughMoney(30000, 50000);
            // 상품 가격이 음수
//            exceptionTest.checkEnoughMoney(-30000, 50000);
            // 보유 금액이 음수
//            exceptionTest.checkEnoughMoney(30000, -50000);
            // 보유 금액이 상품 금액보다 작은 경우
            exceptionTest.checkEnoughMoney(50000, 30000);

            /* 예외 상황별로 catch 블럭을 따로 작성해서 처리할 수도 있고,
             * 상위 타입의 Exception으로 통합적으로 처리할 수도 있다.
             * 단 상위 타입이 먼저 기술 되면 아래로 코드가 도달할 수 없으므로 컴파일 에러가 발생한다.
             * 서술 순서는 하위타입 -> 상위 타입으로 기술한다. */
        } catch (PriceNegativeException e) {
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
