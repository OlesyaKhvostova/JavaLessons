package model;
import NotesManager.Note;

public class NoteMapper {
    public String map(Note note) {
            return String.format("%s#%s#%s#%s", note.getId(), note.getHeader(), note.getText(), note.getDate());
    }

    public Note map(String line) {

            String[] lines = line.split("#");
            return new Note(Integer.parseInt(lines[0]), lines[1], lines[2]);
    }
}
