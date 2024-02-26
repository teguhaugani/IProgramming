package com.example.iprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class home_html_materi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_html_materi);
    }

    public void materi01(View view){
        Intent intent = new Intent(home_html_materi.this, home_html_materi_01.class);
        startActivity(intent);
    }
    public void materi(View view){
        Toast.makeText(getApplicationContext(), "Maaf Data Lagi Proses",Toast.LENGTH_SHORT).show();
    }
    public void homehtmlmaterikehome(View view){
        Intent intent = new Intent(home_html_materi.this, Home.class);
        startActivity(intent);
    }
    public void homehtmlmaterikekembali(View view){
        Intent intent = new Intent(home_html_materi.this, home_html.class);
        startActivity(intent);
    }
}