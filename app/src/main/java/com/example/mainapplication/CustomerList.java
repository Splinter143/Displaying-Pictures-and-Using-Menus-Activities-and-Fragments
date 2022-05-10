package com.example.mainapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class CustomerList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();

        list.add("Emman N. Saludes");
        list.add("John Gray A. Bautista");
        list.add("John Relix Pascua");
        list.add("Vladimir Putin");
        list.add("Rodrigo Roa Duterte");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    startActivity(new Intent(CustomerList.this, PassengerScreen.class));

                }else if(position==1){
                    startActivity(new Intent(CustomerList.this, PassengerScreen1.class));
                }
                else if(position==2){
                    startActivity(new Intent(CustomerList.this, PassengerScreen2.class));
                }else if(position==3){
                    startActivity(new Intent(CustomerList.this, PassengerScreen3.class));
                }else if(position==4){
                    startActivity(new Intent(CustomerList.this, PassengerScreen4.class));
                }else{

                }

            }
        });
    }

}