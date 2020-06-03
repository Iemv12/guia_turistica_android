package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Playa_Blanca implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.playa_Blanca_azua;
    }

    @Override
    public int descripcion() {
        return R.string.playa_Blanca_azua_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.playablanca;
    }

    @Override
    public String latitud() {
        return "18.396616";
    }

    @Override
    public String logintud() {
        return "-70.708471";
    }
}
