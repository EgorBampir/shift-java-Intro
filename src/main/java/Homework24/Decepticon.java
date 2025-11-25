package Homework24;

public class Decepticon extends Transformer implements Action {

    public Decepticon(String name, String teamName) {
        super(name, teamName, "Red", false);
    }

    @Override
    public void transform() {
        System.out.println(name + " transforms into ground/air transport, weapon or machinery");
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