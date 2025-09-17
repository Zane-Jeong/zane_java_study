package com.zane.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /* FileReader
         * : File이라는 외부 자원과 연결 되어 문자 단위로 입력 받는 메소드 */
        try (FileReader fr = new FileReader("testReader.txt")) {

//            int val;
//            while ((val = fr.read()) != -1) {
//                System.out.print((char) val);
//            }

            char[] arr = new char[100];
            fr.read(arr);
            for(char c : arr){
                System.out.print(c);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
