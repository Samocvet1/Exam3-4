package Exam4.pets;

public class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Name = " + name;
    }
}
