package ru.airport.model;

public class Passenger {
    private final String surName;
    private final String name;
    private final String secondName;
    private final String phoneNumber;
    private final String documentNumber;
    private final String citizenship;

    public Passenger(String name, String surName, String secondName, String phoneNumber, String documentNumber, String citizenship) {
        this.surName = surName;
        this.name = name;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.documentNumber = documentNumber;
        this.citizenship = citizenship;
    }

    @Override
    public String toString() {
        return this.surName + " / " + this.name + " / " + this.secondName + " / Номер телефона: " + this.phoneNumber + " / Номер документа уд. личн.:" + this.documentNumber + " / Гражданство: " + this.citizenship;
    }
}
