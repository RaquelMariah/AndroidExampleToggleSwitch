package com.ramaria.androidexampletoggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    public ToggleButton toggleSenha;
    public Switch switchSenha;
    public TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        textResultado = findViewById(R.id.textResultado);
    }

    public void enviar (View view){
        if(switchSenha.isChecked()){
            textResultado.setText("O switch está ligado!");
        }else{
            textResultado.setText("O switch está desligado!");
        }
    }

}
