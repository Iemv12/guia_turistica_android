package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Polo_magnetico implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Polo_Magnético;
    }

    @Override
    public int descripcion() {
        return R.string.Polo_Magnético_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.polomagneticpo;
    }

    @Override
    public String latitud() {
        return "18.162337";
    }

    @Override
    public String logintud() {
        return "-71.255114";
    }
}
