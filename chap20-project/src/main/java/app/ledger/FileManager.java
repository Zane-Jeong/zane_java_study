package app.ledger;

import java.io.*;

public class FileManager {
    private final String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    /* File클래스 이용하여 현재 파일 여부 확인*/
    public boolean exists() {
        return new File(fileName).exists(); //fileName 파일 경로
    }

    /* 파일이 없으면 생성 */
    public void write(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

