package Exam3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Note extends TheNote implements WriteToFile{
    private String theHeader;

    public Note(String text, LocalDate localDate, NoteType noteType, String theHeader) {
        super(text, localDate, noteType);
        this.theHeader = theHeader;
    }

    public String getTheHeader() {
        return theHeader;
    }

    public void setTheHeader(String theHeader) {
        this.theHeader = theHeader;
    }

    @Override
    public void makeARecord(Note note) {
        try {
            FileWriter fileWriter = new FileWriter("NoteBook.txt",true);
            fileWriter.write(getTheHeader() + " " + getText() + " " + getNoteType() + " " + getLocalDate() + "\n");
            System.out.println("Запись сохранена!");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
