public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4,6),
                new Triangle(3,4,6)
        };
        double totalArea = 0;
        for (Shape s : shapes) {
            System.out.println(s + " - площадь = " + s.area());
            totalArea += s.area();
        }
        BankAccount acc = new BankAccount("Саня", 1000);
        System.out.println(acc);
        acc.deposit(500);
        System.out.println(acc);
        acc.withdraw(300);
        System.out.println(acc);
        acc.withdraw(2000);
        acc.deposit(-100);
        System.out.println(acc);
    }
}