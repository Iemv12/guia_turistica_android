package com.example.guia_turistica.Factory_lugares;

public class Crear_lugares {

    public Datos_lugares getDatos_lugares(int lugar){

        if(lugar==0){

            return null;
        }

        if (lugar==1){

            return new Balneario_la_toma();
        }

        if(lugar==2){

            return new Las_Cuevas_del_Pomier();
        }

        if(lugar==3){

            return new Las_Dunas_de_Bani();
        }

        if(lugar==4){

            return new Las_salinas();
        }

        if(lugar==5){

            return  new Playa_Blanca();
        }

        if(lugar==6){

            return  new Playa_san_rafael();
        }

        if(lugar==7){

            return new Polo_magnetico();
        }

        if(lugar==8){

            return new Presa_Jigüey();
        }

        if(lugar==9){

            return  new Balneario_playa_los_Patos();
        }

        if(lugar==10){

            return  new Balneario_las_marías();
        }

        if(lugar==11){

            return  new BahiaAguiglas();
        }

        if(lugar==12){

            return  new Lagunaoviedo();
        }

        if(lugar==13){

            return  new Parque_Eólico_los_Cocos();
        }

        if(lugar==14){

            return  new Islas_beata();
        }

        if(lugar==15){

            return  new Lago_enriquillo();
        }

        if(lugar==16){

            return  new Balnearo_lazurza();
        }

        if(lugar==17){

            return  new HéroesRestauracióna();
        }

        if(lugar==18){

            return  new Charcos27();
        }

        if(lugar==19){

            return  new La_Catedral_Inmaculada_Concepción();
        }

        if(lugar==20){

            return  new Casa_Museo_Hermanas_Mirabal();
        }

        if(lugar==21){

            return  new Laguna_Dudul();
        }

        if(lugar==22){

            return  new Cascada_Limón();
        }

        if(lugar==23){

            return  new Elmorro();
        }


        if(lugar==24){

            return  new Altos_de_Chavón();
        }

        if(lugar==25){

            return  new Hoyo_azul();
        }

        if(lugar==26){

            return  new Montaña_Redonda();
        }

        if(lugar==27){

            return  new Parque_Nacional_Los_Haitises();
        }

        if(lugar==28){

            return  new Alcázar_de_Colon();
        }

        if(lugar==29){

            return  new Parque_Nacional_Tres_Ojos();
        }

        if(lugar==30){

            return  new Faro_Colon();
        }

        return null;
    }

}
