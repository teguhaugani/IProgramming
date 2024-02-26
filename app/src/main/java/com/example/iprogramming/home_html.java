package com.example.iprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home_html extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_html);
    }

    public void homehtmlhome(View view){
        Intent intent = new Intent(home_html.this, Home.class);
        startActivity(intent);
    }

    public void homehtmlmateri(View view){
        Intent intent = new Intent(home_html.this, home_html_materi.class);
        startActivity(intent);
    }

    public void homehtmllatihan(View view){
        Intent intent = new Intent(home_html.this, home_html_latihan.class);
        startActivity(intent);
    }

    public void homehtmlvideo(View view){
        Intent intent = new Intent(home_html.this, home_html_video.class);
        startActivity(intent);
    }


}