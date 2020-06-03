package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Playa_san_rafael implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Balneario_san_rafael;
    }

    @Override
    public int descripcion() {
        return  R.string.Balneario_san_rafael_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.sanrafaell;
    }

    @Override
    public String latitud() {
        return "18.027302";
    }

    @Override
    public String logintud() {
        return "-71.137612";
    }
}
