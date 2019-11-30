package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Funny2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny2);

        Button funny2_place = findViewById(R.id.funny2_place);
        funny2_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?query=%EC%8C%8D%EB%A7%88%EC%8A%A4%ED%8A%9C%EB%94%94%EC%98%A4&type=SITE_1&siteOrder="));
                startActivity(intent);
            }
        });
    }
}
