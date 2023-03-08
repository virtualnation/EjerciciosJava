package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Dime un nombre: ");
            nombres[i] = sc.nextLine();
        }

        System.out.println("LISTA DE NOMBRES:");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

    }
}