package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Life3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life3);

        Button life3_place = findViewById(R.id.life3_place);
        life3_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?eText=%EC%84%A4%ED%99%94%EC%B2%A0%EB%AC%BC&elng=0b9c420d61ac252bedf657f10d1f9ab9&eelat=240e223b0b6ffe4fec0f9ca1511c54fe&elat=c851bd54c52a23ce26d9fca1b041963d&eelng=ae09d50a36168b8a7388f621bc431e2b"));
                startActivity(intent);
            }
        });
    }
}
