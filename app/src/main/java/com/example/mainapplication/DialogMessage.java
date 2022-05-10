package com.example.mainapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class DialogMessage extends AppCompatActivity {

    public Button Ybutton;
    public Button Nbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_message);



        Ybutton = (Button) findViewById(R.id.Ybut);
        Ybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openCustomerList();
                onStart();
            }
        });

        Nbutton = (Button) findViewById(R.id.Nbut);
        Nbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }

    public void openCustomerList(){ // YES button
        Intent intent = new Intent(this, CustomerList.class);
        startActivity(intent);
    }

    public void openMainActivity(){ // NO button
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}