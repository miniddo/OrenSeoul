package com.example.orenseoul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Toast.makeText(getApplicationContext(), "가게를 클릭해보세요", Toast.LENGTH_LONG).show();


        Button food1_click = findViewById(R.id.food1_click);
        food1_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(getApplicationContext(), Food1Activity.class);
                startActivity(intent2);
            }
        });

        Button food2_click = findViewById(R.id.food2_click);
        food2_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent(getApplicationContext(), Food2Activity.class);
                startActivity(intent3);
            }
        });

        Button food3_click = findViewById(R.id.food3_click);
        food3_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent4 = new Intent(getApplicationContext(), Food3Activity.class);
                startActivity(intent4);
            }
        });
    }
}
