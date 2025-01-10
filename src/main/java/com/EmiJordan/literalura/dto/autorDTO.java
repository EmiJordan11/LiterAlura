package com.EmiJordan.literalura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record autorDTO(
        @JsonProperty("name") String nombreCompleto,
        @JsonProperty("birth_year") String anioNacimiento,
        @JsonProperty("death_year") String anioFallecimiento
) {
}
