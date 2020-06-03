package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Charcos27 implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Charcos_27;
    }

    @Override
    public int descripcion() {
        return R.string.Charcos_27_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.charchos;
    }

    @Override
    public String latitud() {
        return "19.734441";
    }

    @Override
    public String logintud() {
        return "-70.819330";
    }
}
