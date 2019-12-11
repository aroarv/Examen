package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class PantallaPrincipal extends AppCompatActivity {
    private Button botonCalcular;
    private static EditText textBoxLado1;
    private static EditText textBoxLado2;

    //private static Double n1, n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonCalcular = (Button) findViewById(R.id.botonCalcular);
        textBoxLado1 = (EditText) findViewById(R.id.textBoxLado2);
        textBoxLado2 = (EditText) findViewById(R.id.textBoxLado2);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(PantallaPrincipal.this, "Calculando", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(v.getContext(), Resultado.class);
                startActivity(intent2);
                Toast.makeText(PantallaPrincipal.this, "Hipotenusa: ", Toast.LENGTH_SHORT).show();
            }
        });
        Hipotenusa();
    }
    public void Hipotenusa() {
        //Calculos hipotenusa
        //Primer modo
        //Double r1 = Math.sqrt(Math.pow(Double.parseDouble(textBoxLado1.getText().toString()),2)+Math.pow(Double.parseDouble(textBoxLado2.getText().toString()),2));

        //Segundo modo
        /*n1=Double.parseDouble(textBoxLado1.getText().toString());
        n2=Double.parseDouble(textBoxLado2.getText().toString());
        double r = Math.sqrt(Math.pow(n1,2)+Math.pow(n2,2));*/
    }
}