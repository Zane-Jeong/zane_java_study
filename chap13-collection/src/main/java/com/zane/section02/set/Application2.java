package com.zane.section02.set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Application2 {
    public static void main(String[] args) {
        /* LinkedHashSet : 저장 순서 유지 */
        LinkedHashSet<String> lSet = new LinkedHashSet<>();
        lSet.add("java");
        lSet.add("css");
        lSet.add("html");
        lSet.add("mysql");
        lSet.add("java");

        System.out.println("lset : " + lSet);
    }
}
