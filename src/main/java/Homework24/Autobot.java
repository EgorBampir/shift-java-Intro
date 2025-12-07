package Homework24;

public class Autobot extends Transformer {

    private String teamName;

    private static final String EYE_COLOR = "Blue";

    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public enum Form {
        ROBOT,
        VEHICLE,
        JET
    }

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

    public void showProperties() {
        System.out.println(
                "Name: " + name +
                        ", Team: " + teamName +
                        ", EyeColor: " + EYE_COLOR +
                        ", Kindness: " + kindness
        );
    }
}
