import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на 0!");
        } finally {
            System.out.println("finally");
        }

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне массива");
        }

        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный вид аргумента");
        }

        try {
            checkAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймали: " + e.getMessage());
        }
        checkAge(25);
    }

    public static void runStreams() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result1);

        List<Integer> result2 = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(result2);

        List<Integer> result3 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .collect(Collectors.toList());
        System.out.println(result3);

        List<String> names = List.of("Саня","Саша","Санёк","Саня","Петя");
        List<String> result4 = names.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result4);

        long result5 = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(result5);

        names.forEach(System.out::println);
    }

    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        } else {
            System.out.println("Возраст: " + age);
        }
        runStreams();
    }
}