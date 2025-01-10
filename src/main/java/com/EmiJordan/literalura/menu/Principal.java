package com.EmiJordan.literalura.menu;

import com.EmiJordan.literalura.excepciones.ManejadorDeErrores;
import com.EmiJordan.literalura.services.ConsumoAPI;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Principal {

    public static Scanner scanner = new Scanner(System.in);
    public static String urlBase = "https://gutendex.com/books/?search=";

    public static void mostrarMenu(){
//        Scanner scanner = new Scanner(System.in);

        limpiarConsola();
        System.out.println("""
                ***************************************************************************
                Bienvenido a LiterAlura 😄👋
                
                1- Buscar libro por título
                2- Listar libros registrados
                3- Listar autores registrados
                4- Listar autores vivos en un determinado año
                5- Listar libros por idioma
                
                0- Salir
                """);

        Integer opcion = ManejadorDeErrores.validarOpcion(5);

        switch (opcion){
            case 0:
                System.out.println("\nMuchas gracias por usar Literalura!! 😊👋");
                System.exit(0);
            case 1:
                buscarLibroPorTitulo();
                
        }

    }

    private static void buscarLibroPorTitulo() {
        System.out.println("Ingrese el título del libro o una parte de él: ");
        String tituloLibro = scanner.nextLine();
        String json = ConsumoAPI.obtenerDatos(urlBase+tituloLibro.replace(" ", "%20"));
        System.out.println(json);
    }


    public static void limpiarConsola() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }


}
