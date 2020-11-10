package ru.airport.model;

import java.io.Serializable;

public class Airplane implements Serializable {
    private final int numberOfSeatsClass1;
    private final int numberOfSeatsClassBusiness;
    private final int numberOfSeatsClassEconom;
    private final AirplaneModel model;

    public Airplane(
            int numberOfSeatsClass1, int numberOfSeatsClassBusiness, int numberOfSeatsClassEconom, AirplaneModel model
    ) {
        this.numberOfSeatsClass1 = numberOfSeatsClass1;
        this.numberOfSeatsClassBusiness = numberOfSeatsClassBusiness;
        this.numberOfSeatsClassEconom = numberOfSeatsClassEconom;
        this.model = model;
    }

    public int getNumberOfSeatsClass1() {
        return numberOfSeatsClass1;
    }

    public int getNumberOfSeatsClassBusiness() {
        return numberOfSeatsClassBusiness;
    }

    public int getNumberOfSeatsClassEconom() {
        return numberOfSeatsClassEconom;
    }

    public AirplaneModel getModel() {
        return model;
    }

    @Override
    public String toString() {
        return this.model + " | Мест в 1м классе = " + this.numberOfSeatsClass1 +
                " | Мест в бизнес классе = " + this.numberOfSeatsClassBusiness +
                " | Мест в эконом класе = " + this.numberOfSeatsClassEconom;
    }
}

