package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class datos extends AppCompatActivity {
    TextView tvcfm;
    TextView tvcfm1;
    TextView tvcfm2;
    TextView tvcfm3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        Intent intent1 = getIntent();
        tvcfm = (TextView) findViewById(R.id.nombreshowconf);
        tvcfm1 = (TextView) findViewById(R.id.fechashowconf);
        tvcfm2 = (TextView) findViewById(R.id.emailshowconf);
        tvcfm3 = (TextView) findViewById(R.id.telefonoshowconf);

        tvcfm.setText(getIntent().getStringExtra("Name2"));
        tvcfm2.setText(getIntent().getStringExtra("correo2"));
        tvcfm2.setText(getIntent().getStringExtra("phone2"));
        tvcfm3.setText(getIntent().getStringExtra("cumple2"));

    }
}
