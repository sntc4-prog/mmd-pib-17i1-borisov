package main.java;

public class Order {
    int number;
    Flight flight;
    Passenger passenger;

    public Order(int number, Flight flight, Passenger passenger) {
        this.number = number;
        this.flight = flight;
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Номер заказа: " + this.number + "Рейс: " + this.flight + "Пассажир" + this.passenger;
    }
}
