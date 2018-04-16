package com.example.application.botona;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatButton raised_btn, flat_btn;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raised_btn =(AppCompatButton) findViewById(R.id.raised_btn);
        flat_btn =(AppCompatButton) findViewById(R.id.flat_btn);
        fab =(FloatingActionButton) findViewById(R.id.fab_btn);

        raised_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("Raised Button");
            }
        });
        flat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("Flat Button");
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("FAB Button");
            }
        });


    }

    public void makeToast(String title){
        Toast.makeText(getApplicationContext(), title, Toast.LENGTH_LONG).show();
    }

}
