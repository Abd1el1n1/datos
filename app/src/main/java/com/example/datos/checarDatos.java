package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;



public class checarDatos extends AppCompatActivity {
    TextView tv,tv1,tv2,tv3;
    Button regresar;
    Button confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checar_datos);
        regresar = (Button) findViewById(R.id.editar_datos);
        confirmar = (Button) findViewById(R.id.confirmar_datos);
        Intent intent = getIntent();
        tv = (TextView) findViewById(R.id.nombreshow);
        tv1 = (TextView) findViewById(R.id.fechashow);
        tv2 = (TextView) findViewById(R.id.emailshow);
        tv3 = (TextView) findViewById(R.id.telefonoshow);

        tv.setText(getIntent().getStringExtra("Name"));
        tv1.setText(getIntent().getStringExtra("correo"));
        tv2.setText(getIntent().getStringExtra("phone"));
        tv3.setText(getIntent().getStringExtra("cumple"));


        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombrestr2 = tv.getText().toString();
                String emailstr2 = tv1.getText().toString();
                String telefonostr2 = tv2.getText().toString();
                String nnknk2 = tv3.getText().toString();
                Intent intent1 = new Intent(checarDatos.this, datos.class);
                intent1.putExtra("Name2", nombrestr2);
                intent1.putExtra("correo2", emailstr2);
                intent1.putExtra("phone2", telefonostr2);
                intent1.putExtra("cumple2",nnknk2);
                startActivity(intent1);
            }
        });
    }
}
