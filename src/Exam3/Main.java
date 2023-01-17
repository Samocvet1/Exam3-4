package Exam3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        BigDecimal decimal = new BigDecimal("100");
        Note note = new Note("1337", date, NoteType.IDEAS, "Some ideas");
        note.makeARecord(note);
        Contacts contacts = new Contacts("Контакт", date, NoteType.IDEAS, "0700 14-69-68",
                "Sasha", TypeOfNumber.MOBILE);
        contacts.makeARecord(note);
        Duty duty = new Duty("Должен", date, NoteType.DUTY, decimal);
        duty.makeARecord(note);
    }
}
