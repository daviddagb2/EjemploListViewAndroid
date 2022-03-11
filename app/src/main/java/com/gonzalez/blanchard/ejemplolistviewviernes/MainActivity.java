package com.gonzalez.blanchard.ejemplolistviewviernes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview1);

        names = new ArrayList<String>();
        names.add("Iron Man");
        names.add("Capitan America");
        names.add("Viuda Negra");
        names.add("Vision");
        names.add("Hulk");
        names.add("Thor");
        names.add("Doctor Strange");
        names.add("Nick Fury");
        names.add("Capitana Marvel");
        names.add("Scarleth With");
        names.add("Thanos");
        names.add("Soy inevitable");
        names.add("Y yo soy Iron Man");
        names.add("Iron Man");
        names.add("Capitan America");
        names.add("Viuda Negra");
        names.add("Vision");
        names.add("Hulk");
        names.add("Thor");
        names.add("Pantera blanca");
        names.add("Nick Fury");
        names.add("Capitana Marvel");
        names.add("Scarleth With");
        names.add("Thanos");
        names.add("Soy inevitable");
        names.add("Pantera negra");

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, names);

        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Has seleccionado" + names.get(i), Toast.LENGTH_SHORT).show();

                Intent pantalla2 = new Intent(MainActivity.this, DetallePersonaje.class);

                Bundle bundle = new Bundle();
                bundle.putString("nombre", names.get(i));
                pantalla2.putExtras(bundle);

                startActivity(pantalla2);

            }
        });

    }




}