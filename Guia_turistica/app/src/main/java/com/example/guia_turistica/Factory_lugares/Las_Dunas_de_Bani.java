package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Las_Dunas_de_Bani implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.las_Dunas_de_Bani_bn;
    }

    @Override
    public int descripcion() {
        return R.string.las_Dunas_de_Bani_b_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.dunasbani;
    }

    @Override
    public String latitud() {
        return "18.213630";
    }

    @Override
    public String logintud() {
        return "-70.531300";
    }
}
