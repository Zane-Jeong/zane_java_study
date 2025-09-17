package com.zane.level01.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        List<String> url = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while(check){
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            url.add(0, sc.next());
            for(int i = 0; i < url.size(); i++){
                if(url.get(i).equals("exit")) {
                    check = false;
                }
            }
            System.out.print("최근 방문 url : ");
            System.out.println(url);
        }
    }
}
