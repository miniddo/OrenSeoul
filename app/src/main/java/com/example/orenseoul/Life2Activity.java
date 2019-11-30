package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Life2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life2);

        Button life2_place = findViewById(R.id.life2_place);
        life2_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?eText=%EB%AF%B8%EB%8F%84%ED%8C%8C%EA%BD%83%EC%A7%91+%EC%98%81%EB%93%B1%ED%8F%AC%EC%97%AD%EC%A7%80%ED%95%98%EC%87%BC%ED%95%91%EC%84%BC%ED%84%B0%EC%A0%90&eType=SITE_1&edid=31315188&elng=b382a93402b7079012d00fe7b9c29b6a&elat=5bc5842cb4ca0d24a07d94ae96b7dbb6"));
                startActivity(intent);
            }
        });
    }
}
