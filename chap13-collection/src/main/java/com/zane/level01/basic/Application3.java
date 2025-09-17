package com.zane.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        boolean check = true;
        while(check){
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            if(!(name.equals("next"))&&!(name.equals("exit"))){
                que.offer(name);
            }
            if(name.equals("next")){
                que.poll();
                if(que.isEmpty()){
                    System.out.println("대기 고객이 없습니다.");
                }
                System.out.println(que.peek() + " 고객님 차례입니다.");
            } else if(name.equals("exit")){
                check = false;
            } else {
                System.out.println(name + " 고객님 대기 등록 되었습니다.");
            }
        }
    }
}
