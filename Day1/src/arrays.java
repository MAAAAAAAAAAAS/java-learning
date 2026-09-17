import java.util.Arrays;

public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5};
    String[] names = new String[3];
    names[0] = "Саня";
    names[1] = "Саша";
    names[2] = "Санёк";
    System.out.println(Arrays.toString(names));

    int first = numbers[0];
    int last = numbers[4];
    int length = numbers.length;
    System.out.println(first + " " + last + " " + length);

    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
    for (int num : numbers) {
        System.out.println(num);
    }
}