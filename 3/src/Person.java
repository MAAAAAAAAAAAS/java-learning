import java.util.Objects;

public class Person {

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    // Поля
    protected String name;
    protected int age;

    // конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // геттеры, сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { if (age > 0) this.age = age; }

    public void sayHello() {
        System.out.println("Привет, я " + name + ", мне " + age);
    }
}
