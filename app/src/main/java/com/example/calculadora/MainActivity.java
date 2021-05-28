package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1,numero2;
    TextView resultado;
    Button boton;
    Spinner operaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1= findViewById(R.id.numero1);
        numero2= findViewById(R.id.numero2);
        resultado= findViewById(R.id.resultado);
        boton=findViewById(R.id.boton);
        operaciones=findViewById(R.id.spoperacion);

        




    }
}