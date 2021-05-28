package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    EditText numero1,numero2;
    TextView resultado;
    Button boton;
    Spinner operaciones;

    Integer num1;
    Integer num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1= findViewById(R.id.numero1);
        numero2= findViewById(R.id.numero2);
        resultado= findViewById(R.id.resultado);
        boton=findViewById(R.id.boton);
        operaciones=findViewById(R.id.spoperacion);


        ArrayList<String> TipoTur = new ArrayList<>();
        TipoTur.add("+");
        TipoTur.add("-");
        TipoTur.add("*");
        TipoTur.add("/");
        TipoTur.add("sqrt");
        operaciones.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, TipoTur));

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                switch(operaciones.getSelectedItemPosition()) {
                    // declaración case
                    // los valores deben ser del mismo tipo de la expresión
                    case 0:
                        // Declaraciones
                        Toast.makeText(MainActivity.this, "Suma", Toast.LENGTH_LONG).show();
                        num1 = Integer.valueOf(numero1.getText().toString());
                        num2 = Integer.valueOf(numero2.getText().toString());
                        resultado.setText(String.valueOf(num1+num2));

                        break; // break es opcional
                    case 1:
                        // Declaraciones
                        Toast.makeText(MainActivity.this, "Resta", Toast.LENGTH_LONG).show();
                        num1 = Integer.valueOf(numero1.getText().toString());
                        num2 = Integer.valueOf(numero2.getText().toString());
                        resultado.setText(String.valueOf(num1-num2));

                        break; // break es opcional
                    case 2:
                        // Declaraciones
                        Toast.makeText(MainActivity.this, "Multiplicacion", Toast.LENGTH_LONG).show();
                        num1 = Integer.valueOf(numero1.getText().toString());
                        num2 = Integer.valueOf(numero2.getText().toString());
                        resultado.setText(String.valueOf(num1*num2));
                        break; // break es opcional
                    case 3:
                        // Declaraciones
                        Toast.makeText(MainActivity.this, "Divicion", Toast.LENGTH_LONG).show();
                        num1 = Integer.valueOf(numero1.getText().toString());
                        num2 = Integer.valueOf(numero2.getText().toString());
                        resultado.setText(String.valueOf(num1/num2));
                        break; // break es opcional
                    case 4:
                        // Declaraciones
                        Toast.makeText(MainActivity.this, "Raiz", Toast.LENGTH_LONG).show();
                        num1 = Integer.valueOf(numero1.getText().toString());
                        double x = 1.0;
                        
                        int k;

                        for(k = 1; k < 10; k++){
                            x = (x + num1/x) / 2;
                        }

                        resultado.setText(String.valueOf(x));

                        break; // break es opcional
                }




            }
        });






    }
}