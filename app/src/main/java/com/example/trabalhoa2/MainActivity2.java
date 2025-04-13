package com.example.trabalhoa2;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.text.DecimalFormat;
import android.widget.Toast;

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
                try {


                    Double N1 = Double.parseDouble(valor.getText().toString());
                    tv_1.setText(" ");


                    double resultado = N1 * 5.0642;

                    DecimalFormat decimalFormat = new DecimalFormat("R$ #,###.00");
                    String resultadoFormatado = decimalFormat.format(resultado);

                    String nomeDigitado = nome.getText().toString();



                    tv_1.setText("Prezado(a): " + nomeDigitado + " se você tiver um salario de " + N1 +
                            " dólares você vai receber " + resultadoFormatado + " reais por mês");

                } catch (Exception e) {
                    tv_1.setText("Insira valores corretos!");
                }



            }
        });


        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {



                Double N1 =   Double.parseDouble(valor.getText().toString());
                tv_1.setText(" ");
                double resultado = N1 * 5.3087;

                DecimalFormat decimalFormat = new DecimalFormat("R$ #,###.00");
                String resultadoFormatado = decimalFormat.format(resultado);

                String nomeDigitado = nome.getText().toString();
                tv_1.setText("Prezado(a): "+nomeDigitado + " se você tiver um salario de "+N1+
                        " euros você vai receber "+resultadoFormatado+" reais por mês");





            }catch (Exception e) {
                    tv_1.setText("Insira valores corretos!");
                }

        }




        });

        libra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {



                Double N1 =   Double.parseDouble(valor.getText().toString());
                tv_1.setText(" ");
                double resultado = N1 * 6.1187;

                DecimalFormat decimalFormat = new DecimalFormat("R$ #,###.00");
                String resultadoFormatado = decimalFormat.format(resultado);

                String nomeDigitado = nome.getText().toString();
                tv_1.setText("Prezado(a): "+nomeDigitado + " se você tiver um salario de "+N1+
                        " libras você vai receber "+resultadoFormatado+" reais por mês");

                }catch (Exception e) {
                    tv_1.setText("Insira valores corretos!");
                }

            }
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

