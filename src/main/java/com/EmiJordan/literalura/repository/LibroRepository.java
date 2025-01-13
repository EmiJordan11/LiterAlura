package com.EmiJordan.literalura.repository;

import com.EmiJordan.literalura.model.Idioma;
import com.EmiJordan.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    Optional<Libro> findByTitulo(String titulo);

    @Query(value = "SELECT l FROM Libro l WHERE l.idioma = :idioma")
    List<Libro> librosPorIdioma(Idioma idioma);

}
