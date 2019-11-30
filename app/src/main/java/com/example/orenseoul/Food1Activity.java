package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Food1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food1);

        Toast.makeText(getApplicationContext(), "지도를 클릭하시오(링크 연결)", Toast.LENGTH_LONG).show();

        Button food1_place = findViewById(R.id.food1_place);
        food1_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?eText=%EA%B3%B5%ED%95%AD%EC%B9%BC%EA%B5%AD%EC%88%98&elng=56fa37a84512e7ed7df3d132d0f9c017&eelat=&elat=18d80119e0d359278c85517d0c75e906&eelng="));
                startActivity(intent);
            }
        });
    }
}
