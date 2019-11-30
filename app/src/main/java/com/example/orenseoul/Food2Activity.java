package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Food2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food2);

        Toast.makeText(getApplicationContext(), "지도를 클릭하시오(링크 연결)", Toast.LENGTH_LONG).show();

        Button food2_place = findViewById(R.id.food2_place);
        food2_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?eText=%EC%82%BC%EC%9A%B0%EC%B9%98%ED%82%A8&elng=87f19c950c22ecaf79384341665d02d7&eelat=&elat=cc670d64e6dd70ba7014ea7645a8d8ee&eelng="));
                startActivity(intent);
            }
        });
    }
}
