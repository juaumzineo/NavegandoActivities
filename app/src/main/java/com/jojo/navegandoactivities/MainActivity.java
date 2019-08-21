package com.jojo.navegandoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btntela1;
    public Button btntela2;
    public Button btntela3;
    public Button btntela4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btntela1 = findViewById(R.id.btn1);
        btntela2 = findViewById(R.id.btn2);
        btntela3 = findViewById(R.id.btn3);
        btntela4 = findViewById(R.id.btn4);
        btntela1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Activity2.class);
                startActivity(intent);
            }
        });
        btntela2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Activity3.class);
                startActivity(intent);
            }
        });
        btntela3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Activity4.class);
                startActivity(intent);
            }
        });
        btntela4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Activity5.class);
                startActivity(intent);
            }
        });
    }
}
