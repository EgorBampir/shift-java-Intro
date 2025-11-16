package homework21;

public class AnimalsLength {public static void main(String[] args){


double SnakeCm  = 380;
double SnakeM = SnakeCm / 100.0;
int parrots = 38;
int monkeys = 5;
int elephants = 2;
double parrotm = SnakeM / parrots;
double monkeym = SnakeM / monkeys;
double elephantm = SnakeM / elephants;
double totalanimalsm = SnakeM + parrotm + monkeym +elephantm;
System.out.println("Рост удава: " + SnakeM + " м");
System.out.println("Рост попугая: " + parrotm + " м");
System.out.println("Рост мартышки: " + monkeym + " м");
System.out.println("Рост слонёнка: " + elephantm + " м");
System.out.println("Суммарный рост всех: " + totalanimalsm + " м");
}}
