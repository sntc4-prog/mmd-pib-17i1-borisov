package ru.airport;

import ru.airport.model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {
        if (AirportDao.isFileExists()) {
            Airport airport = AirportDao.readAirport();
            for (Order order : airport.getOrders()) {
                System.out.println("Заказ" + order);
            }
        } else {
            Airport airport = new Airport(4);

            Airplane airpl1 = new Airplane(
                    15, 10, 60, AirplaneModel.BOING_777
            );
            Airplane airpl2 = new Airplane(
                    25, 20, 40, AirplaneModel.BOING_737
            );
            System.out.println(airpl1.toString());
            System.out.println(airpl2.toString());
            Flight flight1 = new Flight("1124", airpl1, "OMS", "DME",
                    LocalDateTime.now(), LocalDateTime.now());
            Flight flight2 = new Flight("836", airpl2, "OMS", "VNO",
                    LocalDateTime.now(), LocalDateTime.now());

            Passenger pas1 = new Passenger(
                    "Egor", "Borisov", "Dmitrievich", "89088018211",
                    "5118 567432", "Russian Federation"
            );
            Passenger pas2 = new Passenger(
                    "Max", "Ivanov", "Olegovich", "8906789675",
                    "5118 567432", "Russian Federation"
            );
            System.out.println(pas1.toString());
            System.out.println(pas2.toString());

            Order order1 = airport.buyTicket(pas1, flight1);
            System.out.println(airport.toString());

            Order order2 = airport.buyTicket(pas2, flight2);
            System.out.println(airport.toString());

            airport.planeLanding(flight1);
            airport.planeLanding(flight2);
            airport.takeOff(flight1);

            AirportDao.writeAirport(airport);
        }
    }
}


