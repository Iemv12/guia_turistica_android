package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Hoyo_azul implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Hoyo_Azul;
    }

    @Override
    public int descripcion() {
        return R.string.Hoyo_Azu_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.hoyoazul;
    }

    @Override
    public String latitud() {
        return "18.478367";
    }

    @Override
    public String logintud() {
        return "-68.442282";
    }
}
