package zane.project;

import java.io.*;
import java.util.List;

public class FileSave {
    public static void saveNotes(List<Note> notes, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Note note : notes) {
                bw.write(note.date + " : " + note.content);
                bw.newLine();
            }
            System.out.println("파일 저장 완료 (BufferedWriter)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
