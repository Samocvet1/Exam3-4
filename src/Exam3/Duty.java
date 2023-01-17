package Exam3;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Duty extends TheNote implements WriteToFile{
    private BigDecimal debtAmount;

    public Duty(String text, LocalDate localDate, NoteType noteType, BigDecimal debtAmount) {
        super(text, localDate, noteType);
        this.debtAmount = debtAmount;
    }

    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    @Override
    public void makeARecord(Note note) {
        try {
            FileWriter fileWriter = new FileWriter("NoteBook.txt",true);
            fileWriter.write(getText() + " " + getNoteType() + " " + getDebtAmount() + " сом" + " " + getLocalDate() + "\n");
            System.out.println("Должник сохранен!");
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
