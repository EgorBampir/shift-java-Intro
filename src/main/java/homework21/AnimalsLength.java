package homework21;

public class AnimalsLength {
    public AnimalsLength() {
    }

    public static void main(String[] args) {
        double SnakeCm = (double)380.0F;
        double SnakeM = SnakeCm / (double)100.0F;
        int parrots = 38;
        int monkeys = 5;
        int elephants = 2;
        double parrotm = SnakeM / (double)parrots;
        double monkeym = SnakeM / (double)monkeys;
        double elephantm = SnakeM / (double)elephants;
        double totalanimalsm = SnakeM + parrotm + monkeym + elephantm;
        System.out.println("Рост удава: " + SnakeM + " м");
        System.out.println("Рост попугая: " + parrotm + " м");
        System.out.println("Рост мартышки: " + monkeym + " м");
        System.out.println("Рост слонёнка: " + elephantm + " м");
        System.out.println("Суммарный рост всех: " + totalanimalsm + " м");
    }
}