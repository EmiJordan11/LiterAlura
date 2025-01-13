package com.EmiJordan.literalura.excepciones;

import com.EmiJordan.literalura.model.Idioma;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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

    public static Integer validarAnio(){
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        Scanner scanner = new Scanner(System.in);
        Integer anio;

        while (true){
            try{
                System.out.println("Ingrese el año de referencia (usa números negativos para representas los años AC): ");
                anio = scanner.nextInt();
                scanner.nextLine();

                if (anio<-1105 || anio>anioActual){
                    System.err.println("Por favor, ingrese un numero entre -1105 y "+ anioActual);
                } else{
                    break;
                }

            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Por favor ingrese un número");
                scanner.nextLine();
            }
        }
        return anio;
    }

    public static Idioma validarIdioma(){
        Scanner scanner = new Scanner(System.in);
        List<String> idiomasDisponibles = new ArrayList<>(List.of("es","en","hu","fr","pt"));
        String i;
        Idioma idiomaEnum;
        while (true){
            System.out.println("""
                    \nIdiomas disponibles:
                    - Español [es]
                    - Inglés [en]
                    - Húngaro [hu]
                    - Francés [fr]
                    - Portugués [pt]
                    """);
            System.out.println("Ingrese la abreviatura del idioma por el que desea filtrar: ");
            i= scanner.nextLine();
            if (!idiomasDisponibles.contains(i)){
                System.err.println("Entrada inválida. Por favor ingrese una de las abreviaturas mostradas");
            } else{
                idiomaEnum = Idioma.desdeAbreviatura(i);
                break;
            }

        }
        return idiomaEnum;
    }

}
