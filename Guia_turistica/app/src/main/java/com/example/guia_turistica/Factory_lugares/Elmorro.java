package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Elmorro implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Parque_Nacional_Morro;
    }

    @Override
    public int descripcion() {
        return R.string.Parque_Nacional_Morro_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.morro;
    }

    @Override
    public String latitud() {
        return "19.888466";
    }

    @Override
    public String logintud() {
        return "-71.652975";
    }
}
