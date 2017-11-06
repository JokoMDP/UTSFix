package com.example.asus.UTS;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity{

    String[] perangkat = { "Activity Anthoni", "Activity Ahmad", "Activity Marita"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, perangkat));
    }

    public void onListItemClick(ListView parent, View v, int urutan, long id) {
        Object detail = this.getListAdapter().getItem(urutan);
        String tampil = detail.toString();
        Intent i = null;
        if(tampil=="Activity Anthoni")
        {
            i = new Intent(MainActivity.this, ActivityAnthoni.class);
            startActivity(i);
        }else if(tampil=="Activity Ahmad")
        {

            i = new Intent(MainActivity.this, ActivityAhmad.class);

            startActivity(i);

        }

        else if(tampil=="Activity Marita")

        {

            i = new Intent(MainActivity.this, ActivityMarita.class);

            startActivity(i);

        }

    }
}


