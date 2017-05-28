package com.ampro.parag.snackbar.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ampro.parag.snackbar.R;


public class MainActivity extends AppCompatActivity {

    private Button snack, bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        snack = (Button) findViewById(R.id.snack);
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, snackBarDemo.class);
                startActivity(i);
            }
        });

        bottomNavigation = (Button) findViewById(R.id.bottomNavigation);
        bottomNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BottomNavigationDemo.class);
                startActivity(i);
            }
        });

    }
}
