package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Parque_Eólico_los_Cocos implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Parque_Eólico_los_Cocos;
    }

    @Override
    public int descripcion() {
        return R.string.Parque_Eólico_los_Cocos_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.parqueeolico;
    }

    @Override
    public String latitud() {
        return "17.873071";
    }

    @Override
    public String logintud() {
        return "-71.291884";
    }
}
