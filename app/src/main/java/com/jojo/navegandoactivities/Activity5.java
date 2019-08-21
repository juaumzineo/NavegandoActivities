package com.jojo.navegandoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {
    public Button start;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_5);
        start = findViewById(R.id.inicio4);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
