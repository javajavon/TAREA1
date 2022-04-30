package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ACTIVITY2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea12);
    }

    public void IrAnterior(View view) {
        Intent intent2 = new Intent(this, ACTIVITY1.class);
        startActivity(intent2);
    }
}