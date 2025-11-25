package Homework24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Transformer optimus = new Autobot("Optimus Prime", "Autobots");
        Transformer megatron = new Decepticon("Megatron", "Decepticons");

        System.out.println("=== AUTOBOT ACTIONS ===");
        ((Action) optimus).run();
        ((Action) optimus).fire();
        ((Action) optimus).charge();
        optimus.transform();
        optimus.showProperties();

        System.out.println("\n=== DECEPTICON ACTIONS ===");
        ((Action) megatron).run();
        ((Action) megatron).fire();
        ((Action) megatron).charge();
        megatron.transform();
        megatron.showProperties();

        // Список трансформеров (полиморфизм)
        List<Transformer> transformers = new ArrayList<>();
        transformers.add(optimus);
        transformers.add(megatron);

        System.out.println("\n=== LIST OF TRANSFORMERS ===");
        for (Transformer t : transformers) {
            t.showProperties();
        }
    }
}