package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Las_Cuevas_del_Pomier implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.las_Cuevas_del_Pomier_sc;
    }

    @Override
    public int descripcion() {
        return R.string.las_Cuevas_del_Pomier_sc_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.cuevaspomier;
    }

    @Override
    public String latitud() {
        return "18.467238";
    }

    @Override
    public String logintud() {
        return "-70.135293";
    }
}
