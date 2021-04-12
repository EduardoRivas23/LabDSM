package com.example.dsmparcial2;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptador;
    private ArrayList<Entidad> arrayEntidad = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        lvItems = (ListView) findViewById(R.id.lvItems);

        llenarItems();
    }

    private void llenarItems(){
        arrayEntidad.add(new Entidad(R.drawable.corte2, "Corte de Cabello para Mujer ", "Ofrecemos una gran Variedad en encortes para mujeres " +
                "       Desde  $10"));
        arrayEntidad.add(new Entidad(R.drawable.corte, "Corte de cabello para Hombre", "Ofrecemos una  gran Variedad en cortes para Hombres" +
                "       Desde $5"));
        arrayEntidad.add(new Entidad(R.drawable.ex, "Extenciones", "Variedad en extenciones " +
                "       Desde $10"));
        arrayEntidad.add(new Entidad(R.drawable.facial, "Tratamientos Faciales", "En nuestro establesimiento contamos con diveros tipos de tratamientos faciales " +
                "       Desde $15"));
        arrayEntidad.add(new Entidad(R.drawable.images, "Manicuras", "ofrecemos distintos tipos de Manucuras " +
                "       Desde $10"));
        arrayEntidad.add(new Entidad(R.drawable.pedi, "Pedicuras", "ofrecemos distintos tipos de Pedicuras " +
                "       Desde $10"));
        arrayEntidad.add(new Entidad(R.drawable.tinte, "Tintes para el Cabello", "Gran variedad en colores y marcas de tintes  " +
                "       Desde $10"));
        arrayEntidad.add(new Entidad(R.drawable.maqui, "Maquillajes", "Gran variedad en colores y marcas de maquillaje " +
                "       Desde $10"));
        arrayEntidad.add(new Entidad(R.drawable.masa, "Masajes", "ofrecemos Masajes relajantes " +
                "      Desde $10"));
        //arrayEntidad.add(new Entidad(R.drawable.cera, "Cera caliente y fría", "ofrecemos depilacion con Cera caliente y fría " +
          //      "      Desde $20"));
        //arrayEntidad.add(new Entidad(R.drawable.li, "Alisados", "Alisados para cabellos " +
          //      "      Desde $10"));

        adaptador = new Adaptador(this, arrayEntidad);
        lvItems.setAdapter(adaptador);
    }
}
