
package javamanagementsystem;

public abstract class Animal {
       protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
}