package com.EmiJordan.literalura.model;

import com.EmiJordan.literalura.dto.AutorDTO;
import jakarta.persistence.*;
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
    @Column(unique = true)
    private String nombreCompleto;
    private Integer anioNacimiento;
    private Integer anioFallecimiento;

    public Autor(AutorDTO autorDTO) {
        this.nombreCompleto = autorDTO.nombreCompleto();
        this.anioNacimiento = autorDTO.anioNacimiento();
        this.anioFallecimiento = autorDTO.anioFallecimiento();
    }

    @Override
    public String toString() {
        return "\n----------------------------AUTOR----------------------------" +
                "\nNombre completo: " + nombreCompleto +
                "\nAño de nacimiento: " + anioNacimiento +
                "\nAño de fallecimiento: " + anioFallecimiento +
                "\n------------------------------------------------------------";
    }
}
