package com.example;

/**
 * Clase de prueba para crear un programa básico en java
 */

public class Main {

    public static void main(String[] args) { //MÉTODO MAIN

        //TIPOS PRIMITIVOS

        //ENTEROS
        byte num1 = 1;  //1 byte
        short num2 = 2; //2 bytes
        int num3 = 3;   //4 bytes
        long num4 = 4L;  //8 bytes

        //PUNTO FLOTANTE
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        //CARÁCTER
        char caracter1 = 'a';

        //BOOLEANOS
        boolean verdadero = true;
        boolean falso = false;

        //CADENAS DE TEXTO
        String nombre= "Marc";
        String apellido = "Fernandez";

        //TIPOS ENVOLTORIO
        Integer numero = null;
        Long numero2 = 2L;

        System.out.println("TIPOS DE DATOS PRIMITIVOS - ENTEROS");
        System.out.println("Byte: " + num1 + " Short: " + num2 + " Int: " + num3 + " Long: " + num4);
        System.out.println();

        System.out.println("TIPOS DE DATOS PRIMITIVOS - DECIMALES");
        System.out.println("Float: " + decimal1 + " Double: " + decimal2);
        System.out.println();

        System.out.println("TIPOS DE DATOS PRIMITIVOS - TEXTO");
        System.out.println("Char: " + caracter1 + " String: " + nombre + " " + apellido);
        System.out.println();

        System.out.println("TIPOS DE DATOS PRIMITIVOS - BOOLEANOS");
        System.out.println("Boolean: " + verdadero + " Boolean: " + falso);
        System.out.println();

    }
}
