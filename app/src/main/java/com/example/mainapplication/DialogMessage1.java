package com.example.mainapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DialogMessage1 extends AppCompatActivity {
    ProgressDialog progressDialog;
    public Button Ybutton;
    public Button Nbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_message1);

        Ybutton = (Button) findViewById(R.id.Ybut);
        Ybutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                openBoatChoices();
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
    public void openBoatChoices(){ // YES button
        Intent intent = new Intent(this, BoatChoices.class);
        startActivity(intent);

    }

    public void openMainActivity(){ // NO button
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}