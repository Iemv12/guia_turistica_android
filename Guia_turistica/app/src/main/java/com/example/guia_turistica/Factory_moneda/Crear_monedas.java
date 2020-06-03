package com.example.guia_turistica.Factory_moneda;

public class Crear_monedas {

    public Monedas getMonedas(int type_monedas){

        if(type_monedas==0){

            return null;
        }

        if(type_monedas==1){

            return new Usa();
        }
        if(type_monedas==2){

            return new Canada();
        }
        if(type_monedas==3){

            return new Europa();
        }
        if(type_monedas==4){

            return new ReinoUnido();
        }
        if(type_monedas==5){

            return new Rusia();
        }

        return null;
    }

}
