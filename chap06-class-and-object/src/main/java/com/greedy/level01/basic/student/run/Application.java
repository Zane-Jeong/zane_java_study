package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int i = 0;
        char check;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        StudentDTO[] student = new StudentDTO[3];
        while (flag) {
            System.out.print("학년: ");
            int grade = sc.nextInt();

            System.out.print("반: ");
            int classroom = sc.nextInt();

            System.out.print("이름: ");
            String name = sc.next();

            System.out.print("국어 점수: ");
            int kor = sc.nextInt();

            System.out.print("영어 점수: ");
            int eng = sc.nextInt();

            System.out.print("수학 점수: ");
            int math = sc.nextInt();

            while(true) {
                System.out.print("계속 추가할 겁니까 ? (y/n) : ");
                check = sc.next().charAt(0);

                // 허용 값인지 확인
                if(check == 'y' || check == 'Y') {
                    break; // 올바른 값이면 반복 종료
                } else if (check == 'n' || check == 'N') {
                    flag = false;
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. y/Y 또는 n/N 만 입력하세요.");
                }
            }
            sc.nextLine(); // 개행 처리
            // 입력받은 값으로 객체 생성
            student[i] = new StudentDTO(grade, classroom, name, kor, eng, math);
            i++;
        }
        for (int j = 0; j<student.length; j++) {  // i는 입력된 학생 수
            System.out.println(student[j].getInformation());
        }

        for (i = 0; i < student.length; i++) {
            System.out.println(student[i].getInformation());
        }
    }
}
