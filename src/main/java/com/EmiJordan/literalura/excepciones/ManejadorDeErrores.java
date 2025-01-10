package com.EmiJordan.literalura.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejadorDeErrores {


    public static Integer validarOpcion(int rango) {
        Scanner scanner = new Scanner(System.in);

        Integer opcion;
        while (true) {
            try {
                System.out.println("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion < 0 || opcion > rango) {
                    System.err.println("Por favor, ingrese un numero que este dentro del rango establecido");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Por favor ingrese un número");
                scanner.nextLine();
            }
        }
        return opcion;
    }

}
