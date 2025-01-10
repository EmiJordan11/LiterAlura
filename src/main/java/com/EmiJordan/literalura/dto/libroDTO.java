package com.EmiJordan.literalura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record libroDTO(
        @JsonProperty("title") String titulo,
        @JsonProperty("authors") List<autorDTO> autores,
        @JsonProperty("languages") List<String> lenguajes,
        @JsonProperty("download_count") Integer cantDescargas
) {
}
