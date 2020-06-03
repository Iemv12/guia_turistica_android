package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Parque_Nacional_Tres_Ojos implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Parque_Nacional_Tres_Ojos;
    }

    @Override
    public int descripcion() {
        return R.string.Parque_Nacional_Tres_Ojos_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.tresojos;
    }

    @Override
    public String latitud() {
        return "18.479812";
    }

    @Override
    public String logintud() {
        return "-69.843172";
    }
}
