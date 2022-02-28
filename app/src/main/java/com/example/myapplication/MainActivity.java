package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText peso,altura;
    private Button calcular,reset;
    private TextView resultado,descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.caja1);
        altura = findViewById(R.id.caja2);
        calcular = findViewById(R.id.btncalcular);
        reset = findViewById(R.id.btncerrar);

        resultado= findViewById(R.id.ver);
        descripcion = findViewById(R.id.btn1);


    }
    public  void  operar(View view)
    {
        double npeso= Double.parseDouble(peso.getText().toString());
        double naltura= Double.parseDouble(altura.getText().toString());

        double resultadoc= npeso/(naltura*naltura);

        resultado.setText(""+ String.format("%.2f",resultadoc));
        if(resultadoc<18.5)
            descripcion.setText("bajo peso");
        else
        if(resultadoc>=18.5 &&  resultadoc<=24.9)
            descripcion.setText("bajo Normal");
        else
        if(resultadoc>=25 && resultadoc<=29.9)
            descripcion.setText("sobre peso");


    }
    public void  borrar(View view){
        peso.setText("");
        altura.setText("");
        descripcion.setText("");
        resultado.setText("");

    }
}