package com.zane.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); //문자열 길이 16 디폴트 값

        for (int i=0; i<50; i++)
        {
            sb.append(i);
            System.out.println("sb = " + sb);
            System.out.println("sb.cap = " + sb.capacity());
            System.out.println("sb.hash = " + sb.hashCode());
        }

        StringBuilder sb2 = new StringBuilder("javaoracle");
        System.out.println("sb2 = " + sb2);
        System.out.println("delete = " + sb2.delete(2,5));
        System.out.println("deleteCharAt = " + sb2.deleteCharAt(0));
        System.out.println("sb2 = " + sb2);

        System.out.println("insert : " + sb2.insert(1, "vao"));
        System.out.println("insert : " + sb2.insert(0, "j"));


        System.out.println("reserse = " + sb2.reverse());

    }
}
