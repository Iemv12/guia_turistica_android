package com.example.guia_turistica;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.guia_turistica.Factory_lugares.Crear_lugares;
import com.example.guia_turistica.Factory_lugares.Datos_lugares;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.PolyUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    LocationManager ubicacion;
    Boolean actual_location =true;
    private GoogleMap mMap;
    String latitud,longitud;
    double latitud_origen, longitud_origen;
    JSONObject jso;
    TextView tv;
    ImageView iv;
    Button btwha,btuber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        tv=findViewById(R.id.informacion);
        iv=findViewById(R.id.imagen);
        btwha=findViewById(R.id.comwha);
        btuber=findViewById(R.id.comuber);

        final String x= getIntent().getStringExtra("latitud");
        final String y = getIntent().getStringExtra("longitud");
        String valor = getIntent().getStringExtra("valor");
        Crear_lugares cl = new Crear_lugares();

        tv.setMovementMethod(new ScrollingMovementMethod());

        btwha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String whatsAppMessage = "http://maps.google.com/maps?saddr=" + x + "," + y;
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, whatsAppMessage);
                sendIntent.setType("text/plain");
                sendIntent.setPackage("com.whatsapp");
                startActivity(sendIntent);
            }
        });

        btuber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String uri = "geo: "+x+","+y+
                        "?q="+x+","+y ;
                Intent sendIntent = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse(uri));
                startActivity(sendIntent);
            }
        });

        if(valor.equals("1")) {

            Datos_lugares dl = cl.getDatos_lugares(1);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());


        }
        if(valor.equals("2")){

            Datos_lugares dl = cl.getDatos_lugares(2);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }

        if(valor.equals("3")){

            Datos_lugares dl = cl.getDatos_lugares(3);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }

        if(valor.equals("4")){

            Datos_lugares dl = cl.getDatos_lugares(4);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("5")){

            Datos_lugares dl = cl.getDatos_lugares(5);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("6")){

            Datos_lugares dl = cl.getDatos_lugares(6);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }

        if(valor.equals("7")){

            Datos_lugares dl = cl.getDatos_lugares(7);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }

        if(valor.equals("8")){

            Datos_lugares dl = cl.getDatos_lugares(8);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }

        if(valor.equals("9")){

            Datos_lugares dl = cl.getDatos_lugares(9);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }

        if(valor.equals("10")){

            Datos_lugares dl = cl.getDatos_lugares(10);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }

        if(valor.equals("11")){

            Datos_lugares dl = cl.getDatos_lugares(11);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("12")){

            Datos_lugares dl = cl.getDatos_lugares(12);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("13")){

            Datos_lugares dl = cl.getDatos_lugares(13);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("14")){

            Datos_lugares dl = cl.getDatos_lugares(14);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("15")){

            Datos_lugares dl = cl.getDatos_lugares(15);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("16")){

            Datos_lugares dl = cl.getDatos_lugares(16);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("17")){

            Datos_lugares dl = cl.getDatos_lugares(17);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("18")){

            Datos_lugares dl = cl.getDatos_lugares(18);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("19")){

            Datos_lugares dl = cl.getDatos_lugares(19);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("20")){

            Datos_lugares dl = cl.getDatos_lugares(20);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }

        if(valor.equals("21")){

            Datos_lugares dl = cl.getDatos_lugares(21);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("22")){

            Datos_lugares dl = cl.getDatos_lugares(22);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("23")){

            Datos_lugares dl = cl.getDatos_lugares(23);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("24")){

            Datos_lugares dl = cl.getDatos_lugares(24);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("25")){

            Datos_lugares dl = cl.getDatos_lugares(25);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("26")){

            Datos_lugares dl = cl.getDatos_lugares(26);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("27")){

            Datos_lugares dl = cl.getDatos_lugares(27);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("28")){

            Datos_lugares dl = cl.getDatos_lugares(28);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("29")){

            Datos_lugares dl = cl.getDatos_lugares(29);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }
        if(valor.equals("30")){

            Datos_lugares dl = cl.getDatos_lugares(30);
            tv.setText(dl.descripcion());
            iv.setImageResource(dl.foto());

        }


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this, R.raw.mapadia));

            if (!success) {

            }
        } catch (Resources.NotFoundException e) {

        }

        mMap.getUiSettings().setZoomControlsEnabled(true);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {
                // Mostrar diálogo explicativo
            } else {
                // Solicitar permiso
                ActivityCompat.requestPermissions(
                        this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        1);
            }
        }
        ubicacion = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        Location loc = ubicacion.getLastKnownLocation(LocationManager.GPS_PROVIDER);

       latitud = String.valueOf(loc.getLatitude());
       longitud = String.valueOf(loc.getLongitude());

       Toast.makeText(this,latitud+" "+longitud,Toast.LENGTH_LONG).show();

       mMap.setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() {
           @Override
           public void onMyLocationChange(Location location) {

               if(actual_location){
                   latitud_origen = location.getLatitude();
                   longitud_origen= location.getLongitude();
                   actual_location=false;

                   LatLng miposicion = new LatLng(latitud_origen,longitud_origen);
                   String x= getIntent().getStringExtra("latitud");
                   String y = getIntent().getStringExtra("longitud");

                   Double z = Double.parseDouble(x);
                   Double w = Double.parseDouble(y);

                   LatLng rd = new LatLng(z, w);
                   mMap.addMarker(new MarkerOptions().position(rd)
                           .title("Lugar de destino"));
                   mMap.moveCamera(CameraUpdateFactory.newLatLng(rd));


                   CameraPosition cameraPosition = new CameraPosition.Builder()
                           .target(new LatLng(latitud_origen,longitud_origen))
                           .zoom(14)
                           .bearing(25)
                           .build();
                   mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

                   String Url ="https://maps.googleapis.com/maps/api/directions/json?" +
                           "origin="+latitud_origen+","+longitud_origen+
                           "&destination="+x+","+y+"&key=AIzaSyBURs9jHOR8sq0RZlGRczONtFua4x_zNWE";

                   RequestQueue rq = Volley.newRequestQueue(Mapa.this);
                   StringRequest stringRequest = new StringRequest(Request.Method.GET, Url, new Response.Listener<String>() {
                       @Override
                       public void onResponse(String response) {

                           try {
                               jso = new JSONObject(response);

                               hacerruta(jso);
                               Log.i("Ruta:",""+response);

                           } catch (JSONException e) {
                               e.printStackTrace();
                           }

                       }
                   }, new Response.ErrorListener() {
                       @Override
                       public void onErrorResponse(VolleyError error) {

                       }
                   });

                   rq.add(stringRequest);


               }

           }
       });



    }

    private void hacerruta(JSONObject jso) {
        JSONArray jRoutes;
        JSONArray jLegs;
        JSONArray jSteps;

        try {
            jRoutes = jso.getJSONArray("routes");
            for (int i=0; i<jRoutes.length();i++){

                jLegs = ((JSONObject)(jRoutes.get(i))).getJSONArray("legs");

                for (int j=0; j<jLegs.length();j++){

                    jSteps = ((JSONObject)jLegs.get(j)).getJSONArray("steps");

                    for (int k = 0; k<jSteps.length();k++){

                        String polyline = ""+((JSONObject)((JSONObject)jSteps.get(k)).get("polyline")).get("points");
                        Log.i("end",""+polyline);
                        List<LatLng> list = PolyUtil.decode(polyline);
                        mMap.addPolyline(new PolylineOptions().addAll(list).color(Color.GRAY).width(5));


                    }

                }

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        if (requestCode == 1) {
            // ¿Permisos asignados?
            if (permissions.length > 0 &&
                    permissions[0].equals(Manifest.permission.ACCESS_FINE_LOCATION) &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                mMap.setMyLocationEnabled(true);
            } else {
                Toast.makeText(this, "Error de permisos", Toast.LENGTH_LONG).show();
            }

        }
    }


    }
