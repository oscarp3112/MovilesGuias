package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public EditText NumTxt;
    public Button aumentar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumTxt = (EditText)findViewById(R.id.numberTxt);
        aumentar = (Button)findViewById(R.id.aumentarBtn);

    }
    @Override
    protected void onSaveInstanceState(Bundle estado) {
        super.onSaveInstanceState(estado);
        estado.putString("posicion", NumTxt.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle estado) {
        super.onRestoreInstanceState(estado);
        String cont = estado.getString("posicion");
        NumTxt.setText(cont);
    }


    public void aumento (View v)
    {
        String num = NumTxt.getText().toString();
        int num1 = Integer. parseInt(num);
        num1 = num1 +1;

        if (num1 > 9)
        {
            num1 = 0;
        }
        num = Integer.toString(num1);

        NumTxt.setText(num);
    }
}
