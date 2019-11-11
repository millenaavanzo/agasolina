package com.example.consumodegasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView tResposta = findViewById(R.id.tResposta);

//        //Recuperar os dados que foram enviados pela intent
        Bundle dados = getIntent().getExtras();
        float media = dados.getFloat("Media");

        //Inserindo o Valor na TextView. Necessário converter para String.
        tResposta.setText( String.valueOf("O Consumo de Combustivel é de "+  media +" Litros"));


    }
}
