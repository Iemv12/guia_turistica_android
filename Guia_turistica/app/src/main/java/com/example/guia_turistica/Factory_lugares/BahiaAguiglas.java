package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class BahiaAguiglas implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Bahía_de_las_Águilas;
    }

    @Override
    public int descripcion() {
        return R.string.Bahía_de_las_Águilas_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.bahiaaguilas;
    }

    @Override
    public String latitud() {
        return "17.836805";
    }

    @Override
    public String logintud() {
        return "-71.628649";
    }
}
