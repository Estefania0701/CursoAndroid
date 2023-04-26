package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // inicializo las variables que contendrán los componentes de la vista
    // Para poder recuperar o asignar valores
    private EditText et1, et2;
    private TextView tv;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // obtengo los componentes
        et1 = findViewById(R.id.num1_et);
        et2 = findViewById(R.id.num2_et);
        tv = findViewById(R.id.resultado_tv);
        rb1 = findViewById(R.id.sumar_rb);
        rb2 = findViewById(R.id.restar_rb);
    }

    // Método para el botón calcular
    public void calcular(View view) {

        // obtengo en string los valores de los edit text
        String num1_string = et1.getText().toString();
        String num2_string = et2.getText().toString();

        // valido que el usuario haya ingresado algo en los 2 campos
        String resultado;
        if (num1_string.trim().isEmpty() || num2_string.trim().isEmpty()) {
            resultado = "Primero ingresa los 2 valores a calcular";
            tv.setText(resultado);
        } else {
            // los convierto a enteros
            int num1_int = Integer.parseInt(num1_string);
            int num2_int = Integer.parseInt(num2_string);

            // reviso cuál botón se seleccionó
            int calculo = 0;
            if (rb1.isChecked()) {
                calculo = num1_int + num2_int;
                resultado = String.valueOf(calculo);
                tv.setText(resultado);
            } else if (rb2.isChecked()) {
                calculo = num1_int - num2_int;
                resultado = String.valueOf(calculo);
                tv.setText(resultado);
            } else {
                resultado = "Selecciona una operación a realizar";
                tv.setText(resultado);
            }
        }
    }
}