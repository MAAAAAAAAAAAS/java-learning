public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Саня", 24),
                new Student("Санёчек", 25, 5),
                new Teacher("Александр", 45, "Математика", 100000)
        };
        for (Person p : people) {
            p.sayHello();
        }
        Person p1 = people[0];
        Person p2 = new Person("Саня", 24);

        System.out.println(p1.equals(p2)); // должно быть true
        System.out.println(p1 == p2);      // должно быть false
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