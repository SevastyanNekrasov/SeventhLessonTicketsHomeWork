package com.msaggik.seventhlessonflight;

public class Ticket {

    // поля сущности
    private String name; // название
    private String age; // возрастная группа пассажира
    private double cost = 35.0; // стоимость билета по умолчанию
    private final int discountChild = 50;
    private final int discountOld = 45;

    // конструктор
    public Ticket(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Ticket() {
        this.name = "ticketForEveryOne";
        this.age = "middle";
    }

    // геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getCost() {
        String age = this.age;
        double realCost;
        switch (age) {
            case ("child"):
                realCost = (this.cost/100) * (100 - discountChild);
                break;
            case ("old"):
                realCost = (this.cost/100) * (100 - discountOld);
                break;
            default:
                realCost = this.cost;
                break;
        }
        return realCost;
    }
}
