import java.util.Objects;

public class Student extends Person {
    // Поле
    private double averageGrade;

    // геттеры и сеттер
    public double getAverageGrade() { return averageGrade; }
    public void setAverageGrade(double averageGrade) {
        if (averageGrade > 0 && averageGrade <= 5) this.averageGrade = averageGrade;
    }

    // Конструктор объектов
    public Student (String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }

    // Что делает объект
    @Override
    public void sayHello() {
        System.out.println ("Привет, я " + name + ", мне " + age + " лет, моя средняя оценка " + averageGrade);
    }

    //переопределение equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age
                && Double.compare(student.averageGrade, averageGrade) == 0
                && Objects.equals(name, student.name);
    }
    //переопределение hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, age, averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
