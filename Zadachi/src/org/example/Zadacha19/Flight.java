package org.example.Zadacha19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Flight {
    private String flightNumber, destination;
    private List<Passenger> passengers = new ArrayList<>();

    public Flight(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public String getDestination() {
        return destination;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }

    public List<Passenger> getPassengersWithBaggage() {
        return passengers.stream()
                .filter(passenger -> passenger.hasBaggage())
                .collect(Collectors.toList());
    }

    public List<Passenger> getPassengersWithoutBaggage() {
        return passengers.stream()
                .filter(passenger -> !passenger.hasBaggage())
                .collect(Collectors.toList());
    }

    public List<Passenger> getPassengersOlderThan(int age) {
        return passengers.stream()
                .filter(passenger -> passenger.getAge() > age)
                .collect(Collectors.toList());
    }

    public double averageAge() {
        return passengers.stream()
                .mapToInt(Passenger::getAge)
                .average()
                .orElse(0);
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    @Override
    public String toString() {
        return "Flight{flightNumber = " + flightNumber + ", destination = " + destination + "}";
    }
}
