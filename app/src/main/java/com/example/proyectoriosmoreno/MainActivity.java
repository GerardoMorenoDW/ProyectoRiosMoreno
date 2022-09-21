package com.example.proyectoriosmoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cedula;
    Button botonlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cedula = findViewById(R.id.plaincedula);
        botonlogin = findViewById(R.id.buttonlogin);

        botonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cedula.getText().toString().equals("")){

                }else{
                    Toast.makeText(MainActivity.this, "Cedula incorrecta o ya voto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}