package com.EmiJordan.literalura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BibliotecaDTO(
        @JsonProperty("results")List<LibroDTO> libros
        ) {
}
