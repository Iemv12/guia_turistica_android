package com.example.guia_turistica.Fachada_moneda;

public class Extranjera_dominicana implements Interfaz_moneda {

    @Override
    public double convertir_moneda(double dominicana, double  extranjera) {


        return dominicana*extranjera;
    }
}
