package zane.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class UI {
    private Scanner sc = new Scanner(System.in);
    private NoteManager manager = new NoteManager(); // 반복문 밖에 객체 생성
    public void run() {
        while (true) {
            System.out.println("1. 일정 입력");
            System.out.println("2. 일정 조회");
            System.out.println("3. 일정 저장");
            System.out.println("0. 종료");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inputNote();
                    break;
                case 2:
                    manager.showNotes(); // NoteManager에서 일정 조회
                    break;
                case 3:
                    System.out.println("모든 일정을 저장합니다.");
                    FileSave.saveNotes(manager.getNotes(), "notes.txt");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("입력 방식이 올바르지 않습니다.");
                    break;
            }
        }
    }
    private void inputNote() {
        sc.nextLine(); // 버퍼 비우기
        System.out.print("날짜를 입력하세요 (Ex. 2025-09-19 : ");
        String date = sc.nextLine();
        System.out.print("내용 : ");
        String content = sc.nextLine();

        manager.addNote(date, content); // 기존 NoteManager 객체에 저장
        System.out.println("일정이 등록되었습니다.");
    }
    public static void main(String[] args) {
        new UI().run();
    }
}
