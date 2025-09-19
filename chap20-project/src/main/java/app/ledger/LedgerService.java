package app.ledger;

import java.util.Scanner;

public class LedgerService {
    private static final String BALANCE_FILE = "balance.txt"; // 파일명 선언
    private final FileManager fileManager;

    public LedgerService() {
        this.fileManager = new FileManager(BALANCE_FILE);
    }

    public int loadBalance(Scanner sc) {
        if (!fileManager.exists()) {
            System.out.println("등록된 잔액이 없습니다.");
            System.out.print("현재 잔액을 입력하세요: ");
            int initialBalance = sc.nextInt();
            /* 파일 생성 후 입력 된 값 return */
            fileManager.write(String.valueOf(initialBalance));
            return initialBalance;
        }
        try {
            return Integer.parseInt(fileManager.read());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }


    /* 현재 잔액에 입금 금액을 더하여 파일에 저장 */
    public int addIncome(int balance, int amount) {
        balance += amount;
        fileManager.write(String.valueOf(balance));
        return balance;
    }

    /* 현재 잔액에 출금 금액을 빼고 파일에 저장*/
    public int addExpense(int balance, int amount) {
        balance -= amount;
        fileManager.write(String.valueOf(balance));
        return balance;
    }
}

