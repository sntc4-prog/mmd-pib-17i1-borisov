package ru.airport.model;

public class ElectronicScoreboard implements Informer {
    @Override
    public void informLanding(Flight flight, Runway runway) {
        System.out.println("/Табло!/Прибыл рейс:" + flight.getFlightNumber() + " На полосу:" + runway.getNumber());
    }

    @Override
    public void informTakeOff(Flight flight, Runway runway) {
        System.out.println("/Табло!/Рейс снят!:" + flight.getFlightNumber() + " На полосу:" + runway.getNumber());
    }
}
