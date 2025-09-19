package zane.ex2.poly;

public class EmailSender implements Sender {
    public void sendMessage(String message) {
        System.out.print("메일을 발송합니다 : ");
    }
}
