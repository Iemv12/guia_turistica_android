package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Altos_de_Chavón implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Altos_de_Chavón;
    }

    @Override
    public int descripcion() {
        return R.string.Altos_de_Chavón_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.chavon;
    }

    @Override
    public String latitud() {
        return "18.421670";
    }

    @Override
    public String logintud() {
        return "-68.890082";
    }
}
