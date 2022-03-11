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
    private ArrayList<Personaje> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview1);

        names = new ArrayList<Personaje>();

        // Con esto se añade un personaje
        Personaje personaje1 = new Personaje(1,
                "Iron Man",
                false,
                "https://larepublica.pe/resizer/QH3_ZFa7BAb5ZkswPgsxNEMeBVg=/1200x660/top/arc-anglerfish-arc2-prod-gruporepublica.s3.amazonaws.com/public/R5N7XOWD35FDRM4U32IFZII3S4.JPG",
                "Iron Man (conocido en español como el Hombre de Hierro) es un superhéroe que aparece en los cómics estadounidenses publicados por Marvel Comics. El personaje fue cocreado por el escritor y editor Stan Lee, desarrollado por el guionista Larry Lieber y diseñado por los artistas Don Heck y Jack Kirby.");
        names.add(personaje1);


        // Con esto se añade un personaje
        names.add(new Personaje(2,
                "Viuda Negra",
                false,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/viuda-negra-black-widow-1531482956.jpg",
                "Natalia Alianovna Romanova, más conocida como Natasha Romanoff, es un personaje ficticio interpretado por Scarlett Johansson en la franquicia cinematográfica Universo cinematográfico de Marvel, basada en el personaje de Marvel Comics del mismo nombre, a veces conocida por su alter ego, Black Widow"
                )
        );

        // Con esto se añade un personaje
        names.add(new Personaje(3,
                        "Capitan America",
                        true,
                        "https://i0.wp.com/hipertextual.com/wp-content/uploads/2019/05/hipertextual-avengers-endgame-futuro-capitan-america-2019781893-scaled.jpg?fit=1200%2C750&ssl=1",
                        "l Capitán América, cuyo nombre real es Steven \"Steve\" Grant Rogers, es un superhéroe ficticio que aparece en los cómics estadounidenses publicados por Marvel Comics."
                )
        );


        // Con esto se añade un personaje
        names.add(new Personaje(2,
                        "Viuda Negra",
                        false,
                        "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/viuda-negra-black-widow-1531482956.jpg",
                        "Natalia Alianovna Romanova, más conocida como Natasha Romanoff, es un personaje ficticio interpretado por Scarlett Johansson en la franquicia cinematográfica Universo cinematográfico de Marvel, basada en el personaje de Marvel Comics del mismo nombre, a veces conocida por su alter ego, Black Widow"
                )
        );

        // Con esto se añade un personaje
        names.add(new Personaje(3,
                        "Capitan America",
                        true,
                        "https://i0.wp.com/hipertextual.com/wp-content/uploads/2019/05/hipertextual-avengers-endgame-futuro-capitan-america-2019781893-scaled.jpg?fit=1200%2C750&ssl=1",
                        "l Capitán América, cuyo nombre real es Steven \"Steve\" Grant Rogers, es un superhéroe ficticio que aparece en los cómics estadounidenses publicados por Marvel Comics."
                )
        );

        // Con esto se añade un personaje
        names.add(new Personaje(2,
                        "Viuda Negra",
                        false,
                        "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/viuda-negra-black-widow-1531482956.jpg",
                        "Natalia Alianovna Romanova, más conocida como Natasha Romanoff, es un personaje ficticio interpretado por Scarlett Johansson en la franquicia cinematográfica Universo cinematográfico de Marvel, basada en el personaje de Marvel Comics del mismo nombre, a veces conocida por su alter ego, Black Widow"
                )
        );

        // Con esto se añade un personaje
        names.add(new Personaje(3,
                        "Capitan America",
                        true,
                        "https://i0.wp.com/hipertextual.com/wp-content/uploads/2019/05/hipertextual-avengers-endgame-futuro-capitan-america-2019781893-scaled.jpg?fit=1200%2C750&ssl=1",
                        "l Capitán América, cuyo nombre real es Steven \"Steve\" Grant Rogers, es un superhéroe ficticio que aparece en los cómics estadounidenses publicados por Marvel Comics."
                )
        );

        // Con esto se añade un personaje
        names.add(new Personaje(2,
                        "Viuda Negra",
                        false,
                        "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/viuda-negra-black-widow-1531482956.jpg",
                        "Natalia Alianovna Romanova, más conocida como Natasha Romanoff, es un personaje ficticio interpretado por Scarlett Johansson en la franquicia cinematográfica Universo cinematográfico de Marvel, basada en el personaje de Marvel Comics del mismo nombre, a veces conocida por su alter ego, Black Widow"
                )
        );

        // Con esto se añade un personaje
        names.add(new Personaje(3,
                        "Capitan America",
                        true,
                        "https://i0.wp.com/hipertextual.com/wp-content/uploads/2019/05/hipertextual-avengers-endgame-futuro-capitan-america-2019781893-scaled.jpg?fit=1200%2C750&ssl=1",
                        "l Capitán América, cuyo nombre real es Steven \"Steve\" Grant Rogers, es un superhéroe ficticio que aparece en los cómics estadounidenses publicados por Marvel Comics."
                )
        );


        /*names.add("Iron Man");
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
        names.add("Pantera negra");*/

        //ArrayAdapter<String> adapter;
        //adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, names);
        MyAdapter adapter = new MyAdapter(MainActivity.this, R.layout.list_item, names);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Has seleccionado" + names.get(i), Toast.LENGTH_SHORT).show();

                Intent pantalla2 = new Intent(MainActivity.this, DetallePersonaje.class);

                Bundle bundle = new Bundle();
                bundle.putString("nombre", names.get(i).getNombre());
                bundle.putString("descripcion", names.get(i).getDescripcion());
                bundle.putString("foto", names.get(i).getFoto());
                pantalla2.putExtras(bundle);

                startActivity(pantalla2);

            }
        });

    }




}