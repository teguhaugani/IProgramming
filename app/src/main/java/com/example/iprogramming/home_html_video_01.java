package com.example.iprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class home_html_video_01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_html_video01);

        //kode video
        VideoView video = (VideoView) findViewById(R.id.video);
        MediaController media = new MediaController(this);
        Uri lokasivedio = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videohtml);
        video.setVideoURI(lokasivedio);
        video.setMediaController(media);
        video.start();
        video.requestFocus();
    }

    public void homehtmlvideohome(View view){
        Intent intent = new Intent(home_html_video_01.this, Home.class);
        startActivity(intent);
    }

    public void homehtmlvideokembali(View view){
        Intent intent = new Intent(home_html_video_01.this, home_html_video.class);
        startActivity(intent);
    }
}