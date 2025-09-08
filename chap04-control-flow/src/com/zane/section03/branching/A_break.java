package com.zane.section03.branching;

public class A_break {
    public void testSimpleBreakStatement()
    {
        int i=1;
        int sum=0;
        while(true) {
            sum += i++;
            if(i>100)break;
        }
        System.out.println("sum = " +sum);
    }
}
