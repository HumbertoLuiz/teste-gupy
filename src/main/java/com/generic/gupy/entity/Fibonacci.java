package com.generic.gupy.entity;

public class Fibonacci {

    public static void main(String[] args) {

        int INDICE= 34;
        int ANTERIOR= 0;
        int ATUAL= 0;
        int CONTADOR= 1;

        while (ATUAL < INDICE) {

            if (CONTADOR == 1) {
                ATUAL= 1;
                ANTERIOR= 0;
            } else {
                ATUAL+= ANTERIOR;
                ANTERIOR= ATUAL - ANTERIOR;
            }
            CONTADOR++ ;
            System.out.println(ATUAL);
        }
    }

}
