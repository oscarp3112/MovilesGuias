package com.example.guia4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText nombre, horas;
     Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText)findViewById(R.id.txtNombre);
        horas=(EditText)findViewById(R.id.txtHora);
    }

    public void segundaActividad (View v) {
        double sneto = Double.parseDouble(horas.getText().toString())*8.5;
        double isss= sneto *0.02;
        double afp = sneto *0.03;
        double renta = sneto*0.04;
        double total = sneto -isss - afp - renta;

        Intent i=new Intent(this, segundaActividad.class);
        i.putExtra("nombre", nombre.getText().toString());
        i.putExtra("sneto", String.valueOf(sneto));
        i.putExtra("isss", String.valueOf(isss));
        i.putExtra("afp", String.valueOf(afp));
        i.putExtra("renta", String.valueOf(renta));
        i.putExtra("total", String.valueOf(total));

        startActivity(i);
    }

}
