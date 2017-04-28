package com.nizami.collections;

import com.nizami.enums.WeekDay;

import java.util.EnumSet;

public class EnumSetExample {
    public static void enumSetExample() {
        EnumSet<WeekDay> holidays = EnumSet.of(WeekDay.SATURDAY, WeekDay.SUNDAY);

        holidays.add(WeekDay.FRIDAY);
        holidays.add(WeekDay.WEDNESDAY);
        holidays.add(WeekDay.THURSDAY);

        System.out.println(holidays);
    }
}