package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cafe3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe3);

        Button cafe3_place = findViewById(R.id.cafe3_place);
        cafe3_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?query=%EC%84%9C%EC%9A%B8%EC%8B%9C+%EA%B4%80%EC%95%85%EA%B5%AC+%EC%8B%A0%EB%A6%BC%EB%A1%9C+11%EA%B8%B8+20"));
                startActivity(intent);
            }
        });
    }
}
