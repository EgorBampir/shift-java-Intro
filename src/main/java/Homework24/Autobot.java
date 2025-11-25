package Homework24;

public class Autobot extends Transformer implements Action {

    public Autobot(String name, String teamName) {
        super(name, teamName, "Blue", true);
    }

    @Override
    public void transform() {
        System.out.println(name + " transforms into a vehicle");
    }

    @Override
    public void fire() {
        System.out.println(name + " is firing");
    }

    @Override
    public void charge() {
        System.out.println(name + " is charging");
    }
}