package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Las_salinas implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.las_Salinas;
    }

    @Override
    public int descripcion() {
        return R.string.las_salinas_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.lassalinas;
    }

    @Override
    public String latitud() {
        return "18.225051";
    }

    @Override
    public String logintud() {
        return "-70.549774";
    }
}
