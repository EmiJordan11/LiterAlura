package com.EmiJordan.literalura.repository;

import com.EmiJordan.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombreCompleto(String nombreCompleto);
}
