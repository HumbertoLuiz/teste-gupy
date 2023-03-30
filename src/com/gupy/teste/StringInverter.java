package com.gupy.teste;

public class StringInverter {

    public static void main(String[] args) {

        String str= "Humberto";
        String reverse= "";
        System.out.println(str);
        System.out.println(inverter(str, reverse));
    }

    static String inverter(String str, String reverse) {

        for (int i= str.length() - 1; i >= 0; i-- ) {
            reverse+= str.charAt(i);
        }

        return reverse;
    }

}
