public class Dog extends Animal {
    public Dog (String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Гав!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
