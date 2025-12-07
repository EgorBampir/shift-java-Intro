import java.util.Scanner;

public class StringTaska {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        System.out.println("Введите символ для поиска и замены:");
        String symbol = scanner.nextLine();

        if (symbol.length() != 1 || symbol.equals(" ")) {
            System.out.println("Нужно ввести один символ и не пробел");
            return;
        }

        String original = input;

        // убираем лишние пробелы если есть
        String result = input.replaceAll(" +", " ");

        // заменяем все вхождения символа на пробел
        result = result.replace(symbol, " ");

        // опять убираем лишние пробелы, которые могли появиться
        result = result.replaceAll(" +", " ").trim();

        if (result.equals(original)) {
            System.out.println("Строка не изменилась после преобразований");
        } else {
            System.out.println(original + " | " + result);
        }
    }
}