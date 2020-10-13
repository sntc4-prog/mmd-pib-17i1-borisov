package ru.airport.model;

import java.time.LocalDateTime;

public class Flight {
    private final String flightNumber;
    private final Airplane airplane;
    private final String airportDeparture;
    private final String airportDestination;
    private final LocalDateTime dateTimeDeparture;
    private final LocalDateTime dateTimeArrival;

    public Flight(String flightNumber, Airplane airplane, String airportDeparture, String airportDestination, LocalDateTime dateTimeDeparture, LocalDateTime dateTimeArrival) {
        this.flightNumber = flightNumber;
        this.airplane = airplane;
        this.airportDeparture = airportDeparture;
        this.airportDestination = airportDestination;
        this.dateTimeDeparture = dateTimeDeparture;
        this.dateTimeArrival = dateTimeArrival;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String getAirportDeparture() {
        return airportDeparture;
    }

    public String getAirportDestination() {
        return airportDestination;
    }

    public LocalDateTime getDateTimeDeparture() {
        return dateTimeDeparture;
    }

    public LocalDateTime getDateTimeArrival() {
        return dateTimeArrival;
    }

    @Override
    public String toString() {
        return "Номер полета:" + this.flightNumber + " Самолет:" + this.airplane + " Аэропорт отправления:" + this.airportDeparture + " Аэропорт назначения:" + this.airportDestination + " Время отправления:" + this.dateTimeDeparture + " Время прибытия:" + this.dateTimeArrival;
    }
}
