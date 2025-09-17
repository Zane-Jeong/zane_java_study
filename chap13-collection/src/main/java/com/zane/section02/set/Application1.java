package com.zane.section02.set;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*Hashset*/
        HashSet<String> hset = new HashSet<>();
        Set<String> set = new HashSet<>();
        Collection<String> cset = new HashSet<>();

        hset.add(new String("java"));
        hset.add(new String("mysql"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));
        hset.add(new String("java"));

        /* 1. 저장 순서가 유지 되지 않는다. (HashSet은  Hash 연산을 통해 저장 관리)
        * 2. 중복 값은 저장 되지 않는다. (동일 객체 뿐만 아니라 동등 객체도 중복으로 판별
        * => String의 hashCode, equals가 활용 되었음)*/
        System.out.println("hset : " + hset);

        /* 재정의 된 equals를 통해 포함 여부를 확인하고있으므로 동등 객체가 있음을 확인할 수 있다.*/
        System.out.println(hset.contains(new String("hdmi")));

        /* Set의 데이터를 순회하는 방법
        * 1. 배열로 변경 */
        Object[] arr = hset.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(i + " : " + arr[i]);
        }

        /* 2. Iterable의 iterator 메소드 (반복자)*/
        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            /* Iterator의 remove 메소드를 활용하면 순회하면서 제거할 수 있다.*/
            iter.remove();
        }

        /* 3. 향상 된 for 문*/
        for (String str: hset){
            System.out.println("str : " + str);
//            hset.remove(str);
        }
    }
}
