package com.mati.nowaapka;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Przycisk1, Przycisk2, Przycisk3, Przycisk4;
    TextView Tekst1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tekst1 = (TextView) findViewById(R.id.textView);
        Tekst1.setText("ZSE mym nalogiem");
        Tekst1.setTextColor(Color.BLACK);

        Przycisk1 = (Button) findViewById(R.id.scena1);
        Przycisk2 = (Button) findViewById(R.id.scena2);
        Przycisk3 = (Button) findViewById(R.id.scena3);
        Przycisk4 = (Button) findViewById(R.id.scena4);

        Przycisk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), scena1.class);
                startActivity(i);

            }
        });

        Przycisk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), scena2.class);
                startActivity(i);

            }
        });
        Przycisk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), scena3.class);
                startActivity(i);

            }
        });
        Przycisk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), scena4.class);
                startActivity(i);

            }
        });
    }
}
