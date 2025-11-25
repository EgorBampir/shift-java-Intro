
package Homework24;

public abstract class Transformer {
    protected String name;
    protected String teamName;
    protected String eyeColor;
    protected boolean kindness;

    public Transformer(String name, String teamName, String eyeColor, boolean kindness) {
        this.name = name;
        this.teamName = teamName;
        this.eyeColor = eyeColor;
        this.kindness = kindness;
    }

    public abstract void transform();

    public void showProperties() {
        System.out.println(
                "Name: " + name +
                        ", Team: " + teamName +
                        ", EyeColor: " + eyeColor +
                        ", Kindness: " + kindness
        );
    }
}