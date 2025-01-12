package com.EmiJordan.literalura.model;

import com.EmiJordan.literalura.dto.AutorDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCompleto;
    private Integer anioNacimiento;
    private Integer anioFallecimiento;

    public Autor(AutorDTO autorDTO) {
        this.nombreCompleto = autorDTO.nombreCompleto();
        this.anioNacimiento = autorDTO.anioNacimiento();
        this.anioFallecimiento = autorDTO.anioFallecimiento();
    }
}
