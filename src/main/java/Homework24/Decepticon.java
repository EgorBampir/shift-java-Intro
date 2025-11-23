package Homework24;
public class Decepticon extends Transformer {
    private String teamName;
    private final String eyeColor = "Red";
    private boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(name + " transforms into ground/air transport, weapon or machinery");
    }

    public void showProperties() {
        System.out.println(
                "Name: " + name +
                        ", Team: " + teamName +
                        ", EyeColor: " + eyeColor +
                        ", Kindness: " + kindness
        );
    }
}