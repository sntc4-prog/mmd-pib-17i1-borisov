package ru.airport.model;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Runway> runways;
    private List<Order> orders;
    private final List<Informer> informers = new ArrayList<>();

    public Airport(int numberOfRunways) {
        this.runways = new ArrayList<>();
        for (int i = 1; i <= numberOfRunways; i++) {
            this.runways.add(new Runway(i));
        }
        informers.add(new SmsInformer());
        informers.add(new ElectronicScoreboard());
    }

    public void takeOff(Flight flight) {

    }

    public Runway planeLanding(Flight flight) {
        for (Runway runway : runways) {
            if (runway.getFlight() == null) {
                runway.setFlight(flight);
                for (Informer informer : informers) {
                    informer.informLanding(flight, runway);
                }
                return runway;
            }
        }
        return null;
    }

    public Order buyTicket(Passenger pas, Flight flight) {
        return new Order(1, flight, pas);
    }

}
