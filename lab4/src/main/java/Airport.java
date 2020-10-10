package main.java;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<String> runways;
    private List<Order> orders;
    private final List<Informer> informers = new ArrayList<>();

    public Airport() {
        informers.add(new SmsInformer());
        informers.add(new ElectronicScoreboard());
    }

    public void takeOff(Object Flight) {

    }

    public Runway planeLanding(Object Flight) {
        return (Runway) Flight;
    }

    public Order buyTicket(Passenger pas, Flight flight) {
        return new Order(1, flight, pas);
    }

}
