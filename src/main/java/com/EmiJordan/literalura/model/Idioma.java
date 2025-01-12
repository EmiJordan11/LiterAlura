package com.EmiJordan.literalura.model;

public enum Idioma {
    Español("es", "español"),
    Inglés("en", "inglés"),
    Húngaro("hu", "húngaro"),
    Francés("fr", "francés"),
    Portugués("pt", "portugués");

    private String abreviatura;
    private String idioma;

    Idioma(String abreviatura, String idioma){
        this.abreviatura=abreviatura;
        this.idioma=idioma;
    }

    public static Idioma desdeAbreviatura(String a){
        for (Idioma idioma: Idioma.values()){
            if (idioma.abreviatura.equalsIgnoreCase(a)) {
                return idioma;
            }
        }
        throw new IllegalArgumentException("Ningun idioma encontrado: " + a);
    }

    public static Idioma desdeIdiomaCompleto(String i){
        for (Idioma idioma: Idioma.values()){
            if (idioma.abreviatura.equalsIgnoreCase(i)) {
                return idioma;
            }
        }
        throw new IllegalArgumentException("Ningun idioma encontrado: " + i);
    }


}
