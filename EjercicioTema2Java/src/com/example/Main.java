package com.example;

public class Main {
    public static void main(String[] args) {

        double precioFinal;
        double precioInicial = 340.53d;

        precioFinal = calcularPrecioConIva(precioInicial);

        System.out.println("El precio inicial es: " + precioInicial + "€" + " y el precio final con IVA es: " + precioFinal + "€");
    }

    static double calcularPrecioConIva(double precioInicial){
        double iva = 1.50d;

        return precioInicial + iva;
    }
}

