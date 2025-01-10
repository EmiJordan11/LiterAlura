package com.EmiJordan.literalura.menu;

import com.EmiJordan.literalura.excepciones.ManejadorDeErrores;

import java.util.Scanner;

public class Principal {
    public static void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);

        limpiarConsola();
        System.out.println("""
                ***************************************************************************
                Bienvenido a LiterAlura 😄👋
                
                1- Bucar libro por título
                2- Listar libros registrados
                3- Listar autores registrados
                4- Listar autores vivos en un determinado año
                5- Listar libros por idioma
                
                0- Salir
                """);

        Integer opcion = ManejadorDeErrores.validarOpcion(5);

        System.out.println(opcion+5);
        
    }

    public static void limpiarConsola() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }


}
