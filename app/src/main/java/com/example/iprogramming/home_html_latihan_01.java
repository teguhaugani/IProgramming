package com.example.iprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class home_html_latihan_01 extends AppCompatActivity {
    RadioGroup radiogroup1,radiogroup2,radiogroup3,radiogroup4,radiogroup5;
    private Button proses;
    private RadioButton value_no1,value_no2,value_no3,value_no4,value_no5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_html_latihan01);
        radiogroup1 = findViewById(R.id.radiogroup1);
        radiogroup2 = findViewById(R.id.radiogroup2);
        radiogroup3 = findViewById(R.id.radiogroup3);
        radiogroup4 = findViewById(R.id.radiogroup4);
        radiogroup5 = findViewById(R.id.radiogroup5);

        proses = findViewById(R.id.button_proses);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pointa = radiogroup1.getCheckedRadioButtonId();
                value_no1 = (RadioButton) findViewById(pointa);
                int pointb = radiogroup2.getCheckedRadioButtonId();
                value_no2 = (RadioButton) findViewById(pointb);
                int pointc = radiogroup3.getCheckedRadioButtonId();
                value_no3 = (RadioButton) findViewById(pointc);
                int pointd = radiogroup4.getCheckedRadioButtonId();
                value_no4 = (RadioButton) findViewById(pointd);
                int pointe = radiogroup5.getCheckedRadioButtonId();
                value_no5 = (RadioButton) findViewById(pointe);

                int nilai = 0;

                if (value_no1.getText().toString().toLowerCase().equals("hyper text markup laguage")){
                    nilai = nilai + 20 ;
                }
                if (value_no2.getText().toString().toLowerCase().equals("tim bernes lee")){
                    nilai = nilai + 20 ;
                }
                if (value_no3.getText().toString().toLowerCase().equals("android studio")){
                    nilai = nilai + 20 ;
                }
                if (value_no4.getText().toString().toLowerCase().equals("hello.html")){
                    nilai = nilai + 20 ;
                }
                if (value_no5.getText().toString().toLowerCase().equals("title")){
                    nilai = nilai + 20 ;
                }

                Intent i = new Intent(home_html_latihan_01.this, home_html_latihan_01_nilai.class);
                i.putExtra("nilai",nilai);
                startActivity(i);
                finish();
            }
        });
    }

    public void homehtmllatihanhome(View view){
        Intent intent = new Intent(home_html_latihan_01.this, Home.class);
        startActivity(intent);
    }

    public void homehtmllatihankembali(View view){
        Intent intent = new Intent(home_html_latihan_01.this, home_html_latihan.class);
        startActivity(intent);
    }
}