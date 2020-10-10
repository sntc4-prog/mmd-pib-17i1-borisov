package main.java;

public class Airplane {
    int numberOfSeatsClass1;
    int numberOfSeatsClassBusiness;
    int numberOfSeatsClassEconom;

    enum airplaneModel {Boing737, Boing747, Boing777}

    public Airplane(int numberOfSeatsClass1, int numberOfSeatsClassBusiness, int numberOfSeatsClassEconom) {
        this.numberOfSeatsClass1 = numberOfSeatsClass1;
        this.numberOfSeatsClassBusiness = numberOfSeatsClassBusiness;
        this.numberOfSeatsClassEconom = numberOfSeatsClassEconom;
    }

    @Override
    public String toString() {
        return " Мест в 1м классе" + this.numberOfSeatsClass1 + " Мест в бизнес классе" + this.numberOfSeatsClassBusiness + " Мест в эконом класе" + this.numberOfSeatsClassEconom;
    }
}

