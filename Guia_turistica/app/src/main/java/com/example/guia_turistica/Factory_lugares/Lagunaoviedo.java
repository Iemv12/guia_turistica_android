package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Lagunaoviedo implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Laguna_de_Oviedo;
    }

    @Override
    public int descripcion() {
        return R.string.Laguna_de_Oviedo_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.lagunaoviedo;
    }

    @Override
    public String latitud() {
        return "17.754881";
    }

    @Override
    public String logintud() {
        return "-71.364806";
    }
}
