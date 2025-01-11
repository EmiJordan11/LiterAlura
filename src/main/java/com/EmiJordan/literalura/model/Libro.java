package com.EmiJordan.literalura.model;

import com.EmiJordan.literalura.dto.AutorDTO;
import com.EmiJordan.literalura.dto.LibroDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

//    @Transient
//    private List<Autor> autores;
    private List<String> lenguajes;
    private Integer cantDescargas;

    public Libro() {
    }

    public Libro (LibroDTO libroDTO){
        this.titulo = libroDTO.titulo();
//        this.autores = libroDTO.autores().stream()
//                .map(a->new Autor(a))
//                .collect(Collectors.toList());
        this.lenguajes = libroDTO.lenguajes();
        this.cantDescargas = libroDTO.cantDescargas();
    }



    @Override
    public String toString() {
        return "----------------------------LIBRO----------------------------" +
                "\nTitulo= " + titulo +
                "\nLenguajes= " + lenguajes +
                "\nCantidad de Descargas= " + cantDescargas +
                "\n-----------------------------------------------------------";
    }
}
