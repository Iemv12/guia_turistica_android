package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Parque_Nacional_Los_Haitises implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Parque_Nacional_Los_Haitises;
    }

    @Override
    public int descripcion() {
        return R.string.Parque_Nacional_Los_Haitises_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.loshaitises;
    }

    @Override
    public String latitud() {
        return "19.093645";
    }

    @Override
    public String logintud() {
        return "-69.797265";
    }
}
