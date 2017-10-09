package com.hlc.examenud1pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 *@author Juan Javier Simón Lucas
 *
 * Esta aplicación permite que el usuario introduzca un número y calcular
 * el factorial de este al pulsar un boton.
 */

public class MainActivity extends AppCompatActivity {
    //-----VARIABLES-----
    private EditText viewNumero;//EditText de aqui cogeremos el nº introducido por el usuario
    private TextView viewResultado;//TextView aqui mostraremos el resultado despues de calcular el factorial
    private int n;//Cogera el valor tecleado por el usuario
    private int result;//variable que almacenara el resultado de calcular el factorial

    /**
     * Nos permite crear la activity principal especificada en el xml activity_main
     * @param savedInstanceState //Nos permite crear la activity y recuperar su estado si no se a eliminado
     *                          si es la primera vez que se ejecuta su valor sera null
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewResultado = (TextView) findViewById (R.id.resultado);
        viewResultado.setText (String.valueOf (result));

        viewNumero = (EditText) findViewById(R.id.numero);


    }

    /**
     * Metodo que vacia el editText al hacer click en el
     */
    public void vaciarEditText(View view){
        viewNumero.setText("");
    }

    /**
     * Metodo que calcula el factorial de un numero
     */
    public void factorial (View view) {
        n = Integer.parseInt(String.valueOf(viewNumero.getText()));
        result=1;
        for(int i=n; i>0; i--){
            result=result*i;
        }

        viewResultado.setText("El factorial de: " + n +" es: "+ String.valueOf(result));
    }
}
