package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

/* Es una clase que se utiliza para almacenar y pasar datos entre diferentes
componentes de una aplicación.*/
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

// extends para heredar las propiedades y métodos de AppCompatActivity
public class MainActivity extends AppCompatActivity {

    // le indico a Android los componentes a usar
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    /*
    savedInstanceState es un objeto de tipo Bundle que contiene el estado
    anterior de la actividad si se reanuda después de haber sido destruida,
    o nulo si es la primera vez que se crea la actividad.
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /* se llama al método onCreate() de la clase padre
        ---- La llamada al método onCreate() de la superclase es necesaria para
        asegurarse de que se inicialicen todas las variables y recursos
        necesarios para la actividad antes de que se continúe con la ejecución
        del código de la actividad actual
        ----  El objeto savedInstanceState se pasa a la superclase onCreate()
        para que se encargue de restaurar el estado anterior de la actividad
        si es necesario.*/
        super.onCreate(savedInstanceState);

        /* Establece la vista que se mostrará en la pantalla de la actividad.
        En este caso, se utiliza el archivo activity_main.xml que se encuentra
        en la carpeta res/layout/ de la aplicación.
        VER ABAJO PARA MÁS INFO */
        setContentView(R.layout.activity_main);

        // busco los componentes del xml por su ID
        // casteo para que reconozca los componentes como tal
        et1 = (EditText) findViewById(R.id.num1_et);
        et2 = (EditText) findViewById(R.id.num2_et);
        tv1 = (TextView) findViewById(R.id.resultado_tv);
    }

    // Realiza la suma de los 2 números
    public void sumar(View view) {
        // obtengo el texto de los edittext
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        // convierto a enteros los valores (parseo)
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        // convierto a string el resultado int
        String resultado = String.valueOf(suma);

        // muestro el resultado en el text view
        tv1.setText(resultado);
    }
}

/*
-------------------------- SETCONTENTVIEW() ----------------------------

El método setContentView() solo puede recibir como parámetro la referencia
al archivo de diseño XML de la vista de la actividad actual. No es posible
pasar el nombre de otra actividad como parámetro para este método.

Cada actividad en Android tiene su propio archivo de diseño XML, que define
la estructura y el contenido de la vista que se muestra en la pantalla.
El archivo de diseño XML de la vista de la actividad actual se especifica
mediante el método setContentView(). Por lo tanto, si se desea mostrar una
vista diferente en la misma actividad, se debe cambiar el archivo de
diseño XML que se pasa como parámetro en el método setContentView(). Si se
desea mostrar una vista diferente en una actividad diferente, se debe
iniciar esa actividad mediante la creación de un objeto Intent y llamando al
método startActivity() con ese objeto como parámetro.


---------------------------- CLASE R -------------------------------------

La clase R es una clase generada automáticamente por el sistema de Android
cada vez que se compila un proyecto de Android. Esta clase se utiliza para
hacer referencia a todos los recursos de la aplicación, como los diseños de
las vistas, las imágenes, los archivos de audio, los valores de cadenas,
entre otros.

La clase R contiene un conjunto de subclases anidadas, que representan cada uno
de los tipos de recursos de la aplicación. Por ejemplo, la subclase R.layout
se utiliza para hacer referencia a los diseños de las vistas, la subclase
R.drawable se utiliza para hacer referencia a las imágenes, la subclase
R.string se utiliza para hacer referencia a los valores de cadenas, etc.

En general, para hacer referencia a un recurso en la aplicación, se utiliza una
sintaxis similar a la siguiente:

        R.tipoDeRecurso.nombreDeRecurso

Por ejemplo, para hacer referencia a un diseño de vista llamado
activity_main.xml, se utiliza la siguiente sintaxis:

        R.layout.activity_main

*/