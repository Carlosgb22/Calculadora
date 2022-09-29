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

    /**
     * Metodo que realiza la suma de los dos numeros
     * @param view
     */
    public void sumar(View view) {
        int n1 = 0;
        int n2 = 0;
        //Usamos un bloque try/catch para controlar las excepciones
        try {
            // Obtenemos los números
            n1=Integer.parseInt(et1.getText().toString());
            n2=Integer.parseInt(et2.getText().toString());

            // Hacemos la suma
            int suma=n1+n2;

            // Establecemos el resultado en el TextView
            tv1.setText("El resultado es: " + suma);

        }catch(NullPointerException | NumberFormatException e){
            tv1.setText("Introduce 2 numeros");
        }
    }

    /**
     * Metodo que realiza la resta de los dos numeros
     * @param view
     */
    public void restar(View view) {

        int n1 = 0;
        int n2 = 0;
        //Usamos un bloque try/catch para controlar las excepciones
        try {
            // Obtenemos los números
            n1=Integer.parseInt(et1.getText().toString());
            n2=Integer.parseInt(et2.getText().toString());
            // Hacemos la resta
            int resta=n1-n2;

            // Establecemos el resultado en el TextView
            tv1.setText("El resultado es: " + resta);

        }catch(NullPointerException | NumberFormatException e){
            tv1.setText("Introduce 2 numeros");
        }
    }

    /**
     * Metodo que realiza la multiplicacion de los dos numeros
     * @param view
     */
    public void multiplicar(View view) {

        int n1 = 0;
        int n2 = 0;
        //Usamos un bloque try/catch para controlar las excepciones
        try {
            // Obtenemos los números
            n1=Integer.parseInt(et1.getText().toString());
            n2=Integer.parseInt(et2.getText().toString());
            // Hacemos la multiplicacion
            int producto=n1*n2;

            // Establecemos el resultado en el TextView
            tv1.setText("El resultado es: " + producto);

        }catch(NullPointerException | NumberFormatException e) {
            tv1.setText("Introduce 2 numeros");
        }
    }

    /**
     * Metodo que realiza la division de los dos numeros
     * @param view
     */
    public void dividir(View view) {

        double n1 = 0;
        double n2 = 0;
        //Usamos un bloque try/catch para controlar las excepciones
        try {
            // Obtenemos los números
            n1=Integer.parseInt(et1.getText().toString());
            n2=Integer.parseInt(et2.getText().toString());
            if (n2 == 0){
                tv1.setText("No se puede dividir entre 0");
            }else {
                // Hacemos la division
                double cociente = n1 / n2;

                // Establecemos el resultado en el TextView
                tv1.setText("El resultado es: " + String.format("%.2f", cociente));
            }
        }catch(NullPointerException | NumberFormatException e){
            tv1.setText("Introduce 2 numeros");
        }
    }
}