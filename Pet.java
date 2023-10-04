import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
class Pet {
    private String name;
    private int age;
    private String breed;

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Breed: " + breed;
    }
}

 