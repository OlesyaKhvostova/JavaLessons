package NotesManager;
import model.Repository;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NotesManager {
    public  Map<Integer,Note> noteDict = new HashMap<Integer,Note>();
    private int currId = 0;
    String notesFile;
    Repository repository;

    public NotesManager(Repository repository)
    {
        this.repository = repository;
        noteDict = this.repository.getAllNotes();
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createNote();
                        break;
                    case READ_ALL:
                        readAll();
                        break;
                    case EDIT:
                        editNote();
                        break;
                    case DELETE:
                        deleteNote();
                        break;
                    case READ_SINGLE:
                        readSingleNote();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String getID(String message) {
        String readId = prompt(message);
        return readId;
    }

    private void Save()
    {
        this.repository.saveNotes(noteDict);
    }

    private void createNote() throws Exception {
        String header = prompt("Введите заголовок:");
        String text = prompt("Введите текст:");
        Note note = new Note(currId++, header, text);
        noteDict.put(note.id, note);
        Save();
    }

    private void readAll() throws Exception {
        for (var note : noteDict.values()) {
            System.out.println(note);
        }
    }

    private void editNote() throws Exception {
        int editId = Integer.parseInt(getID("Введите ID заметки для редактирования: "));
        String header = getID("Введите заголовок заметки: ");
        String text = getID("Введите текст заметки: ");
        if (noteDict.containsKey(editId) )
        {
            noteDict.get(editId).date = new Date();
            if (header.length() > 0)
            {
                noteDict.get(editId).header = header;
            }
            
            if (text.length() > 0)
            {
                noteDict.get(editId).text = text;
            }
            Save();
        }
        else
        {
            System.out.print("Неверный id заметки");
        }
    }

    private void deleteNote() throws Exception {
        var deleteId = Integer.parseInt(getID("Введите ID заметки для удаления: "));

        if (noteDict.containsKey(deleteId) )
        {
            noteDict.remove(deleteId);
            System.out.print("Заметка удалена");
            Save();
        }
        else
        {
            System.out.print("Неверный id заметки");
        }
    }

    private void readSingleNote() throws Exception {
        var readId = Integer.parseInt(getID("Введите ID заметки для чтения: "));

        if (noteDict.containsKey(readId) )
        {
            System.out.print(noteDict.get(id));
        }
        else
        {
            System.out.print("Неверный id заметки");
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in,"cp866");
        System.out.print(message);
        return in.nextLine();
    }
}
