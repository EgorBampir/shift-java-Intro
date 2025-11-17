import java.util.Scanner;
import java.util.ArrayList;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 0, end = 0, step = 0;
        while (true) {
            System.out.print("Введите первое число: ");
            if (scanner.hasNextInt()) {
                start = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Введите второе число: ");
            if (scanner.hasNextInt()) {
                end = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Введите шаг: ");
            if (scanner.hasNextInt()) {
                step = scanner.nextInt();
                if (step == 0) {
                    System.out.println("Шаг не может быть равен 0.");
                } else {
                    break;
                }
            } else {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }
        }

        printMultiplicationTable(start, end, step);
    }

    public static int getCellWidth(int number) {
        return String.valueOf(number).length();
    }

    public static void printMultiplicationTable(int start, int end, int step) {
        ArrayList<Integer> numbers = new ArrayList<>();

        if (step > 0) {
            for (int i = start; i <= end; i += step) {
                numbers.add(i);
            }
        } else {
            for (int i = start; i >= end; i += step) {
                numbers.add(i);
            }
        }

        if (!numbers.contains(end)) {
            numbers.add(end);
        }
        int maxProduct = numbers.get(0) * numbers.get(0);
        for (int x : numbers) {
            for (int y : numbers) {
                int prod = x * y;
                if (Math.abs(prod) > Math.abs(maxProduct)) maxProduct = prod;
            }
        }
        for (int n : numbers) {
            if (Math.abs(n) > Math.abs(maxProduct)) maxProduct = n;
        }

        int cellWidth = getCellWidth(maxProduct) + 1;

        System.out.printf("%" + cellWidth + "s", "");
        for (int n : numbers) {
            System.out.printf("%" + cellWidth + "d", n);
        }
        System.out.println();

        for (int row : numbers) {
            System.out.printf("%" + cellWidth + "d", row);
            for (int col : numbers) {
                System.out.printf("%" + cellWidth + "d", row * col);
            }
            System.out.println();
        }
    }
}