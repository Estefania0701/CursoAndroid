package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    Toast.makeText() es un método que se utiliza para mostrar un mensaje
    corto en forma de notificación en la pantalla del dispositivo Android.
    Este método crea un objeto Toast que se utiliza para mostrar el mensaje.

    Este método toma tres argumentos:
    - El contexto actual en el que se mostrará la notificación. En este caso,
    se utiliza this para referirse a la actividad actual.
    - El mensaje que se va a mostrar en la notificación. En este caso, se
    muestra el mensaje que indica el estado actual de la actividad en el ciclo
    de vida, por ejemplo, "OnCreate" o "OnResume".
    - La duración de la notificación, que puede ser Toast.LENGTH_SHORT para
    una duración corta o Toast.LENGTH_LONG para una duración más larga.
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EJEMPLO DE DEBUGGEO
        int matematicas = 5;
        int quimica = 5;
        int fisica = 5;
        int promedio = 0;

        promedio = (matematicas + quimica + fisica) / 3;

        if (promedio >= 6) {
            Toast.makeText(this, "Aprobado", Toast.LENGTH_SHORT).show();
        } else if (promedio <= 5) {
            Toast.makeText(this, "Reprobado", Toast.LENGTH_SHORT).show();
        }
    }
}