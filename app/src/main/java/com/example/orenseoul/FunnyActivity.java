package com.example.orenseoul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FunnyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny);

        Toast.makeText(getApplicationContext(), "가게를 클릭해보세요", Toast.LENGTH_LONG).show();

        Button funny1_click = findViewById(R.id.funny1_click);
        funny1_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Funny1Activity.class);
                startActivity(intent);
            }
        });

        Button funny2_click = findViewById(R.id.funny2_click);
        funny2_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Funny2Activity.class);
                startActivity(intent2);
            }
        });

        Button funny3_click = findViewById(R.id.funny3_click);
        funny3_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), Funny3Activity.class);
                startActivity(intent3);
            }
        });


    }
}
