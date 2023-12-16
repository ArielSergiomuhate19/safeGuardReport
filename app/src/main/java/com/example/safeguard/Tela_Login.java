package com.example.safeguard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
    }

    public void main(View view) {
        Intent intent = new Intent(Tela_Login.this,MainActivity.class);
        startActivity(intent);
    }

    public void registro(View view) {
        Intent intent = new Intent(Tela_Login.this,Tela_Registo.class);
        startActivity(intent);
    }
}