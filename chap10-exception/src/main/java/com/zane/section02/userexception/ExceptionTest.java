package com.zane.section02.userexception;

import com.zane.section02.userexception.exception.MoneyNegativeException;
import com.zane.section02.userexception.exception.NegativeException;
import com.zane.section02.userexception.exception.NotEnoughMoneyException;
import com.zane.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    /* throws 구문 작성 시 여러 Exception을 , 로 나열할 수 있으며
     * 상속 구조에 따라 상위 타입의 Exception 만 작성할 수도 있다. */
    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
//            throws NegativeException, NotEnoughMoneyException {
//            throws Exception {

        if(price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
        if(money < 0) {
            throw new MoneyNegativeException("보유 금액은 음수일 수 없습니다.");
        }
        if(money < price) {
            throw new NotEnoughMoneyException("보유 금액보다 상품 가격이 더 비쌉니다.");
        }

        System.out.println("즐거운 쇼핑하세요~");

    }
}
