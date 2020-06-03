package com.example.guia_turistica;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.example.guia_turistica.Factory_lugares.Crear_lugares;
import com.example.guia_turistica.Factory_lugares.Datos_lugares;
import com.example.guia_turistica.Lista_personalizada.Lista_item;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Lista_item> lista_lugares =new ArrayList();
    Crear_lugares cl = new Crear_lugares();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                lista_all();
                lugaresview();
                onClick();


    }

    private void onClick(){

        ListView lv = findViewById(R.id.listado);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int location, long l) {

                if(location==0){
                    Datos_lugares dl = cl.getDatos_lugares(1);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","1");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==1){
                    Datos_lugares dl = cl.getDatos_lugares(2);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("latitud",x);
                    i.putExtra("valor","2");
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==2){
                    Datos_lugares dl = cl.getDatos_lugares(3);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","3");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==3){
                    Datos_lugares dl = cl.getDatos_lugares(4);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","4");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==4){
                    Datos_lugares dl = cl.getDatos_lugares(5);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","5");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==5){
                    Datos_lugares dl = cl.getDatos_lugares(6);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","6");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }
                if(location==6){
                    Datos_lugares dl = cl.getDatos_lugares(7);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","7");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }
                if(location==7){
                    Datos_lugares dl = cl.getDatos_lugares(8);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","8");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }
                if(location==8){
                    Datos_lugares dl = cl.getDatos_lugares(9);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","9");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }
                if(location==9){
                    Datos_lugares dl = cl.getDatos_lugares(10);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","10");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==10){
                    Datos_lugares dl = cl.getDatos_lugares(11);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","11");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }
                if(location==11){
                    Datos_lugares dl = cl.getDatos_lugares(12);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","12");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==12){
                    Datos_lugares dl = cl.getDatos_lugares(13);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","13");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==13){
                    Datos_lugares dl = cl.getDatos_lugares(14);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","14");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==14){
                    Datos_lugares dl = cl.getDatos_lugares(15);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","15");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==15){
                    Datos_lugares dl = cl.getDatos_lugares(16);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","16");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==16){
                    Datos_lugares dl = cl.getDatos_lugares(17);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","17");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==17){
                    Datos_lugares dl = cl.getDatos_lugares(18);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","18");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==18){
                    Datos_lugares dl = cl.getDatos_lugares(19);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","19");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==19){
                    Datos_lugares dl = cl.getDatos_lugares(20);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","20");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==20){
                    Datos_lugares dl = cl.getDatos_lugares(21);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","21");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }
                if(location==21){
                    Datos_lugares dl = cl.getDatos_lugares(22);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","22");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==22){
                    Datos_lugares dl = cl.getDatos_lugares(23);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","23");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==23){
                    Datos_lugares dl = cl.getDatos_lugares(24);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","24");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==24){
                    Datos_lugares dl = cl.getDatos_lugares(25);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","25");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==25){
                    Datos_lugares dl = cl.getDatos_lugares(26);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","26");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==26){
                    Datos_lugares dl = cl.getDatos_lugares(27);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","27");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==27){
                    Datos_lugares dl = cl.getDatos_lugares(28);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","28");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==28){
                    Datos_lugares dl = cl.getDatos_lugares(29);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","29");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }

                if(location==29){
                    Datos_lugares dl = cl.getDatos_lugares(30);
                    Intent i = new Intent(MainActivity.this, Mapa.class);
                    String x = dl.latitud();
                    String y = dl.logintud();
                    i.putExtra("valor","30");
                    i.putExtra("latitud",x);
                    i.putExtra("longitud",y);
                    startActivity(i);
                }




            }
        });

    }

    private void lista_all(){

        Datos_lugares dl = cl.getDatos_lugares(1);
        lista_lugares.add(new Lista_item(dl.foto(),dl.nombre()));

        Datos_lugares dl2 = cl.getDatos_lugares(2);
        lista_lugares.add(new Lista_item(dl2.foto(),dl2.nombre()));

        Datos_lugares dl3 = cl.getDatos_lugares(3);
        lista_lugares.add(new Lista_item(dl3.foto(),dl3.nombre()));

        Datos_lugares dl4 = cl.getDatos_lugares(4);
        lista_lugares.add(new Lista_item(dl4.foto(),dl4.nombre()));

        Datos_lugares dl5 = cl.getDatos_lugares(5);
        lista_lugares.add(new Lista_item(dl5.foto(),dl5.nombre()));

        Datos_lugares dl6 = cl.getDatos_lugares(6);
        lista_lugares.add(new Lista_item(dl6.foto(),dl6.nombre()));

        Datos_lugares dl7 = cl.getDatos_lugares(7);
        lista_lugares.add(new Lista_item(dl7.foto(),dl7.nombre()));

        Datos_lugares dl8 = cl.getDatos_lugares(8);
        lista_lugares.add(new Lista_item(dl8.foto(),dl8.nombre()));

        Datos_lugares dl9 = cl.getDatos_lugares(9);
        lista_lugares.add(new Lista_item(dl9.foto(),dl9.nombre()));

        Datos_lugares dl10 = cl.getDatos_lugares(10);
        lista_lugares.add(new Lista_item(dl10.foto(),dl10.nombre()));

        Datos_lugares dl11 = cl.getDatos_lugares(11);
        lista_lugares.add(new Lista_item(dl11.foto(),dl11.nombre()));

        Datos_lugares dl12 = cl.getDatos_lugares(12);
        lista_lugares.add(new Lista_item(dl12.foto(),dl12.nombre()));

        Datos_lugares dl13 = cl.getDatos_lugares(13);
        lista_lugares.add(new Lista_item(dl13.foto(),dl13.nombre()));

        Datos_lugares dl14 = cl.getDatos_lugares(14);
        lista_lugares.add(new Lista_item(dl14.foto(),dl14.nombre()));

        Datos_lugares dl15 = cl.getDatos_lugares(15);
        lista_lugares.add(new Lista_item(dl15.foto(),dl15.nombre()));

        Datos_lugares dl16 = cl.getDatos_lugares(16);
        lista_lugares.add(new Lista_item(dl16.foto(),dl16.nombre()));

        Datos_lugares dl17 = cl.getDatos_lugares(17);
        lista_lugares.add(new Lista_item(dl17.foto(),dl17.nombre()));

        Datos_lugares dl18 = cl.getDatos_lugares(18);
        lista_lugares.add(new Lista_item(dl18.foto(),dl18.nombre()));

        Datos_lugares dl19 = cl.getDatos_lugares(19);
        lista_lugares.add(new Lista_item(dl19.foto(),dl19.nombre()));

        Datos_lugares dl20 = cl.getDatos_lugares(20);
        lista_lugares.add(new Lista_item(dl20.foto(),dl20.nombre()));

        Datos_lugares dl21 = cl.getDatos_lugares(21);
        lista_lugares.add(new Lista_item(dl21.foto(),dl21.nombre()));

        Datos_lugares dl22 = cl.getDatos_lugares(22);
        lista_lugares.add(new Lista_item(dl22.foto(),dl22.nombre()));

        Datos_lugares dl23 = cl.getDatos_lugares(23);
        lista_lugares.add(new Lista_item(dl23.foto(),dl23.nombre()));

        Datos_lugares dl24 = cl.getDatos_lugares(24);
        lista_lugares.add(new Lista_item(dl24.foto(),dl24.nombre()));

        Datos_lugares dl25 = cl.getDatos_lugares(25);
        lista_lugares.add(new Lista_item(dl25.foto(),dl25.nombre()));

        Datos_lugares dl26 = cl.getDatos_lugares(26);
        lista_lugares.add(new Lista_item(dl26.foto(),dl26.nombre()));

        Datos_lugares dl27 = cl.getDatos_lugares(27);
        lista_lugares.add(new Lista_item(dl27.foto(),dl27.nombre()));

        Datos_lugares dl28 = cl.getDatos_lugares(28);
        lista_lugares.add(new Lista_item(dl28.foto(),dl28.nombre()));

        Datos_lugares dl29 = cl.getDatos_lugares(29);
        lista_lugares.add(new Lista_item(dl29.foto(),dl29.nombre()));

        Datos_lugares dl30 = cl.getDatos_lugares(30);
        lista_lugares.add(new Lista_item(dl30.foto(),dl30.nombre()));


    }

    private void lugaresview(){

        ArrayAdapter<Lista_item> adapter=new Mylistadapter();
        ListView list = findViewById(R.id.listado);
        list.setAdapter(adapter);
    }

    private class Mylistadapter extends ArrayAdapter<Lista_item>{
        public Mylistadapter() {
            super(MainActivity.this, R.layout.lista_view,lista_lugares);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            View itemview = convertView;

            if(itemview==null)
                itemview=getLayoutInflater().inflate(R.layout.lista_view,parent,false);
            Lista_item lista_item = lista_lugares.get(position);

            ImageView imageView = itemview.findViewById(R.id.foto);
            imageView.setImageResource(lista_item.getFoto());

            TextView tv = itemview.findViewById(R.id.nombre);
            tv.setText(lista_item.getNombre());

            return itemview;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu3puntos,menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id==R.id.convertidor){
            Intent i = new Intent(MainActivity.this,Convertidor.class);
            startActivity(i);

        }

        if(id==R.id.idioma){
            Intent i = new Intent(MainActivity.this,Idioma.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}
