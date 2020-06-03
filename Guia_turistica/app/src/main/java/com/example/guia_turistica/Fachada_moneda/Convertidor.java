package com.example.guia_turistica.Fachada_moneda;

public class Convertidor {

    private Interfaz_moneda d_a_e,e_a_d;

    public Convertidor(){

        d_a_e= new Dominicana_extranjera();

        e_a_d=new Extranjera_dominicana();

    }

    public double dominicana_a_extranjera(double dominicana, double extranjera){

        return  d_a_e.convertir_moneda(dominicana,extranjera);
    }

    public double extranjera_a_dominicana(double dominicana,double extranjera){

        return e_a_d.convertir_moneda(dominicana,extranjera);

    }

}
