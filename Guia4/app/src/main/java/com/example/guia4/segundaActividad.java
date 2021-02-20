package com.example.guia4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class segundaActividad extends AppCompatActivity {
    TextView txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        txt1=(TextView) findViewById(R.id.txt1);
        txt2=(TextView) findViewById(R.id.txt2);
        txt3=(TextView) findViewById(R.id.txt3);
        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("nombre");
        String sneto = bundle.getString("sneto");
        String isss = bundle.getString("isss");
        String afp = bundle.getString("afp");
        String renta = bundle.getString("renta");
        String total = bundle.getString("total");

        txt1.setText("Nombre: "+nombre + " Salario neto: " +sneto);
        txt2.setText("Descuentos: iss -"+isss + " afp -"+afp+ " renta -"+renta);
        txt3.setText("Salario resultante: " + total);

    }
}
