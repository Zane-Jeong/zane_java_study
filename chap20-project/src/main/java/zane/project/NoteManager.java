package zane.project;

import java.util.ArrayList;
import java.util.List;



public class NoteManager {
    private List<Note> notes = new ArrayList<>();

    // 일정 등록
    public void addNote(String date, String content) {
        notes.add(new Note(date, content));
    }

    // 모든 일정 조회
    public void showNotes() {
        if (notes.isEmpty()) {
            System.out.println("등록된 일정이 없습니다.");
        } else {
            System.out.println("===== 등록된 일정 =====");
            for (Note note : notes) {
                System.out.println(note.date + " : " + note.content);
            }
        }
    }

    // 필요하면 리스트 반환
    public List<Note> getNotes() {
        return notes;
    }
}