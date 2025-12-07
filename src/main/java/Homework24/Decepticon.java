package Homework24;

public class Decepticon extends Transformer {

    private String teamName;

    // Для десептиконов другой цвет глаз
    private static final String EYE_COLOR = "Red";

    private boolean aggression = true;

    public Decepticon(String name, String teamName) {
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
                        ", Aggression: " + aggression
        );
    }
}
