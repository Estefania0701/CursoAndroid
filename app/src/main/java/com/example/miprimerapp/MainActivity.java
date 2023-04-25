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
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        // La actividad está creada
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad est� a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }

}