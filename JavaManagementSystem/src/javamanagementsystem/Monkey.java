
package javamanagementsystem;

public class Monkey extends Primate implements Climber {
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void climb() {
        System.out.println("Monkey climbing");
    }
}