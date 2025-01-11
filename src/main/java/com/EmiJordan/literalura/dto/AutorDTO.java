package com.EmiJordan.literalura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutorDTO(
        @JsonProperty("name") String nombreCompleto,
        @JsonProperty("birth_year") Integer anioNacimiento,
        @JsonProperty("death_year") Integer anioFallecimiento
) {
}
