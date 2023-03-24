package model;

import java.util.List;
import java.util.Map;

import NotesManager.Note;

public interface Repository {
    Map<Integer,Note> getAllNotes();

    void saveNotes(Map<Integer,Note> notesDict);
}
