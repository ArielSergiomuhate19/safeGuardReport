package com.example.safeguard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela_Registo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_registo);
    }

    public void menu(View view) {
        Intent intent = new Intent(Tela_Registo.this,MainActivity.class);
        startActivity(intent);
    }
}