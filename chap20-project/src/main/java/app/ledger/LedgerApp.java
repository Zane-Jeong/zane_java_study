package app.ledger;

import java.util.Scanner;

public class LedgerApp {
    private final LedgerService ledgerService;
    private final Scanner sc;

    public LedgerApp() {
        this.ledgerService = new LedgerService(); // LedgerService ledgerService = new LedgerService();
        this.sc = new Scanner(System.in); // Scanner sc = new Scanner(System.in);
    }

    public void run() {
        int balance = ledgerService.loadBalance(sc);

        while (true) {
            System.out.println("\n=== 가난뱅이 가게부 ===");
            System.out.println("1. 금액 확인");
            System.out.println("2. 수입 작성");
            System.out.println("3. 지출 작성");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case 2:
//                    System.out.print("수입 금액 입력: ");
//                    int income = sc.nextInt();
//                    if (income < 0) {
//                        System.out.println("잘못 된 입력입니다.");
//                    }
//                    balance = ledgerService.addIncome(balance, income);
//                    System.out.println("수입 등록 완료! 현재 잔액: " + balance + "원");
                    while (true) {
                        System.out.print("수입 금액 입력: ");
                        int income = sc.nextInt();
                        if (income < 0) {
                            System.out.println("잘못 된 입력입니다.");
                            break;
                        }
                        balance = ledgerService.addIncome(balance, income);
                        System.out.println("수입 등록 완료! 현재 잔액: " + balance + "원");
                        break;
                    }
                    break;
                case 3:
                    System.out.print("지출 금액 입력: ");
                    int expense = sc.nextInt();
                    if ((expense > balance) && (expense > 0)) {
                        System.out.println("금액이 부족합니다.");
                    } else if (expense < 0) {
                        System.out.println("잘못 된 입력입니다.");
                    }
                    balance = ledgerService.addExpense(balance, expense);
                    System.out.println("지출 등록 완료! 현재 잔액: " + balance + "원");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static void main(String[] args) {
        new LedgerApp().run();
    }
}

