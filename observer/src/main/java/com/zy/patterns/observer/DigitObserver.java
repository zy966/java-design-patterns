package com.zy.patterns.observer;

import org.joda.time.DateTime;

public class DigitObserver implements Observer<Person> {

    @Override
    public void update(Person o) {
        System.out.println("--------------------------------");
        System.out.println("日期：" + DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println("时速：" + o.getSpeedPerHour() + " 公里/小时");
        System.out.println("心率：" + o.getHeartRate());
        System.out.println("体温：" + o.getTemperature() + " ℃");
    }

}
