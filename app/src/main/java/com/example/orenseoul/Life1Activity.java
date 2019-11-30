package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Life1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life1);

        Button life1_place = findViewById(R.id.life1_place);
        life1_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?query=%EC%84%9C%EC%9A%B8%EC%8B%9C+%EA%B8%88%EC%B2%9C%EA%B5%AC+%EB%8F%85%EC%82%B0%EB%A1%9C+40%EA%B8%B8+27-5"));
                startActivity(intent);
            }
        });

    }
}
