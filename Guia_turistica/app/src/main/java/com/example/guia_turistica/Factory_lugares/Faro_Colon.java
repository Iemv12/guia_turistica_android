package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Faro_Colon implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Faro_Colon;
    }

    @Override
    public int descripcion() {
        return R.string.Faro_Colon_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.farocolon;
    }

    @Override
    public String latitud() {
        return "18.482768";
    }

    @Override
    public String logintud() {
        return "-69.868578";
    }
}
