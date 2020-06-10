package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import java.util.Calendar;

import static android.R.style.Theme_Holo_Light_Dialog;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    EditText nombreInput;
    EditText emailInput;
    EditText telefonoInput;
    Button  changeActivyti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombreInput = (EditText) findViewById(R.id.nombre);
        emailInput = (EditText) findViewById(R.id.email);
        telefonoInput = (EditText) findViewById(R.id.telefono);
        mDisplayDate = (TextView) findViewById(R.id.fecha);
        changeActivyti = (Button) findViewById(R.id.checar_datos);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

           DatePickerDialog dialog = new DatePickerDialog(
             MainActivity.this,1,  mDateSetListener , year,  month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month +1;
                Log.d(TAG, "onDateSet: dd/mm/yyy: " + day + "/" + month + "/" + year);

                String date = day +"/" + month+"/"+year;
                mDisplayDate.setText(date);
            }
        };
        changeActivyti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombrestr = nombreInput.getText().toString();
                String emailstr = emailInput.getText().toString();
                String telefonostr = telefonoInput.getText().toString();
                String nnknk = mDisplayDate.getText().toString();
                Intent intent = new Intent(MainActivity.this, checarDatos.class);
                intent.putExtra("Name", nombrestr);
                intent.putExtra("correo", emailstr);
                intent.putExtra("phone", telefonostr);
                intent.putExtra("cumple",nnknk);
                startActivity(intent);

            }
        });
    }

}
