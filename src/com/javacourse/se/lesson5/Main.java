package com.javacourse.se.lesson5;

import com.javacourse.se.lesson7.Bus;

public class Main {
    public static void main(String[] args) {
        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();

        ourBus.color = "Red";
        firstBus.color = "white";
        secondBus.color = "Gray";

        ourBus.ShowColor();
        firstBus.ShowColor();
        secondBus.ShowColor();


    }
}
