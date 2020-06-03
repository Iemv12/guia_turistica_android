package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Islas_beata implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Islas_Beata;
    }

    @Override
    public int descripcion() {
        return R.string.Islas_Beata_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.islasbeata;
    }

    @Override
    public String latitud() {
        return "17.570161";
    }

    @Override
    public String logintud() {
        return "-71.513379";
    }
}
