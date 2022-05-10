package com.example.mainapplication;


import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.ActionBar;

import android.content.Intent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import android.os.Bundle;

public class BoatChoices extends AppCompatActivity {
    private ImageSwitcher imgSwitcher;
    private Button btnViewboat1, btnViewboat2;
    public Button Boat1button, Boat2button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat_choices);

        imgSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        imgSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in));
        imgSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out));
        btnViewboat2 = (Button) findViewById(R.id.boat2);
        btnViewboat1 = (Button) findViewById(R.id.boat1);
        imgSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView myView = new ImageView(getApplicationContext());
                myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                myView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
                return myView;
            }
        });

        btnViewboat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BOAT 1", Toast.LENGTH_LONG).show();
                imgSwitcher.setImageResource(R.drawable.picboat11);
            }
        });

        btnViewboat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BOAT 2", Toast.LENGTH_LONG).show();
                imgSwitcher.setImageResource(R.drawable.picboat21);
            }
        });

        Boat1button = (Button) findViewById(R.id.boat1gallary1);
        Boat1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogMessage();

            }
        });

        Boat2button = (Button) findViewById(R.id.boat1gallary2);
        Boat2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogMessage1();

            }
        });
    }

    public void openDialogMessage(){
        Intent intent = new Intent(this, BoatGalary.class);
        startActivity(intent);
    }

    public void openDialogMessage1(){
        Intent intent = new Intent(this, BoatGalary2.class);
        startActivity(intent);
    }
}