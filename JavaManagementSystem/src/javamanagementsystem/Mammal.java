
package javamanagementsystem;

public class Mammal extends Animal {
   public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void eat() {
        System.out.println("Slurp");
    }

    @Override
    public void sleep() {
        System.out.println("Shleep");
    }
}
