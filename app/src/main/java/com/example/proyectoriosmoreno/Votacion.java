package com.example.proyectoriosmoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class Votacion extends AppCompatActivity {
    RadioGroup  radioGroup;
    Button botonVoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votacion);

        radioGroup = findViewById(R.id.radiogroup);
        botonVoto = findViewById(R.id.votar);

        botonVoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int checkedId = radioGroup.getCheckedRadioButtonId();
                Intent intent =new Intent(Votacion.this, Resultados.class);
                if (checkedId == -1) {
                    Toast.makeText(Votacion.this, "No hay seleccion.", Toast.LENGTH_SHORT).show();
                }else{
                    findRadioButton(checkedId);
                    startActivity(intent);
                }

            }
            });


    }
    private void findRadioButton(int checkedId) {
        switch (checkedId) {
            case R.id.rb1:
                globales.candidato1 = globales.candidato1 + 1;
                break;
            case R.id.rb2:
                globales.candidato2 = globales.candidato2 + 1;
                break;
            case R.id.rb3:
                globales.candidato3 = globales.candidato3 + 1;
                break;

        }
    }
}