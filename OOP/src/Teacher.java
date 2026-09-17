public class Teacher extends Person {
    //Поля
    private String subject;
    private int salary;

    //Конструктор
    public Teacher(String name, int age, String subject, int salary) {
        super(name, age);
        this.salary = salary;
        this.subject = subject;
    }

    //сеттеры, геттеры
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public int getSalary() { return salary; }
    public void setSalary(int salary) { if (salary > 0) this.salary = salary; }

    //что делает
    @Override
    public void sayHello() {
        System.out.println("Привет, я " + name + ", мне " + age + " лет, я преподаю " + subject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", salary=" + salary +
                '}';
    }
}
