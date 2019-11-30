package com.example.orenseoul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CafeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        Toast.makeText(getApplicationContext(), "가게를 클릭해보세요", Toast.LENGTH_LONG).show();

        Button cafe1_click = findViewById(R.id.cafe1_click);
        cafe1_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cafe1Activity.class);
                startActivity(intent);
            }
        });

        Button cafe2_click = findViewById(R.id.cafe2_click);
        cafe2_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Cafe2Activity.class);
                startActivity(intent2);
            }
        });

        Button cafe3_click = findViewById(R.id.cafe3_click);
        cafe3_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), Cafe3Activity.class);
                startActivity(intent3);
            }
        });
    }
}
