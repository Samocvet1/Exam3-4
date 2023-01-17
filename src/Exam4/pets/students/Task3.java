package Exam4.pets.students;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> student = new ArrayList<>();

        Students students1 = new Students("Misha", "IB", 1, 5);
        Students students2 = new Students("Misha", "RB", 3, 3);
        Students students3 = new Students("Misha", "TB", 2, 4);
        Students students4 = new Students("Misha", "OB", 2, 2);
        Students students5 = new Students("Misha", "VB", 1, 3);


        student.add(students1 + "\n");
        student.add(students2 + "\n");
        student.add(students3 + "\n");
        student.add(students4 + "\n");
        student.add(students5 + "");
        System.out.print(student);
    }
}
