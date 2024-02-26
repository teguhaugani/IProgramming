package com.example.iprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

import com.github.barteksc.pdfviewer.PDFView;

public class home_html_materi_01 extends AppCompatActivity {

    //kode audio
    MediaPlayer audio;
    //akhir audio

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_html_materi01);

        //kode pdf
        PDFView pdfView = findViewById(R.id.pdfok);
        pdfView.fromAsset("Materi_HTML_01.pdf")
                .enableSwipe(true)
                .enableDoubletap(true)
                .load();
        //akhiran pdf

        //kode audio
        audio = MediaPlayer.create(this, R.raw.materihtml01);
        audio.setLooping(true);
        audio.setVolume(1,1);
        audio.start();
        //akhir audio

    }

    //kode audio
    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();

        if (on){
            audio.setVolume(0,0);
        }else {
            audio.setVolume(1,1);
        }
    }
    public void onBackPressed(){
        audio.stop();
        home_html_materi_01.this.finish();
    }
    //akhir audio

    public void homehtmlmaterihome(View view){
        Intent intent = new Intent(home_html_materi_01.this, Home.class);
        startActivity(intent);
    }

    public void homehtmlmaterikembali(View view){
        Intent intent = new Intent(home_html_materi_01.this, home_html_materi.class);
        startActivity(intent);
    }

}