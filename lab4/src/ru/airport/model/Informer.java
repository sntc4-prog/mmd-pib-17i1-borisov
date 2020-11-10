package ru.airport.model;

public interface Informer {
    void informLanding(Flight flight, Runway runway);
    void informTakeOff(Flight flight, Runway runway);
}
