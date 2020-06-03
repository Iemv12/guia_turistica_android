package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Montaña_Redonda implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Montaña_Redonda;
    }

    @Override
    public int descripcion() {

        return R.string.Montaña_Redonda_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.montanaredonda;
    }

    @Override
    public String latitud() {
        return "18.982398";
    }

    @Override
    public String logintud() {
        return "-68.916890";
    }
}
