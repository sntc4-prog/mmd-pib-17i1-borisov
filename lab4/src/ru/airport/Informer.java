package ru.airport;

public interface Informer {
    void informLanding(Object Flight, Object Runway);
    void informTakeOff(Object Flight, Object Runway);
}
