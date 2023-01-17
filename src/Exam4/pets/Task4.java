package Exam4.pets;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Pet> hashMap = new HashMap<>();

        hashMap.put("Кот ", new Cat("Рыжик"));
        hashMap.put("Собака ", new Dog("Маршал"));
        hashMap.put("Попугай ", new Parrot("Саша"));
        System.out.println(hashMap);


        Pet cat = hashMap.get("Кот ");
        System.out.println(hashMap.containsKey("Кот"));
        System.out.println(hashMap.containsValue(cat));

        Pet dog = hashMap.get("Собака");
        System.out.println(hashMap.containsKey("Собака "));
        System.out.println(hashMap.containsValue(dog));

        Pet parrot = hashMap.get("Попугай");
        System.out.println(hashMap.containsKey("Попугай "));
        System.out.println(hashMap.containsValue(parrot));
    }
}
