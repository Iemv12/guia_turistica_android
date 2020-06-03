package com.example.guia_turistica.Factory_lugares;

import com.example.guia_turistica.R;

public class HéroesRestauracióna implements Datos_lugares {
    @Override
    public int nombre() {
        return R.string.Monumento_a_los_Héroes_de_la_Restauración;
    }

    @Override
    public int descripcion() {
        return R.string.Monumento_a_los_Héroes_de_la_Restauración_descripcion;
    }

    @Override
    public int foto() {
        return R.drawable.santiadomonumento;
    }

    @Override
    public String latitud() {
        return "19.450858";
    }

    @Override
    public String logintud() {
        return "-70.694768";
    }
}
