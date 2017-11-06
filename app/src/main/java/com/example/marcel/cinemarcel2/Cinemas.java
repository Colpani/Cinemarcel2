package com.example.marcel.cinemarcel2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Cinemas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);


        ImageView addImg = (ImageView) findViewById(R.id.emCartazCinesystem);
        addImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent startIntentFilmesCinesystem = new Intent(getApplicationContext(),FilmesCinesystem.class);
                startActivity(startIntentFilmesCinesystem);
            }
        });

        ImageView addImg2 = (ImageView) findViewById(R.id.emCartazCinemark);
        addImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                Intent startIntentFilmesCinemark = new Intent(getApplicationContext(),FilmesCinemark.class);
                startActivity(startIntentFilmesCinemark);
            }
        });


        ImageView addImg3 = (ImageView) findViewById(R.id.emCartazParadigma);
        addImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                Intent startIntentFilmesParadigma = new Intent(getApplicationContext(),FilmesParadigma.class);
                startActivity(startIntentFilmesParadigma);
            }
        });
        /*Button addBtn2 = (Button) findViewById(R.id.emCartazCinesystem);
        addBtn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v2) {
                Intent startIntent = new Intent(getApplicationContext(),FilmesCinesystem.class);
                startActivity(startIntent);
            }
        });*/





    }
}
