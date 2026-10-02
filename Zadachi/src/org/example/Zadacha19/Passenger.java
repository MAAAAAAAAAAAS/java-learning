package org.example.Zadacha19;

import java.util.Objects;

public class Passenger {
    private String name, passportNumber;
    private int age;
    private boolean hasBaggage;

    public Passenger(String name, String passportNumber, int age, boolean hasBaggage) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.age = age;
        this.hasBaggage = hasBaggage;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public boolean hasBaggage() { return hasBaggage; }
    public void setHasBaggage(boolean hasBaggage) { this.hasBaggage = hasBaggage; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return age == passenger.age && hasBaggage == passenger.hasBaggage && Objects.equals(name, passenger.name) && Objects.equals(passportNumber, passenger.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passportNumber, age, hasBaggage);
    }

    @Override
    public String toString() {
        return "Passenger{" + "name='" + name + '\'' + ", passportNumber='" + passportNumber + '\'' +
                ", age=" + age + ", hasBaggage=" + hasBaggage + '}';
    }
}
