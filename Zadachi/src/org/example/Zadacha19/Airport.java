package org.example.Zadacha19;

import java.util.*;
import java.util.stream.Collectors;

public class Airport {
    private String name;
    private List<Flight> flights = new ArrayList<>();

    public Airport(String name) {
        this.name = name;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    public List<Flight> getFlightsByDestination(String destination) {
        return flights.stream()
                .filter(flight -> flight.getDestination().equals(destination))
                .collect(Collectors.toList());
    }

    public List<Passenger> getAllPassengers() {
        return flights.stream()
                .flatMap(flight -> flight.getPassengers().stream())
                .collect(Collectors.toList());
    }

    //public int getTotalPassengerCount() {
    //    return (int) flights.stream()
    //            .mapToLong(flight -> flight.getPassengers().size())
    //            .sum();
    //}

    public int getTotalPassengerCount() {
        return (int) flights.stream()
                .flatMap(flight -> flight.getPassengers().stream())
                .count();
    }

    public String getMostPopularDestination() {
        return flights.stream()
                .flatMap(flight -> flight.getPassengers().stream()
                        .map(passenger -> flight.getDestination()))
                .collect(Collectors.groupingBy(destination -> destination, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Нет данных");
    }

    public String getMostPopularPassengerName() {
        return flights.stream()
                .flatMap(flight -> flight.getPassengers().stream()
                        .map(passenger -> passenger.getName()))
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Нет данных");
    }

    public Passenger getOldestPassenger() {
        return flights.stream()
                .flatMap(flight -> flight.getPassengers().stream())
                .max(Comparator.comparingInt(Passenger::getAge))
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Airport{name = " + name + ", flights = " + flights + "}";
    }

    public List<Flight> getFlightsByPassengerName(String name) {
        return flights.stream()
                .filter(flight -> flight.getPassengers().stream()
                        .anyMatch(passenger -> passenger.getName().equals(name)))
                .collect(Collectors.toList());
    }

    public long getTotalBaggageCount() {
        return flights.stream()
                .flatMap(flight -> flight.getPassengers().stream())
                .filter(Passenger::hasBaggage)
                .count();
    }

    public Passenger getYoungestPassenger() {
        return flights.stream()
                .flatMap(flight -> flight.getPassengers().stream())
                .min(Comparator.comparing(Passenger::getAge))
                .orElse(null);
    }

    public List<String> getDestinationSorted() {
        return flights.stream()
                .map(Flight::getDestination)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public Map<Boolean, List<Passenger>> getPassengersGroupByBaggage() {
        return flights.stream()
                .flatMap(flight -> flight.getPassengers().stream())
                .collect(Collectors.groupingBy(Passenger::hasBaggage));
    }

    public double getAverageAgeByDestination(String destination) {
        return flights.stream()
                .filter(flight -> flight.getDestination().equals(destination))
                .flatMap(flight -> flight.getPassengers().stream())
                .mapToInt(Passenger::getAge)
                .average()
                .orElse(0);
    }

    public List<Flight> getFlightsWithMoreThanPassengers(int n) {
        return flights.stream()
                .filter(flight -> flight.getPassengers().size() > n)
                .collect(Collectors.toList());
    }

    public List<Passenger> getTop3OldestPassengers() {
        return flights.stream()
                .flatMap(flight -> flight.getPassengers().stream())
                .sorted(Comparator.comparing(Passenger::getAge).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<String> getDestinationWithBaggageOnly() {
        return flights.stream()
                .filter(flight -> flight.getPassengers().stream()
                        .allMatch(Passenger::hasBaggage))
                .map(Flight::getDestination)
                .collect(Collectors.toList());
    }

    public Map<String, Long> getPassengerNameFrequency() {
        return flights.stream()
                .flatMap(flight -> flight.getPassengers().stream())
                .collect(Collectors.groupingBy(Passenger::getName, Collectors.counting()));
    }

    public List<Flight> getFlightsWithMostPassengers() {
        int max = flights.stream()
                .mapToInt(Flight::getPassengerCount)
                .max()
                .orElse(0);
        return flights.stream()
                .filter(flight -> flight.getPassengerCount() == max)
                .collect(Collectors.toList());
    }
}
