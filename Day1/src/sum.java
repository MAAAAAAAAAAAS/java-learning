public static int sum(int a, int b) {
    return a+b;
}

public static void printHello() {
    System.out.println("здарова");
}

public static String arrayToString(int[] arr) {
    return "массив из " + arr.length + " элементов";
}

public static void main(String[] args) {
    int result = sum (6, 4);
    System.out.println(result);
    printHello();
    int[] numbers = {1, 4, 5};
    String info = arrayToString(numbers);
    System.out.println(info);
}

