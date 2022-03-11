package com.gonzalez.blanchard.ejemplolistviewviernes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetallePersonaje extends AppCompatActivity {

    TextView tv_nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_personaje);

        tv_nombre = findViewById(R.id.tv_nombre);

        //Obteniendo el valor del activity 1
        Bundle extras = getIntent().getExtras();
        String valor = extras.getString("nombre");

        if (extras != null) {
            //establecer el valor obtenido en el texto nombre
            tv_nombre.setText(valor);
        }

    }
}