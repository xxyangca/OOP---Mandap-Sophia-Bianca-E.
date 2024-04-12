
package javamanagementsystem;

public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish sound");
    }

    @Override
    public void eat() {
        System.out.println("Fish eating");
    }

    @Override
    public void sleep() {
        System.out.println("Fish sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Fish swimming");
    }
}