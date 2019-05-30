package com.example.login;

<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4f09425859cf472ba5d5ddadaa940ff1250f94a3
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
=======
import android.widget.EditText;
import android.widget.Toast;
=======
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
>>>>>>> Log-In Desing
=======
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
>>>>>>> origin/master
>>>>>>> 4f09425859cf472ba5d5ddadaa940ff1250f94a3

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD

        btn = (Button)findViewById(R.id.btnlog);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(v.getContext(), SecondActivity.class);
                startActivityForResult(intent3, 0);
            }
        });
=======
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> Log-In Desing
=======
>>>>>>> origin/master
>>>>>>> 4f09425859cf472ba5d5ddadaa940ff1250f94a3
    }
}
