package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Laguna_Dudul implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Laguna_Dudul;
    }

    @Override
    public int descripcion() {
        return R.string.Laguna_Dudul_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.lagunadudu;
    }

    @Override
    public String latitud() {
        return "19.564428";
    }

    @Override
    public String logintud() {
        return "-69.908026";
    }
}
