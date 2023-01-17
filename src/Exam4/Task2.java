package Exam4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            int number = random.nextInt(40);
            System.out.print(number + " ,");
            numbers.add(number);
        }

        System.out.println();

        Collections.sort(numbers);
        for (int number : numbers) {System.out.print(number + " ,");}

        System.out.println();

        List<Integer> listWithoutDuplicates = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);
    }
}
