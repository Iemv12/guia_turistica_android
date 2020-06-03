package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Cascada_Limón implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Cascada_Limón;
    }

    @Override
    public int descripcion() {
        return R.string.Cascada_Limón_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.cascadalimon;
    }

    @Override
    public String latitud() {
        return "19.270364";
    }

    @Override
    public String logintud() {
        return "-69.445535";
    }
}
