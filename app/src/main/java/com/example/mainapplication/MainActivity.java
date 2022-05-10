package com.example.mainapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    public Button Pbutton, Pbbutton, Smbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pbutton = (Button) findViewById(R.id.Passbtn);
        Pbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogMessage();

        }
        });

        Pbbutton = (Button) findViewById(R.id.boatbtn);
        Pbbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogMessage1();

            }
        });

        Smbutton = (Button) findViewById(R.id.Smbtn);
        registerForContextMenu(Smbutton);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuinfo){
        super.onCreateContextMenu(menu, v, menuinfo);

        menu.setHeaderTitle("SOCIAL MEDIAS:");
        getMenuInflater().inflate(R.menu.social_media, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){

        switch(item.getItemId()){
            case R.id.FbSM:
                Intent intent = new Intent(this, webviewFB.class);
                startActivity(intent);
                return true;

            case R.id.YTSM:
                Intent intent1 = new Intent(this, webviewYT.class);
                startActivity(intent1);
                return true;
            default:
                return super.onContextItemSelected(item);
        }


    }

    public void openDialogMessage(){
        Intent intent = new Intent(this, DialogMessage.class);
        startActivity(intent);
    }

    public void openDialogMessage1(){
        Intent intent = new Intent(this, DialogMessage1.class);
        startActivity(intent);
    }


}