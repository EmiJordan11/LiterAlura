package com.EmiJordan.literalura.repository;

import com.EmiJordan.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombreCompleto(String nombreCompleto);

    @Query(value = "SELECT a FROM Autor a WHERE a.anioNacimiento <= :anioHasta AND a.anioFallecimiento>= :anioHasta")
    List<Autor> autoresPorAnio(Integer anioHasta);
}
