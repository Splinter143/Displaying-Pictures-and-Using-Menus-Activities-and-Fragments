package com.example.mainapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class PassengerScreen4 extends AppCompatActivity {
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_screen4);

    }

    public void onStart(){
        super.onStart();
        progressDialog = ProgressDialog.show(this, "Please Wait",
                "Processing...", true);
        CountDownTimer timer = new CountDownTimer(1500,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }
            @Override
            public void onFinish() {
                progressDialog.dismiss();
            }
        }.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        createMenu(menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return menuChoice(item);
    }

    private void createMenu(Menu menu) {
        MenuItem mnu1 = menu.add(0, 0, 0, "Emman N. Saludes");
        {
            mnu1.setAlphabeticShortcut('a');
        }
        MenuItem mnu2 = menu.add(0, 1, 1, "John Gray A. Bautista");
        {
            mnu2.setAlphabeticShortcut('b');
        }
        MenuItem mnu3 = menu.add(0, 2, 2, "John Relix Pascua");
        {
            mnu3.setAlphabeticShortcut('c');
        }
        MenuItem mnu4 = menu.add(0, 3, 3, "Vladimir Putin");
        {
            mnu4.setAlphabeticShortcut('d');
        }
        menu.add(0, 4, 4, "Rodrigo Roa Duterte");
    }

    private boolean menuChoice(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Intent intent = new Intent(this, PassengerScreen.class);
                startActivity(intent);
                return true;
            case 1:
                Intent intent1 = new Intent(this, PassengerScreen1.class);
                startActivity(intent1);
                return true;
            case 2:
                Intent intent2 = new Intent(this, PassengerScreen2.class);
                startActivity(intent2);
                return true;
            case 3:
                Intent intent3 = new Intent(this, PassengerScreen3.class);
                startActivity(intent3);
                return true;
            case 4:
                Intent intent4 = new Intent(this, PassengerScreen4.class);
                startActivity(intent4);
                return true;
        }
        return false;
    }
}