package com.zy.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Person implements Observable<Person> {

    private int heartRate = 70;

    private float temperature = 36.5F;

    private int speedPerHour = 0;

    private List<Observer<Person>> observers = new ArrayList<>();

    public void increasesSpeed() {
        if (speedPerHour == 10) {
            return;
        }
        speedPerHour++;
        ChangeState();
    }

    public void reducesSpeed() {
        if (speedPerHour == 0) {
            return;
        }
        speedPerHour--;
        ChangeState();
    }

    private void ChangeState() {
        switch (speedPerHour) {
            case 1:
                heartRate = 80;
                break;
            case 2:
                heartRate = 90;
                break;
            case 3:
                heartRate = 100;
                break;
            case 4:
                heartRate = 110;
                break;
            case 5:
                heartRate = 120;
                break;
            case 6:
                heartRate = 130;
                break;
            case 7:
                heartRate = 140;
                break;
            case 8:
                heartRate = 150;
                break;
            case 9:
                heartRate = 160;
                break;
            case 10:
                heartRate = 170;
                break;
            default:
                heartRate = 70;
        }

        notifyObservers();
    }

    public int getHeartRate() {
        return heartRate;
    }

    public float getTemperature() {
        return temperature;
    }

    public int getSpeedPerHour() {
        return speedPerHour;
    }

    @Override
    public void addObserver(Observer<Person> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<Person> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer<Person> observer : observers) {
            observer.update(this);
        }
    }

}
