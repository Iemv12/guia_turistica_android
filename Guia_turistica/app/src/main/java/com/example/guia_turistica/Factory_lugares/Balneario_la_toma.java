package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Balneario_la_toma implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.banearo_la_toma_sc;
    }

    @Override
    public int descripcion() {
        return R.string.banearo_la_toma_sc_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.latoma;
    }

    @Override
    public String latitud() {
        return "18.456378";
    }

    @Override
    public String logintud() {
        return "-70.1236258";
    }
}
