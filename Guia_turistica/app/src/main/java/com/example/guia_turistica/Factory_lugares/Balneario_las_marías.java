package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Balneario_las_marías implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Balneario_las_marías;
    }

    @Override
    public int descripcion() {
        return R.string.Balneario_las_marías_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.lasmarias;
    }

    @Override
    public String latitud() {
        return "18.490621";
    }

    @Override
    public String logintud() {
        return "-71.381934";
    }
}
