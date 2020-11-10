package ru.airport.model;


import java.util.List;

public class SmsInformer implements Informer {
    private final List<Order> orders;

    public SmsInformer(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public void informLanding(Flight flight, Runway runway) {
        for (Order order : orders) {
            if (flight.equals(order.getFlight())) {
                Passenger passenger = order.getPassenger();
                System.out.println(
                        "/SMS!/" + passenger.getPhoneNumber() + " "
                                + passenger.getGreeting() + ", прибыл рейс:" + flight.getFlightNumber()
                );
            }
        }


    }

    @Override
    public void informTakeOff(Flight flight, Runway runway) {
        for (Order order : orders) {
            if (flight.equals(order.getFlight())) {
                Passenger passenger = order.getPassenger();
                System.out.println(
                        "/SMS!/" + passenger.getPhoneNumber() + " "
                                + passenger.getGreeting() + ", Рейс снят!:" + flight.getFlightNumber()
                );
            }
        }
    }
}
