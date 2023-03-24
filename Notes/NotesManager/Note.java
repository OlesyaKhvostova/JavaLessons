package NotesManager;

import java.util.Date;

public class Note {
    int id;
    String header;
    String text;
    Date date;
    public Note(int id, String header, String text)
    {
        this.id = id;
        this.header = header;
        this.text = text;
        this.date = new Date();
    }

    public int getId()
    {
        return id;
    }

    public String getText()
    {
        return text;
    }

    public String getHeader()
    {
        return header;
    }

    public String getDate()
    {
        return date.toString();
    }

    @Override
    public String toString() {
        return "Заметка Id = " + id + "\n"+
        "Время[" + date.toString() +"]\n" +
        "Заголовок[" + header +"]\n" +
        "Текст[" + text + "]\n\n";
    }
}
