package com.lhk.com;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int month=calendar.get(Calendar.MONTH);
        System.out.println(month);
    }
}
