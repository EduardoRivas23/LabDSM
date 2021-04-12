package com.example.dsmparcial2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Adaptador extends BaseAdapter {
    private ArrayList<com.example.dsmparcial2.Entidad> listEntidad;
    private Context context;
    private LayoutInflater inflater;

    public Adaptador(Context context, ArrayList<com.example.dsmparcial2.Entidad> listEntidad) {
        this.context = context;
        this.listEntidad = listEntidad;
    }

    @Override
    public int getCount() {
        return listEntidad.size();
    }

    @Override
    public Object getItem(int position) {
        return listEntidad.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final com.example.dsmparcial2.Entidad entidad = (com.example.dsmparcial2.Entidad) getItem(position);


        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        ImageView imgFoto = (ImageView) convertView.findViewById(R.id.imgFoto);
        TextView tvTitulo = (TextView) convertView.findViewById(R.id.tvTitulo);
        TextView tvContenido = (TextView) convertView.findViewById(R.id.tvContenido);


        imgFoto.setImageResource(entidad.getImgFoto());
        tvTitulo.setText(entidad.getTitulo());
        tvContenido.setText(entidad.getContenido());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, com.example.dsmparcial2.DetalleLista.class);
                i.putExtra("item", entidad);
                context.startActivity(i);
                System.out.println("Click !!");
            }
        });

        return convertView;
    }
}
