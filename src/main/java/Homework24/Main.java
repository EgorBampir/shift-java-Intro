package Homework24;
public class Main {
    public static void main(String[] args) {

        Autobot optimus = new Autobot("Bumblbee", "Autobots");
        Decepticon megatron = new Decepticon("Starscream", "Decepticons");

        System.out.println("=== AUTOBOT ACTIONS ===");
        optimus.run();
        optimus.fire();
        optimus.charge();
        optimus.transform();
        optimus.showProperties();

        System.out.println("\n=== DECEPTICON ACTIONS ===");
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
        megatron.showProperties();
    }}