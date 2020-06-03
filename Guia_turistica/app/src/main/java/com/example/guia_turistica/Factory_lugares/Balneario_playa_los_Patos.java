package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Balneario_playa_los_Patos implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Balneario_playa_los_Patos;
    }

    @Override
    public int descripcion() {
        return R.string.Balneario_playa_los_Patos_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.lospatos;
    }

    @Override
    public String latitud() {
        return "17.956327";
    }

    @Override
    public String logintud() {
        return "-71.184030";
    }
}
