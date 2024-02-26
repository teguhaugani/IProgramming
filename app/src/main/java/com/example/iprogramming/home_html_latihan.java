package com.example.iprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class home_html_latihan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_html_latihan);
    }



    public void latihan01(View view){
        Intent intent = new Intent(home_html_latihan.this, home_html_latihan_01.class);
        startActivity(intent);
    }
    public void latihan(View view){
        Toast.makeText(getApplicationContext(), "Maaf Data Lagi Proses",Toast.LENGTH_SHORT).show();
    }
    public void homehtmllatihankehome(View view){
        Intent intent = new Intent(home_html_latihan.this, Home.class);
        startActivity(intent);
    }
    public void homehtmllatihankekembali(View view){
        Intent intent = new Intent(home_html_latihan.this, home_html.class);
        startActivity(intent);
    }
}