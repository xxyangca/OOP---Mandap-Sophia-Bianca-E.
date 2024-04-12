
package javamanagementsystem;

public class Bird extends Animal implements Flyable {
     public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound");
    }

    @Override
    public void eat() {
        System.out.println("Bird eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Bird flying");
    }
}