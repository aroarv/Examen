package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Resultado extends AppCompatActivity{
    private TextView labelResultado;
    private Button botonRegresar;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        labelResultado = (TextView) findViewById(R.id.labelResultado);
        botonRegresar=(Button)findViewById(R.id.botonRegresar);
        PantallaPrincipal us= new PantallaPrincipal();
        us.Hipotenusa();
        labelResultado.setText("La longitud de la hipotenusa de un triángulo cuyos lados miden "
                //+ a
                + " y "
                //+b
                +" centímetros es "
                //+r
                +"centímetros.");

        //boton para volver al inicio
        botonRegresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Volvemos a la pagina principal
                Toast.makeText(Resultado.this,"Volviendo al inicio",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), PantallaPrincipal.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
