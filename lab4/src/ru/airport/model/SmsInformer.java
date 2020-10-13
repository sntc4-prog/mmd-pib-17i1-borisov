package ru.airport.model;

public class SmsInformer implements Informer {
    @Override
    public void informLanding(Flight flight, Runway runway) {
        System.out.println("/SMS!/Прибыл рейс:" + flight.getFlightNumber());
    }

    @Override
    public void informTakeOff(Flight flight, Runway runway) {
        System.out.println("/SMS!/Рейс снят!:" + flight.getFlightNumber());
    }
}
