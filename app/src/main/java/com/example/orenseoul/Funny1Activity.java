package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Funny1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny1);

        Button funny1_place = findViewById(R.id.funny1_place);
        funny1_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?eText=%ED%98%9C%EC%84%B1%EB%AF%B8%EC%9A%A9%EC%8B%A4&elng=8dc320dca837e5ad48c3cc4988cb0ad3&eelat=&elat=7e0629e930e1ad3ca303cabe770aae5f&eelng="));
                startActivity(intent);
            }
        });
    }
}
