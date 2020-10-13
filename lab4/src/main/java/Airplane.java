package main.java;

public class Airplane {
    int numberOfSeatsClass1;
    int numberOfSeatsClassBusiness;
    int numberOfSeatsClassEconom;
    AirplaneModel model;

    public Airplane(
            int numberOfSeatsClass1, int numberOfSeatsClassBusiness, int numberOfSeatsClassEconom, AirplaneModel model
    ) {
        this.numberOfSeatsClass1 = numberOfSeatsClass1;
        this.numberOfSeatsClassBusiness = numberOfSeatsClassBusiness;
        this.numberOfSeatsClassEconom = numberOfSeatsClassEconom;
        this.model = model;
    }

    @Override
    public String toString() {
        return this.model + " Мест в 1м классе" + this.numberOfSeatsClass1 +
                " Мест в бизнес классе" + this.numberOfSeatsClassBusiness +
                " Мест в эконом класе" + this.numberOfSeatsClassEconom;
    }
}

