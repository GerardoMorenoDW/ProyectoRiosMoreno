package com.example.proyectoriosmoreno;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

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
                boolean flag = false;
                int num = 40;
                for(int i = 0; i < 39; i++) {
                    /** valida que la cedula este en el vector */
                    if (cedula.getText().toString().equals(globales.vectorCedulas[i])) {
                        flag = true;
                        num = i;
                        globales.vectorCedulas[i] = null;

                        break;
                    }

                }
                if (flag){
                    /** al estar la cedula en el vector entra en la actividad */
                    startActivity(new Intent(MainActivity.this, Votacion.class));
                    Toast.makeText(MainActivity.this, ("Bienvenido " + globales.vectorNombres[num]), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Cedula incorrecta o ya voto", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

}