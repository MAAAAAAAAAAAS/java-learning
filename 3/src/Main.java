public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat ("Вася"),
                new Cat ("Мася"),
                new Dog ("Шарик"),
                new Dog ("Сисик")
        };
        for (Animal a : animals) {
            a.makeSound();
            System.out.println(a);
        }
    }
}