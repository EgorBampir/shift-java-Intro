package Homework24;

public class Autobot extends Transformer implements Action {

    public Autobot(String name, String teamName) {
        super(name, teamName, "Blue", true);
    }

    public enum Form {
        ROBOT,
        VEHICLE,
        JET
    }

    @Override
    public void transform(Form form) {
        switch (form) {
            case ROBOT ->
                    System.out.println(name + " transforms into ROBOT mode");
            case VEHICLE ->
                    System.out.println(name + " transforms into VEHICLE mode");
            case JET ->
                    System.out.println(name + " transforms into JET mode");
        }
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

    @Override
    public void showProperties() {
        System.out.println(
                "Name: " + name +
                        ", Team: " + teamName +
                        ", EyeColor: " + eyeColor +
                        ", Kindness: " + kindness
        );
    }
}

