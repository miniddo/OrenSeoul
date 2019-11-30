package com.example.orenseoul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);

        Toast.makeText(getApplicationContext(), "가게를 클릭해보세요", Toast.LENGTH_LONG).show();

        Button life1_click = findViewById(R.id.life1_click);
        life1_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Life1Activity.class);
                startActivity(intent);
            }
        });

        Button life2_click = findViewById(R.id.life2_click);
        life2_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Life2Activity.class);
                startActivity(intent2);
            }
        });

        Button life3_click = findViewById(R.id.life3_click);
        life3_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), Life3Activity.class);
                startActivity(intent3);
            }
        });
    }
}
