import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class MultiplicationTableFile {

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

        String fileName = "multiplication_table.txt";

        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write(String.format("%" + cellWidth + "s", ""));
            System.out.printf("%" + cellWidth + "s", "");

            for (int n : numbers) {
                writer.write(String.format("%" + cellWidth + "d", n));
                System.out.printf("%" + cellWidth + "d", n);
            }
            writer.write("\n");
            System.out.println();

            for (int row : numbers) {
                writer.write(String.format("%" + cellWidth + "d", row));
                System.out.printf("%" + cellWidth + "d", row);

                for (int col : numbers) {
                    writer.write(String.format("%" + cellWidth + "d", row * col));
                    System.out.printf("%" + cellWidth + "d", row * col);
                }
                writer.write("\n");
                System.out.println();
            }

            System.out.println("\nТаблица умножения сохранена в файл: " + fileName);

        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
        }
    }
}

