package com.palser;

import com.vince.Car;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {


    public static void main(String[] args) throws Exception
    {
        SimpleDateFormat format1 =  new SimpleDateFormat("HH:mm");
        SimpleDateFormat format2 = new SimpleDateFormat("kk:mm");
        Date date = new GregorianCalendar(2001, 0, 1, 1, 2 , 0 ).getTime();

        System.out.println(format1.format(date));
        System.out.println(format2.format(date));

        Car volvo = new Car();
        System.out.println("Ben" + volvo.engine.toString());
        volvo.print(10);

    }
}
