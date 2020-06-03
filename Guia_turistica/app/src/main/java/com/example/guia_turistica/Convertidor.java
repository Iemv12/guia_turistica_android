package com.example.guia_turistica;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.example.guia_turistica.Fachada_moneda.Extranjera_dominicana;
import com.example.guia_turistica.Factory_moneda.Crear_monedas;
import com.example.guia_turistica.Factory_moneda.Monedas;
import com.example.guia_turistica.R;
import com.example.guia_turistica.Spinner_design.Custom_spinner;

public class Convertidor extends AppCompatActivity {

    Custom_spinner cs;
    Spinner sp;
    EditText et1;
    TextView tv1;
    String name[]={"Dollar","Dollar canadien","Euro","Pound sterling","российский рубль"};
    int banderas []={R.drawable.usa,R.drawable.cana,R.drawable.ue,R.drawable.uk,R.drawable.ru};
    Button bt1;
    Crear_monedas cr = new Crear_monedas();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertidor);

        sp=findViewById(R.id.spinner);
        et1=findViewById(R.id.moneda);
        tv1=findViewById(R.id.resultado);
        bt1=findViewById(R.id.convertidor);
        cs = new Custom_spinner(this,name,banderas);

        sp.setAdapter(cs);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int position, long l) {

                final Extranjera_dominicana ed = new Extranjera_dominicana();

                try {

                    if (position == 0) {
                        Monedas im = cr.getMonedas(1);
                        Double dollar = im.Monedas_valor();
                        String peso = et1.getText().toString();
                        Double dr = Double.parseDouble(peso);

                        Double result = ed.convertir_moneda(dr, dollar);
                        tv1.setText("Su cantidad de moneda en RD. es de:\n                    $" + result+"DOP.");
                    }

                    if (position == 1) {
                        String peso = et1.getText().toString();
                        Double dr = Double.parseDouble(peso);
                        Monedas im = cr.getMonedas(2);
                        Double dollar_canadiense = im.Monedas_valor();

                        Double result = ed.convertir_moneda(dr, dollar_canadiense);
                        tv1.setText("Su cantidad de moneda en RD. es de:\n                    $" + result+"DOP.");
                    }
                    if (position == 2) {
                        String peso = et1.getText().toString();
                        Double dr = Double.parseDouble(peso);
                        Monedas im = cr.getMonedas(3);
                        Double euro = im.Monedas_valor();

                        Double result = ed.convertir_moneda(dr, euro);
                        tv1.setText("Su cantidad de moneda en RD. es de:\n                    $" + result+"DOP.");
                    }

                    if (position == 3) {
                        String peso = et1.getText().toString();
                        Double dr = Double.parseDouble(peso);
                        Monedas im = cr.getMonedas(4);
                        Double libra_esterlina = im.Monedas_valor();

                        Double result = ed.convertir_moneda(dr, libra_esterlina);
                        tv1.setText("Su cantidad de moneda en RD. es de:\n                    $" + result+"DOP.");
                    }

                    if (position == 4) {
                        String peso = et1.getText().toString();
                        Double dr = Double.parseDouble(peso);
                        Monedas im = cr.getMonedas(5);
                        Double rublo_ruso = im.Monedas_valor();
                        Double result = ed.convertir_moneda(dr, rublo_ruso);
                        tv1.setText("Su cantidad de moneda en RD. es de:\n                    $" + result+"DOP.");
                    }

                }catch (Exception ea){

                }
                }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(Convertidor.this);

        View modifi = getLayoutInflater().inflate(R.layout.alert_personalizado,null);

        builder = builder.setTitle(R.string.valor);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                dialog.cancel();

            }
        });
        builder.setView(modifi);
        builder.create();
        builder.show();

    }
}
