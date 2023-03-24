package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import NotesManager.Note;

public class RepositoryFile implements Repository {
    private NoteMapper mapper = new NoteMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public Map<Integer,Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        Map<Integer,Note> notesDict = new HashMap<Integer,Note>();
        for (String line : lines) {
            var note = mapper.map(line);
            notesDict.put(note.getId(), note);
        }
        return notesDict;
    }

    public void saveNotes(Map<Integer,Note> notesDict) {
        List<String> lines = new ArrayList<>();
        for (Note item: notesDict.values()) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
}
