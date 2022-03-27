package com.company;

public class Main {
    private static void calcul(int num) {

        for (int i = 0; i< num + 1 ; i++) {
            System.out.println("Liste : " + i);
        }
    }
    public static void main(String[] args) {
        calcul(9);
    }
}