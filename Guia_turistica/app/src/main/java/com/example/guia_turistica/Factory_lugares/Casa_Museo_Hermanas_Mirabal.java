package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class Casa_Museo_Hermanas_Mirabal implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Casa_Museo_Hermanas_Mirabal;
    }

    @Override
    public int descripcion() {
        return R.string.Casa_Museo_Hermanas_Mirabal_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.museohermanas;
    }

    @Override
    public String latitud() {
        return "19.370408";
    }

    @Override
    public String logintud() {
        return "-70.368733";
    }
}
