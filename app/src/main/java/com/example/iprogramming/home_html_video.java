package com.example.iprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class home_html_video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_html_video);
    }

    public void video01(View view){
        Intent intent = new Intent(home_html_video.this, home_html_video_01.class);
        startActivity(intent);
    }
    public void video(View view){
        Toast.makeText(getApplicationContext(), "Maaf Data Lagi Proses",Toast.LENGTH_SHORT).show();
    }
    public void homehtmlvideokehome(View view){
        Intent intent = new Intent(home_html_video.this, Home.class);
        startActivity(intent);
    }
    public void homehtmlvideokekembali(View view){
        Intent intent = new Intent(home_html_video.this, home_html.class);
        startActivity(intent);
    }
}