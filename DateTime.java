package com.company;

import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
       /* System.out.println("The number of seconds passed since 1970 "+System.currentTimeMillis()/1000);
        System.out.println("The number of minutes passed since 1970 "+System.currentTimeMillis()/1000/3600);
        System.out.println("The number of days passed since 1970 "+System.currentTimeMillis()/1000/3600/24);
        System.out.println("The number of years passed since 1970 "+System.currentTimeMillis()/1000/3600/24/365);*/

        Date d =new Date(99,7,4,0,55);
        System.out.println(d);
    }
}
