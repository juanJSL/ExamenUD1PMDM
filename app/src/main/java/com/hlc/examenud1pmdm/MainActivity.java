package com.hlc.examenud1pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText viewNumero;
    private TextView viewResultado;
    private int n;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewResultado = (TextView) findViewById (R.id.resultado);
        viewResultado.setText (String.valueOf (result));

        viewNumero = (EditText) findViewById(R.id.numero);


    }

    //Calcula el factorial de un numero
    public void factorial (View view) {
        n = Integer.parseInt(String.valueOf(viewNumero.getText()));
        result=1;
        for(int i=n; i>0; i--){
            result=result*i;
        }

        viewResultado.setText("El factorial de: " + n +" es: "+ String.valueOf(result));
    }
}
