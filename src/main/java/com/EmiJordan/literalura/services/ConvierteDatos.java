package com.EmiJordan.literalura.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos {


    public static <T> T convierteDatos(String json, Class<T> clase) {
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
