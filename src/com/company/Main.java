package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion) {
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 0: {
                while (!sc.hasNextInt()) {
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1: {
                while (!sc.hasNextDouble()) {
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return validado;
    }

    public static String ordenarNumeros(int primerNumero, int segundoNumero) {
        String cadenaOrdenada;
        if (primerNumero > segundoNumero) {
            cadenaOrdenada = String.format("Números ordenados: %d,%d.", primerNumero, segundoNumero);
        } else {
            cadenaOrdenada = String.format("Números ordenados: %d,%d.", segundoNumero, primerNumero);
        }
        return cadenaOrdenada;
    }

    public static void main(String[] args) {
        int primerNumero, segundoNumero;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Vamos a ordenar dos números de mayor a menor!");
        System.out.print("Introduce un primer número: ");
        primerNumero = (int)validador(0);
        System.out.print("Introduce un segundo número: ");
        segundoNumero = (int)validador(0);
        sc.close();
        System.out.println(ordenarNumeros(primerNumero, segundoNumero));
    }
}
