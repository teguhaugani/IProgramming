package com.example.iprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home_html_latihan_01_nilai extends AppCompatActivity {
    TextView txt_nilai,txt_coment;
    Button cobalagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_html_latihan01_nilai);

        txt_nilai = findViewById(R.id.txt_nilai);
        txt_coment = findViewById(R.id.txt_coment);
        cobalagi = findViewById(R.id.btn_cobalagi);

        int nilai = getIntent().getExtras().getInt("nilai");
        txt_nilai.setText(String.valueOf(nilai));

        if (nilai >= 80){
            txt_coment.setText("Nilai anda Sangat Baik :)");
        }else if (nilai >= 60){
            txt_coment.setText("Nilai anda Baik");
        }else {
            txt_coment.setText("Semangat Lagi Belajar");
        }

        cobalagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home_html_latihan_01_nilai.this, home_html_latihan_01.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void homelatihanhtmlnilaihome(View view){
        Intent intent = new Intent(home_html_latihan_01_nilai.this, Home.class);
        startActivity(intent);
    }

    public void homelatihanhtmlnilaikembali(View view){
        Intent intent = new Intent(home_html_latihan_01_nilai.this, home_html_latihan.class);
        startActivity(intent);
    }
}