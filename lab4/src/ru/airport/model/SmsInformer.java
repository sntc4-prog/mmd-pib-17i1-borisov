package ru.airport.model;


import java.util.List;

public class SmsInformer implements Informer {
    private final List<Order> orders;

    public SmsInformer(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public void informLanding(Flight flight, Runway runway) {
        System.out.println("/SMS!/Прибыл рейс:" + flight.getFlightNumber());
    }

    @Override
    public void informTakeOff(Flight flight, Runway runway) {
        System.out.println("/SMS!/Рейс снят!:" + flight.getFlightNumber());
    }
}
