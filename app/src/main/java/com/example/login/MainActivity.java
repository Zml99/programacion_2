package com.example.login;

import android.app.admin.DevicePolicyManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

public Button btnreset;
public EditText txtuser;
public EditText editText4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtuser.setText("");
                editText4.setText("");
            }
        });

        //Button btnlog = findViewById(R.id.btnlog);
        //Ingresar.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  String matricula = ((EditText) findViewById(R.id.txtuser)).getText().toString();
                //String clave = ((EditText) findViewById(R.id.editText4)).getText().toString();
                //if (matricula.equals("17-0951") && clave.equals("prueba809")) {

                  //  Intent nuevoform = new Intent(MainActivity.this, SecondActivity.class);
                    //startActivity(nuevoform);
               // } else {
               //     Toast.makeText(getApplicationContext(), "Matricula o Clave Incorrecto", Toast.LENGTH_SHORT).show();
               // }
           // }
        //});


    }


}
