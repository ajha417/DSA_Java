package com.company;

public class StringMutable {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Amit");
        sbf.append(" Kumar Jha");
        System.out.println(sbf.charAt(2));
        System.out.println(sbf.capacity());
//        System.out.println(sbf.);
        System.out.println(sbf);
    }
}
