package com.example.login;

<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4262e1348c3ed4d8819742068a5b30c58fb94753
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD

=======
>>>>>>> origin/master
>>>>>>> 4262e1348c3ed4d8819742068a5b30c58fb94753

public class MainActivity extends AppCompatActivity {

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
>>>>>>> 4262e1348c3ed4d8819742068a5b30c58fb94753
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
<<<<<<< HEAD

=======
=======
>>>>>>> Log-In Desing
=======
>>>>>>> origin/master
>>>>>>> 4262e1348c3ed4d8819742068a5b30c58fb94753
    }
}
