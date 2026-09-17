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
    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        } else {
            System.out.println("Возраст: " + age);
        }
    }
}