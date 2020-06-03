package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Lago_enriquillo implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Lago_Enriquillo;
    }

    @Override
    public int descripcion() {
        return R.string.Lago_Enriquillo_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.lagoenriquillo;
    }

    @Override
    public String latitud() {
        return "18.471453";
    }

    @Override
    public String logintud() {
        return "-71.591921";
    }
}
