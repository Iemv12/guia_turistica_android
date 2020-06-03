package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Balnearo_lazurza implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Balneario_La_Zurza;
    }

    @Override
    public int descripcion() {
        return R.string.Balneario_La_Zurza_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.lazurza;
    }

    @Override
    public String latitud() {
        return "18.397891";
    }

    @Override
    public String logintud() {
        return "-71.569899";
    }
}
