package Homework24;
public class Autobot extends Transformer {
    private String teamName;
    private final String eyeColor = "Blue";
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(name + " transforms into a vehicle");
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