package ru.airport;

import java.io.*;

import ru.airport.model.Airport;

public class AirportDao {
    private static final String FILENAME = "lab4";

    public static boolean isFileExists() {
        return new File(FILENAME).exists();
    }

    public static Airport readAirport() throws Exception {
        try (
                FileInputStream fileInputStream = new FileInputStream(FILENAME);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream)
        ) {
            return (Airport) objectInputStream.readObject();
        }
    }

    public static void writeAirport(Airport airport) throws Exception {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(FILENAME);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream)
        ) {
            objectOutputStream.writeObject(airport);
        }
    }
}
