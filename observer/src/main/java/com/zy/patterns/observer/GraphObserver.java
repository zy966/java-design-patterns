package com.zy.patterns.observer;

import org.joda.time.DateTime;

public class GraphObserver implements Observer<Person> {

    @Override
    public void update(Person o) {
        System.out.println("--------------------------------");
        System.out.println("日期：" + DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println("时速：" + getSpeedPerHour(o));
        System.out.println("心率：" + getHeartRate(o));
        System.out.println("体温：" + getTemperature(o));
    }

    private String getTemperature(Person o) {
        StringBuilder sb = new StringBuilder();
        for (int i = 30; i < o.getTemperature(); i++) {
            sb.append("|");
        }
        return sb.toString();
    }

    private String getHeartRate(Person o) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < o.getHeartRate(); i += 10) {
            sb.append("|");
        }
        return sb.toString();
    }

    private String getSpeedPerHour(Person o) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < o.getSpeedPerHour(); i++) {
            sb.append("|");
        }
        return sb.toString();
    }

}
