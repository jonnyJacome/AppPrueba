package com.example.appprueba;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

class AdaptadorPaises extends ArrayAdapter<Pais> {

        /*public AdaptadorRevistas(Context context, Anios[] datos) {
            super(context, R.layout.ly_items, datos);
        }*/

    public AdaptadorPaises(Context context, List<Pais> datos) {
        super(context, R.layout.ly_paises, datos);
    }


        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.ly_paises, null);

            TextView lblTitulo = (TextView)item.findViewById(R.id.tvNombrePais);
            lblTitulo.setText("Nombre: "+getItem(position).getNombres()+"");

            //TextView lblSubtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);
            //lblSubtitulo.setText("Fecha pub."+getItem(position).getFechapub());


            /*ImageView imageView = (ImageView)item.findViewById(R.id.imgNoticia);
            Glide.with(this.getContext())
                    .load(getItem(position).getImgPortada())
                    .error(R.drawable.imgnotfound)
                    .into(imageView);*/


            return(item);
        }
    }

