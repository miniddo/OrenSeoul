
package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cafe1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe1);

        Button cafe1_place = findViewById(R.id.cafe1_place);
        cafe1_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?eText=%EC%83%81%EC%A7%84%EB%8B%A4%EB%B0%A9&elng=ae1466ffdc0aeeef00fc4fd28d9a8145&eelat=43ff2e50236111af0b397d3cdfcbcdb2&elat=db714b50c6b0ffd8163b8689cd67c63f&eelng=9615acbf091fc84d9f048839fbc956f1"));
                startActivity(intent);
            }
        });
    }
}
