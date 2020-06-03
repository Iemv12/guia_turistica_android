package com.example.guia_turistica;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Locale;

public class Idioma extends AppCompatActivity {

    ImageView iv,iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLocale();
        setContentView(R.layout.activity_idioma);

        iv=findViewById(R.id.eu);
        iv2=findViewById(R.id.es);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idioma("en");
                AlertDialog.Builder builder = new AlertDialog.Builder(Idioma.this);

                View modifi = getLayoutInflater().inflate(R.layout.english,null);

                builder = builder.setTitle("Language to english");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                        Intent intent = new Intent(Idioma.this,Idioma.class);
                        startActivity(intent);

                    }
                });
                builder.setView(modifi);
                builder.create();
                builder.show();

            }
        });

      iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idioma("es");
                AlertDialog.Builder builder = new AlertDialog.Builder(Idioma.this);

                View modifi = getLayoutInflater().inflate(R.layout.espanol,null);

                builder = builder.setTitle("Idioma a español");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                        Intent intent = new Intent(Idioma.this,Idioma.class);
                        startActivity(intent);

                    }
                });
                builder.setView(modifi);
                builder.create();
                builder.show();
            }
        });

    }


    private void idioma(String idioma){

        Locale locale = new Locale(idioma);
        Locale.setDefault(locale);
        Configuration config= new Configuration();
        config.locale=locale;
        getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor= getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("My_Lang",idioma);
        editor.apply();

    }

    public void loadLocale(){

        SharedPreferences prefs=getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String Language= prefs.getString("My_Lang","");
        idioma(Language);

    }

}
