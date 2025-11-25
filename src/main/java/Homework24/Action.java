package Homework24;

public interface Action {
    default void run() {
        System.out.println("Running...");
    }

    void fire();

    void charge();
}