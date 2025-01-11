package com.EmiJordan.literalura.repository;

import com.EmiJordan.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
