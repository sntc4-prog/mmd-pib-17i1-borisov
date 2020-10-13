package ru.airport;

import ru.airport.model.Airplane;
import ru.airport.model.AirplaneModel;
import ru.airport.model.Passenger;

public class Main {
    public static void main(String[] args) {
        Passenger pas1 = new Passenger(
                "Egor", "Borisov", "Dmitrievich", "89088018211",
                "5118 567432", "Russian Federation"
        );
        Passenger pas2 = new Passenger(
                "Max", "Ivanov", "Olegovich", "89088018211",
                "5118 567432", "Russian Federation"
        );
        System.out.println(pas1.toString());
        System.out.println(pas2.toString());
        Airplane airpl1 = new Airplane(
                15, 10, 60, AirplaneModel.BOING_777
        );
        Airplane airpl2 = new Airplane(
                25, 20, 40, AirplaneModel.BOING_737
        );

        System.out.println(airpl1.toString());
        System.out.println(airpl2.toString());

    }
}


