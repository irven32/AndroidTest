package com.example.pizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity {
    Spinner list;


    String [] pizzaArray={"periperi","butterchicken","vegeterian","chiken","cheese","mushroom",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(Spinner)findViewById(R.id.listview);


        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, simple_list_item_1);
        list.setAdapter(adapter);

        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
