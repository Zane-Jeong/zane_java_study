package com.zane.section01.list;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* Stack */
        Stack<Integer> integerStack = new Stack<>();

        /* Vector를 상속했기 때문에 add 메소드를 사용할 수는 있으나
        * Stack 의 사용 방법에 맞도록 push 메소드를 통해 데이터를 추가하는 것이 권장된다.*/

//        integerStack.add(1); add 보다는 push 사용
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack: " + integerStack);

        /* stack에서 요소를 찾을 때 : search */
        /* 인덱스가 아닌 위에서부터의 순번을 반환한다.
        * 가장 상단에 쌓인 요소는 1을 반환한다. */
        System.out.println(integerStack.search(1));

        /* 스텍에서 요소를 꺼내는 메소드
        * peek : 가장 마지막(상단)에 있는 요소 반환
        * pop : 가장 마지막(상단)에 있는 요소 제거 후 반환
        * */
        System.out.println("peek: " + integerStack.peek());
        System.out.println("integerStack: " + integerStack);

        System.out.println("pop: " + integerStack.pop());
        System.out.println("integerStack: " + integerStack);

        System.out.println("pop: " + integerStack.pop());
        System.out.println("pop: " + integerStack.pop());
        System.out.println("pop: " + integerStack.pop());
        System.out.println("pop: " + integerStack.pop());

        /* stack에 담긴 요소가 없으나 꺼내게 되면 java.util.Empt*/
//        System.out.println("pop: " + integerStack.pop());
    }
}
