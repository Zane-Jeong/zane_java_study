package zane.ex2.poly;

public class SmsSender implements Sender {
    public void sendMessage(String message) {
        System.out.print("SMS를 발송합니다 : ");
    }
}
