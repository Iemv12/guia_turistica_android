package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Presa_Jigüey implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Presa_Jigüey;
    }

    @Override
    public int descripcion() {
        return R.string.Presa_Jigüey_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.jiguey;
    }

    @Override
    public String latitud() {
        return "18.558661";
    }

    @Override
    public String logintud() {
        return "-70.379175";
    }
}
