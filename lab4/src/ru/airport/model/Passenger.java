package ru.airport.model;

import java.io.Serializable;

public class Passenger implements Serializable {
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

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public String getGreeting() {
        return "Уважаемый " + this.name + " " + this.secondName;
    }

    @Override
    public String toString() {
        return this.surName + " / " + this.name + " / " + this.secondName + " / Номер телефона: " + this.phoneNumber + " / Номер документа уд. личн.:" + this.documentNumber + " / Гражданство: " + this.citizenship;
    }
}
