
package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Food3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food3);

        Toast.makeText(getApplicationContext(), "지도를 클릭하시오(링크 연결)", Toast.LENGTH_LONG).show();

        Button food3_place = findViewById(R.id.food3_place);
        food3_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?eText=%EB%AF%B8%EB%A6%BC%EB%B6%84%EC%8B%9D&elng=31ecd39c77fe9789bab5fa31926c9183&eelat=&elat=b241d5d397cf1844ebcac78db6cac53c&eelng="));
                startActivity(intent);
            }
        });
    }
}
