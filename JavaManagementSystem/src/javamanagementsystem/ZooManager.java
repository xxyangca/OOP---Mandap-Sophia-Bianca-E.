
package javamanagementsystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooManager {
    private List<Animal> animals;
    private Habitat aviary;
    private Habitat aquarium;
    private Habitat savannah;
    private Habitat jungle;

    public ZooManager() {
        this.animals = new ArrayList<>();
        this.aviary = new Habitat("Aviary");
        this.aquarium = new Habitat("Aquarium");
        this.savannah = new Habitat ("Savannah");
        this.jungle = new Habitat ("Jungle");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add animal");
            System.out.println("2. View all animals in the zoo");
            System.out.println("3. View animals in a specific habitat");
            System.out.println("4. Feed animals");
            System.out.println("5. Simulate animal behavior");
            System.out.println("6. Assign animal to a habitat");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            

            switch (choice) {
                case 1:
                    addAnimal(scanner);
                    break;
                case 2:
                    viewAllAnimals();
                    break;
                case 3:
                    viewAnimalsInHabitat();
                    break;
                case 4:
                    feedAnimals();
                    break;
                case 5:
                    simulateAnimalBehavior();
                    break;
                case 6: 
                    assignAnimalHabitat();
                    break;
                case 7:
                    System.out.println("Exiting Zoo Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
            int habitatChoice = scanner.nextInt();
            Animal animal;
        switch (habitatChoice) {
            case 1:
                aviary.addAnimal(animal);
                break;
            case 2:
                aquarium.addAnimal(animal);
                break;
            case 3:
                savannah.addAnimal(animal);
                break;
            case 4:
                jungle.addAnimal(animal);
                break;
            default:
                System.out.println("Invalid habitat choice.");
        }

    }
}
        private void addAnimal(Scanner scanner) {
        System.out.println("\nAdding Animal:");
        System.out.print("Enter animal type (1. Mammal, 2. Bird, 3. Fish 4. Reptile): ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();

        Animal animal;
        switch (type) {
            case 1:
                animal = new Mammal(name, age, weight);
                break;
            case 2:
                animal = new Bird(name, age, weight);
                break;
            case 3:
                animal = new Fish(name, age, weight);
                break;
            case 4:
                animal = new Reptile(name, age, weight);
                break;
            default:
                System.out.println("Invalid animal type!");
                return;
        }
        animals.add(animal);
        System.out.println("Animal added successfully!");
    }
        
    private void viewAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
        } else {
            System.out.println("All Animals in the Zoo:");
            for (Animal animal : animals) {
                System.out.println(animal.name + " - Age: " + animal.age + ", Weight: " + animal.weight);
            }
        }
    }

    private void viewAnimalsInHabitat() {
 Scanner scanner = new Scanner(System.in);
    System.out.println("Select habitat:");
    System.out.println("1. Aviary");
    System.out.println("2. Aquarium");
    System.out.println("3. Savannah");
    System.out.println("4. Jungle");
    int habitatChoice = scanner.nextInt();

    switch (habitatChoice) {
        case 1:
            System.out.println("Animals in Aviary:");

            break;
        case 2:
            System.out.println("Animals in Aquarium:");

            break;
        case 3:
            System.out.println("Animals in Savannah:");

            break;
        case 4:
            System.out.println("Animals in Jungle:");
 
            break;
        default:
            System.out.println("Invalid habitat choice.");
    }
}

    private void feedAnimals() {
   Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the amount of food to be given (in kg): ");
    double foodAmount = scanner.nextDouble();

    for (Animal animal : animals) {
        System.out.println("Feeding " + animal.name + "...");

        animal.weight += foodAmount;
    }
    System.out.println("All animals have been fed.");
}

    private void simulateAnimalBehavior() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Select animal:");
    for (int i = 0; i < animals.size(); i++) {
        System.out.println((i + 1) + ". " + animals.get(i).name);
    }
    int animalChoice = scanner.nextInt();

    if (animalChoice >= 1 && animalChoice <= animals.size()) {
        Animal selectedAnimal = animals.get(animalChoice - 1);
        System.out.println("Select behavior:");
        System.out.println("1. Make sound");
        if (selectedAnimal instanceof Flyable) {
            System.out.println("2. Fly");
        }
        if (selectedAnimal instanceof Swimmable) {
            System.out.println("3. Swim");
        }
        if (selectedAnimal instanceof Climber) {
            System.out.println("4. Climb");
        }
        int behaviorChoice = scanner.nextInt();

        switch (behaviorChoice) {
            case 1:
                selectedAnimal.makeSound();
                break;
            case 2:
                if (selectedAnimal instanceof Flyable) {
                    ((Flyable) selectedAnimal).fly();
                } else {
                    System.out.println("This animal cannot fly.");
                }
                break;
            case 3:
                if (selectedAnimal instanceof Swimmable) {
                    ((Swimmable) selectedAnimal).swim();
                } else {
                    System.out.println("This animal cannot swim.");
                }
                break;
            case 4:
                if (selectedAnimal instanceof Climber) {
                    ((Climber) selectedAnimal).climb();
                } else {
                    System.out.println("This animal cannot climb.");
                }
                break;
            default:
                System.out.println("Invalid behavior choice.");
        }
    } else {
        System.out.println("Invalid animal choice.");
    }
}
   

    public static void main(String[] args) {
        ZooManager zooManager = new ZooManager();
        zooManager.run();
    }
}