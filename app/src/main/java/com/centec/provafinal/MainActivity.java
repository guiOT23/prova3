package com.centec.provafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float gasolina01;
    float etanol;

    float x;

    EditText edGasolina01, edEtanol;


    TextView tvResultado;

    Button btVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edGasolina01 = (EditText) findViewById(R.id.edGasolina01);
        edEtanol = (EditText) findViewById(R.id.edEtanol);
        btVerificar = (Button) findViewById(R.id.btVerificar);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        btVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btVerificar) {
                gasolina01 = Float.parseFloat(edGasolina01.getText().toString());
                etanol = Float.parseFloat(edEtanol.getText().toString());

                x = etanol / gasolina01;
                if (x <= 0.7){
                    tvResultado.setText("Melhor opção ETANOL");
                }else {
                    tvResultado.setText("Melhor opção Gasolina");
                }


            }
        });

    }
}