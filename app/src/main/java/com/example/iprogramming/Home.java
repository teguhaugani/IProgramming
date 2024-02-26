package com.example.iprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void homehtml(View view){
        Intent intent = new Intent(Home.this, home_html.class);
        startActivity(intent);
    }

    public void hamokosong(View Vie){
        Toast.makeText(getApplicationContext(), "Maaf Data Lagi Proses",Toast.LENGTH_SHORT).show();
    }

    public void hamokeluar(View view){
        Intent intent = new Intent(Home.this, login.class);
        startActivity(intent);
    }
}