package Exam4.pets.toys;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> HashMap = new HashMap <> () ;
        HashMap.put("Car", "Машина");
        HashMap.put("Designer", "Дом");
        HashMap.put("Bicycle", "Велосипед");

        for (Map.Entry<String, String> entry : HashMap.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.print(entry.getValue() + "\n");
        }

        System.out.println("--------------------------------");

        for (String toys : HashMap.keySet()) {
            System.out.println(toys + " для Миши");
        }

        System.out.println("--------------------------------");

        for (String toys : HashMap.values()) {
            System.out.println(toys);
        }
    }
}
