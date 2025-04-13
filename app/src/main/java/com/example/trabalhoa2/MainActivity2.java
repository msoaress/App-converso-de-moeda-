package com.example.trabalhoa2;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {


    TextView tv_1;
    EditText nome, valor;
    Button dolar,euro,libra,tela_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tv_1 = findViewById(R.id.tv_1);
        nome = findViewById(R.id.nome);
        valor = findViewById(R.id.valor);
        dolar = findViewById(R.id.dolar);
        euro = findViewById(R.id.euro);
        libra = findViewById(R.id.libra);
        tela_1 = findViewById(R.id.tela_1);



        dolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double N1 =   Double.parseDouble(valor.getText().toString());
                tv_1.setText(" ");
                int resultado = (int) (N1 * 5.0642);
                String nomeDigitado = nome.getText().toString();
                tv_1.setText("Prezado(a): "+nomeDigitado + " se você tiver um salario de "+N1+
                        " dolar você vai receber "+resultado+" reais por mês");


            }
        });


        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double N1 =   Double.parseDouble(valor.getText().toString());
                tv_1.setText(" ");
                int resultado = (int) (N1 * 5.3087);
                String nomeDigitado = nome.getText().toString();
                tv_1.setText("Prezado(a): "+nomeDigitado + " se você tiver um salario de "+N1+
                        " euros você vai receber "+resultado+" reais por mês");
            }
        });

        libra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double N1 =   Double.parseDouble(valor.getText().toString());
                tv_1.setText(" ");
                int resultado = (int) (N1 * 6.11);
                String nomeDigitado = nome.getText().toString();
                tv_1.setText("Prezado(a): "+nomeDigitado + " se você tiver um salario de "+N1+
                        " libra você vai receber "+resultado+" reais por mês");            }
        });


        tela_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),MainActivity.class);
                startActivity(intent);
            }
        });

    }

}

