package com.example.sumador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.editTextNumber);
        et2=findViewById(R.id.editTextNumber2);
        tv1=findViewById(R.id.textView);
    }

    public void sumar(View view) {

        // Obtenemos los números
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        // Hacemos la suma
        int suma=n1+n2;

        // Establecemos el resultado en el TextView
        tv1.setText(""+suma);
    }
    public void restar(View view) {

        // Obtenemos los números
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        // Hacemos la resta
        int resta=n1-n2;

        // Establecemos el resultado en el TextView
        tv1.setText(""+resta);
    }
    public void multiplicar(View view) {

        // Obtenemos los números
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        // Hacemos la multiplicacion
        int producto=n1*n2;

        // Establecemos el resultado en el TextView
        tv1.setText(""+producto);
    }
    public void dividir(View view) {

        // Obtenemos los números
        double n1=Double.parseDouble(et1.getText().toString());
        double n2=Double.parseDouble(et2.getText().toString());

        // Hacemos la suma
        double cociente=n1/n2;

        // Establecemos el resultado en el TextView
        tv1.setText(""+cociente);
    }
}