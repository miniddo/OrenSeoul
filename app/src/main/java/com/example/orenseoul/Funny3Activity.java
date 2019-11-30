package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Funny3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny3);

        Button funny3_place = findViewById(R.id.funny3_place);
        funny3_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?eText=%EB%A7%A8%ED%88%AC%EB%A7%A8+%EC%96%91%EB%B3%B5%EC%A0%90&eType=SITE_1&edid=20642494&elng=1d13a69dd17f60f49781d7027c4636a6&elat=8f5af4ac80b0f96c968b1ff89e649cbc"));
                startActivity(intent);
            }
        });
    }
}
