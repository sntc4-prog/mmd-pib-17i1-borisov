package ru.airport.model;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private final List<Runway> runways = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();
    private final List<Informer> informers = new ArrayList<>();

    public Airport(int numberOfRunways) {
        for (int i = 1; i <= numberOfRunways; i++) {
            this.runways.add(new Runway(i));
        }
        informers.add(new SmsInformer(orders));
        informers.add(new ElectronicScoreboard());
    }

    public void takeOff(Flight flight) {
        for (Runway runway : runways) {
            if (flight.equals(runway.getFlight())) {
                runway.takeOff();
                informAllAboutTakeOff(flight, runway);
                return;
            }
        }
    }

    public Runway planeLanding(Flight flight) {
        for (Runway runway : runways) {
            if (runway.isFree()) {
                runway.land(flight);
                informAllAboutLanding(flight, runway);
                return runway;
            }
        }
        return null;
    }

    public Order buyTicket(Passenger passenger, Flight flight) {
        Order order = new Order(flight, passenger);
        orders.add(order);
        return order;
    }

    @Override
    public String toString() {
        return "Кол-во купленных билетов = " + orders.size();
    }

    private void informAllAboutLanding(Flight flight, Runway runway) {
        for (Informer informer : informers) {
            informer.informLanding(flight, runway);
        }
    }

    private void informAllAboutTakeOff(Flight flight, Runway runway) {
        for (Informer informer : informers) {
            informer.informTakeOff(flight, runway);
        }
    }
}
