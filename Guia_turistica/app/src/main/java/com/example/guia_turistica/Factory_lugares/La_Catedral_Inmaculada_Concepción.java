package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class La_Catedral_Inmaculada_Concepción implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.La_Catedral_Inmaculada_Concepción;
    }

    @Override
    public int descripcion() {
        return R.string.La_Catedral_Inmaculada_Concepción_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.caterdrallavega;
    }

    @Override
    public String latitud() {
        return "19.224219";
    }

    @Override
    public String logintud() {
        return "-70.532683";
    }
}
