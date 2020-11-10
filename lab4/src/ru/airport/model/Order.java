package ru.airport.model;

public class Order {
    private static int NEXT_NUMBER = 1;

    private final int number;
    private final Flight flight;
    private final Passenger passenger;

    Order(Flight flight, Passenger passenger) {
        this.number = NEXT_NUMBER++;
        this.flight = flight;
        this.passenger = passenger;
    }

    public int getNumber() {
        return number;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    @Override
    public String toString() {
        return "Номер заказа: " + this.number + "Рейс: " + this.flight + "Пассажир" + this.passenger;
    }
}
