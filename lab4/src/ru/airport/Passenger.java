package ru.airport;

public class Passenger {
    String surName;
    String name;
    String secondName;
    String phoneNumber;
    String documentNumber;
    String citizenship;

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
