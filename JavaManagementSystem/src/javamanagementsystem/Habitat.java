
package javamanagementsystem;


import java.util.ArrayList;
import java.util.List;

public class Habitat {
    private String name;
    private List<Animal> animals;

    public Habitat(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        System.out.println("Animals in " + name + ":");
        if (animals.isEmpty()) {
            System.out.println("No animals in this habitat.");
        } else {
            for (Animal animal : animals) {
                System.out.println(animal.name + " - Age: " + animal.age + ", Weight: " + animal.weight);
            }
        }
    }
}