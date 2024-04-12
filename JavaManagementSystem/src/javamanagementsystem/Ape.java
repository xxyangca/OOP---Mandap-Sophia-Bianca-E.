
package javamanagementsystem;

public class Ape extends Primate implements Climber {
    public Ape(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void climb() {
        System.out.println("Ape climbing");
    }
}