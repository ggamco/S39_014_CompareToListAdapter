package com.gmbdesign.android.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Personas> listaPersonas = new ArrayList<>();
    private ListView listView;
    private ListAdapter la;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cargamos el arraylist
        listaPersonas.add(new Personas("Juan", 23));
        listaPersonas.add(new Personas("Antonio", 32));
        listaPersonas.add(new Personas("Alba", 25));
        listaPersonas.add(new Personas("Sara", 21));
        listaPersonas.add(new Personas("Miguel", 35));
        listaPersonas.add(new Personas("Pedro", 36));

        listView = (ListView) findViewById(R.id.lista);
        la = new ArrayAdapter<Personas>(this, R.layout.fila, listaPersonas);

        listView.setAdapter(la);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("ORDENAR POR EDAD");
        menu.add("ORDENAR POR NOMBRE");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getTitle().equals("ORDENAR POR EDAD")){
            Comparator<Personas> comparador = new ComparaPersonas();
            Collections.sort(listaPersonas, comparador);
        } else {
            Collections.sort(listaPersonas);
        }

        la = new ArrayAdapter<Personas>(this, R.layout.fila, listaPersonas);
        listView.setAdapter(la);

        return true;
    }
}
