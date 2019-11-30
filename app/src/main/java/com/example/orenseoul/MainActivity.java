package com.example.orenseoul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2, image3, image4, image5;

    int index = 0;
    int index2 = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);

        Button button_right  = findViewById(R.id.button_right);
        button_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                index += 1;
                if (index > 4) {
                    index = 0;
                }

                if (index == 0) {
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                } else if (index == 1) {
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.VISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                } else if (index == 2) {
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.VISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                } else if (index == 3) {
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.VISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                } else if (index == 4) {
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.VISIBLE);
                }
            }
        });

        Button button_left  = findViewById(R.id.button_left);
        button_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                index2 -= 1;
                if (index2 < 0) {
                    index2 = 4;
                }

                if (index2 == 0) {
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                } else if (index2 == 1) {
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.VISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                } else if (index2 == 2) {
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.VISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                } else if (index2 == 3) {
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.VISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                } else if (index2 == 4) {
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.VISIBLE);
                }
            }
        });

        Button button_youtube = findViewById(R.id.button_youtube);
        button_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/seoullive"));
                startActivity(intent);

            }
        });

        Button button_instagram = findViewById(R.id.button_instagram);
        button_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/seoul_official/"));
                startActivity(intent2);

            }
        });

        Button button_blog = findViewById(R.id.button_blog);
        button_blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.seoul.go.kr/"));
                startActivity(intent3);
            }
        });

        Button button_main = findViewById(R.id.button_main);
        button_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent4  = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent4);
            }
        });


    }

}

