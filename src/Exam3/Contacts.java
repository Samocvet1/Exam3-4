package Exam3;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Contacts extends TheNote implements WriteToFile{
    private String phoneNumber;
    private String contactName;
    private TypeOfNumber typeOfNumber;

    public Contacts(String text, LocalDate localDate, NoteType noteType, String phoneNumber, String contactName,
                    TypeOfNumber typeOfNumber) {
        super(text, localDate, noteType);
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.typeOfNumber = typeOfNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public TypeOfNumber getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(TypeOfNumber typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
    }

    @Override
    public void makeARecord(Note note) {
        try {
            FileWriter fileWriter = new FileWriter("NoteBook.txt", true);
            fileWriter.write("Имя: " + getContactName() + " " + " Номер телефона: " + getPhoneNumber() + " " +
                    getTypeOfNumber() + "\n");
            System.out.println("Запись контакта сохранена!");
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
