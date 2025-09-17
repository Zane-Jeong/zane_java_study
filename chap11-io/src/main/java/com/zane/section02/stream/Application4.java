package com.zane.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /* FileWriter
         * : File이라는 외부 자원으로 문자 단위로 출력하는 스트림
         * */
        try (FileWriter fw = new FileWriter("testWriter.txt")) {
            fw.write(97);
            fw.write('A');
            fw.write(new char[] {'a', 'b', 'c'});
            fw.write("안녕하세요");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
