package com.gonzalez.blanchard.ejemplolistviewviernes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Personaje> nombres;

    public  MyAdapter(Context context, int layout, ArrayList<Personaje> nombres){
        this.context = context;
        this.layout = layout;
        this.nombres = nombres;
    }

    @Override
    public int getCount() {
        return this.nombres.size();
    }

    @Override
    public Object getItem(int i) {
        return this.nombres.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View vista = view;
        //inflamos la vista con nuestro propio layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        vista = layoutInflater.inflate(R.layout.list_item, null);

        TextView textoelemento = vista.findViewById(R.id.texto_elemento);
        textoelemento.setText(nombres.get(i).getNombre());

        ImageView imagenPersonaje = vista.findViewById(R.id.imagenelemento);

        Picasso.get()
                .load(nombres.get(i).getFoto() )
                .error(R.drawable.ic_launcher_background)
                .fit()
                .centerInside()
                .into(imagenPersonaje);


        return vista;

    }
}
