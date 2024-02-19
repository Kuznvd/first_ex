package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button goToWebsiteButton = findViewById(R.id.goToWebsiteButton);

            goToWebsiteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String websiteUrl = "https://www.mirea.ru/";

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));

                    startActivity(intent);
                }
            });
        }
    }
