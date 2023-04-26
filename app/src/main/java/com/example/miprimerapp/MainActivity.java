package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv; // estatus
    private EditText et1; // matematicas
    private EditText et2; // física
    private EditText et3; // química

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // obtengo los componentes por su id
        tv = (TextView) findViewById(R.id.estatus_tv);
        et1 = (EditText) findViewById(R.id.matematicas_et);
        et2 = (EditText) findViewById(R.id.fisica_et);
        et3 = (EditText) findViewById(R.id.quimica_et);
    }

    public void estatus(View view) {
        // se ejecuta al presionar el botón "Evaluar"

        // obtengo los valores de los componentes
        String matematicas_string = et1.getText().toString();
        String fisica_string = et2.getText().toString();
        String quimica_string = et3.getText().toString();

        // parseo a entero para reailzar operaciones
        int matematicas_int = Integer.parseInt(matematicas_string);
        int fisica_int = Integer.parseInt(fisica_string);
        int quimica_int = Integer.parseInt(quimica_string);

        // calculo el promedio
        int promedio = (matematicas_int + fisica_int + quimica_int) / 3;

        // determino si el alumno aprobó o no, y se lo asigno al tv
        if (promedio >= 6) {
            tv.setText("Estatus Aprobado con " + promedio);
        } else if (promedio <= 5) {
            tv.setText("Estatus Reprobado con " + promedio);
        }
    }
}