package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Ingresar = findViewById(R.id.btnlog);
        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricula = ((EditText) findViewById(R.id.txtuser)).getText().toString();
                String clave = ((EditText) findViewById(R.id.editText4)).getText().toString();
                if (matricula.equals("17-0951") && clave.equals("prueba809")) {

                    Intent nuevoform = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(nuevoform);
                } else {
                    Toast.makeText(getApplicationContext(), "Matricula o Clave Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
