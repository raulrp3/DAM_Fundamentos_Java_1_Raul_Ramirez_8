package com.company;

import java.util.Scanner;

public class Main {
    public static int validarNumero(Scanner sc) {
        int numeroValidado;
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
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
        primerNumero = validarNumero(sc);
        System.out.print("Introduce un segundo número: ");
        segundoNumero = validarNumero(sc);
        System.out.println(ordenarNumeros(primerNumero, segundoNumero));
    }
}
