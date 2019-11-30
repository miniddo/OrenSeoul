package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cafe2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe2);

        Button cafe2_place = findViewById(R.id.cafe2_place);
        cafe2_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?eText=%ED%84%B0%EB%B0%A9%EB%82%B4&elng=16c9ceaccfbb849f8e65fd2f796c6690&eelat=&elat=f4aee91a499cd69b3682edd0dd28cac0&eelng="));
                startActivity(intent);
            }
        });
    }
}
