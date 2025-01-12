package com.EmiJordan.literalura.model;

import com.EmiJordan.literalura.dto.AutorDTO;
import com.EmiJordan.literalura.dto.LibroDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Entity
public class Libro {
    //--atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    private List<Autor> autores;

    @Enumerated(value = EnumType.STRING)
    private Idioma idioma;
    private Integer cantDescargas;

    public Libro (LibroDTO libroDTO){
        this.titulo = libroDTO.titulo();
        this.autores = libroDTO.autores().stream()
                .map(a->new Autor(a))
                .collect(Collectors.toList());
        this.idioma = Idioma.desdeAbreviatura(libroDTO.lenguajes().get(0));
        this.cantDescargas = libroDTO.cantDescargas();
    }



    @Override
    public String toString() {

        String autoresConcatenados = autores.stream()
                .map(a->a.getNombreCompleto())
                .collect(Collectors.joining("; "));

        return "----------------------------LIBRO----------------------------" +
                "\nTitulo: " + titulo +
                "\nAutores: " + autoresConcatenados +
                "\nIdioma: " + idioma +
                "\nCantidad de Descargas: " + cantDescargas +
                "\n-----------------------------------------------------------";
    }
}
