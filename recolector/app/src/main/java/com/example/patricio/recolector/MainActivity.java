package com.example.henry.recolector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Botton btn_guardar;

        btn_guardar =(Botton) findViewById(R.id.btn1);
        btn_guardar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick (View v){
                Intent intent = new Intent
                        (MainActivity.this.listar_datos.class);
                startActivity(intent);
            }
        }
    }
