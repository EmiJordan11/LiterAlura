package com.EmiJordan.literalura.menu;

import com.EmiJordan.literalura.dto.BibliotecaDTO;
import com.EmiJordan.literalura.dto.LibroDTO;
import com.EmiJordan.literalura.excepciones.ManejadorDeErrores;
import com.EmiJordan.literalura.model.Libro;
import com.EmiJordan.literalura.repository.LibroRepository;
import com.EmiJordan.literalura.services.ConsumoAPI;
import com.EmiJordan.literalura.services.ConvierteDatos;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private final Scanner scanner = new Scanner(System.in);
    private final String urlBase = "https://gutendex.com/books/?search=";
    private LibroRepository repositorio;

    public Principal(LibroRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void mostrarMenu(int numMenu){

        switch (numMenu){
            case 0:
                limpiarConsola();
                System.out.println("""
                ***************************************************************************
                👋😄 📖Bienvenido a LiterAlura📖 😄👋
                
                1- Buscar libro por título
                2- Listar libros registrados
                3- Listar autores registrados
                4- Listar autores vivos en un determinado año
                5- Listar libros por idioma
                
                0- Salir
                """);

                Integer opcion = ManejadorDeErrores.validarOpcion(5);

                switch (opcion) {
                    case 0:
                        mostrarMenu(-1);
                    case 1:
                        buscarLibroPorTitulo();
                        mostrarMenu(1);
                        break;
                    case 2:
                        obtenerTodosLosLibros();
                        mostrarMenu(1);
                        break;
                }

                break;

            case 1:
                System.out.println("""
                \nDesea realizar otra operación?
                1- Sí
                2- No
                """);
                Integer opcionElegida = ManejadorDeErrores.validarOpcion(2);
                if (opcionElegida==1){
                    mostrarMenu(0);
                } else {
                    mostrarMenu(-1);
                }
                break;

            //Fin del programa
            case -1:
                System.out.println("\n*******************************************************************");
                System.out.println("\n        Muchas gracias por usar Literalura!! 😊👋");
                System.out.println("\n*******************************************************************");
                System.exit(0);
        }


    }

    public void buscarLibroPorTitulo() {
        System.out.println("Ingrese el título del libro o una parte de él: ");
        String tituloLibro = scanner.nextLine();
        String json = ConsumoAPI.obtenerDatos(urlBase+tituloLibro.replace(" ", "%20"));
        //Convierto el JSON para obtener la lista de libros en BibliotecaDTO
        BibliotecaDTO biblioteca = ConvierteDatos.convierteDatos(json, BibliotecaDTO.class);
        //transformo el primer resultado en un Libro
        Libro libro = new Libro(biblioteca.libros().get(0));
        System.out.println(libro);
        repositorio.save(libro);

        System.out.println(libro);
    }

    public void obtenerTodosLosLibros() {
        List<Libro> librosBuscados = repositorio.findAll();
        librosBuscados.stream()
                .forEach(l-> System.out.println(l));
    }

    public static void limpiarConsola() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }


}
