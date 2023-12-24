package com.msaggik.seventhlessonflight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // поля
    private Ticket childTicket, middleAgeTicket, oldManTicket; // поля сущностей билетов

    private final int numberOfOldPassengers = 10; // количество пенсионеров
    private final int numberOfMiddleAgePassengers = 12; // количество молодых взрослых
    private final int numberOfChildPassengers = 14; // количество детей
    private final String departureTime = "7 сентября 10:00"; // дата и время вылета

    // создание дополнительных полей для вывода на экран полученных значений
    private TextView infoApp; // поле вывода информации анализа строки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // инициализация билетов для возрастных категорий
        childTicket = new Ticket("Детский билет", "child");
        middleAgeTicket = new Ticket("Взрослый билет", "middle");
        oldManTicket = new Ticket("Пенсионерский билет", "old");

        // привязка поля к разметке по id
        infoApp = findViewById(R.id.infoApp);

        // вывод информации на экран смартфона
        infoApp.setText("Дата и время вылета:\n" + departureTime+ "\n"
                + "Стоимость поездки для 14 детей, 12 взрослых и 10 пенсионеров составляет: "
                + allCost(numberOfChildPassengers, numberOfMiddleAgePassengers, numberOfOldPassengers) + "монет\n\n"
                + "Стоимость детского билета: " + childTicket.getCost() + " монет\n"
                + "Стоимость взрослого билета: " + middleAgeTicket.getCost() + " монет\n"
                + "Стоимость билета для пенсионеров: " + oldManTicket.getCost() + " монет");
    }

    // метод определения самого длинного времени перелёта
    private double allCost(int numberOfChildPassengers, int numberOfMiddleAgePassengers, int numberOfOldPassengers) {
        double allCost = childTicket.getCost() * numberOfChildPassengers + middleAgeTicket.getCost() * numberOfMiddleAgePassengers + oldManTicket.getCost() * numberOfOldPassengers;
        return allCost;
    }
}