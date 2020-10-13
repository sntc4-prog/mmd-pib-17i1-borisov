package ru.airport.model;

public class Runway {
    private final int number;
    private Flight flight;

    public Runway(int number) {
        this.number = number;
        this.flight = null;
    }

    public int getNumber() {
        return number;
    }

    public Flight getFlight() {
        return flight;
    }

    public void land(Flight flight) {
        this.flight = flight;
    }

    public boolean isFree() {
        return flight == null;
    }
}
