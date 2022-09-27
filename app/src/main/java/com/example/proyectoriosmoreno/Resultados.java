package com.example.proyectoriosmoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Resultados extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    Button salir;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        tv1 = findViewById(R.id.votosc1);
        tv2 = findViewById(R.id.votosc2);
        tv3 = findViewById(R.id.votosc3);
        tv4 = findViewById(R.id.votosc4);

        salir = findViewById(R.id.botonsalir);

        tv1.setText("Votos: " + globales.candidato1);
        tv2.setText("Votos: " + globales.candidato2);
        tv3.setText("Votos: " + globales.candidato3);
        tv4.setText("Votos en blanco: " + globales.candidato4);


        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Resultados.this, MainActivity.class);
                startActivity(intent);
            }
    });
}
}