package com.gonzalez.blanchard.ejemplolistviewviernes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetallePersonaje extends AppCompatActivity {

    TextView tv_nombre, tv_descripcion;
    ImageView imagenPersonaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_personaje);

        tv_nombre = findViewById(R.id.tv_nombre);
        tv_descripcion = findViewById(R.id.tv_descripcion);
        imagenPersonaje = findViewById(R.id.imagenPersonaje);

        //Obteniendo el valor del activity 1
        Bundle extras = getIntent().getExtras();
        String valor = extras.getString("nombre");
        String descripcion = extras.getString("descripcion");
        String foto = extras.getString("foto");

        if (extras != null) {
            //establecer el valor obtenido en el texto nombre
            tv_nombre.setText(valor);
            tv_descripcion.setText(descripcion + " .........." + foto);

            Picasso.get()
                    .load(foto)
                    .error(R.drawable.ic_launcher_background)
                    .fit()
                    .centerInside()
                    .into(imagenPersonaje);
        }

    }
}