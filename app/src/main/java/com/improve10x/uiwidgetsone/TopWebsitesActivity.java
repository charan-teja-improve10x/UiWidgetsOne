package com.improve10x.uiwidgetsone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;
import android.widget.Button;

public class TopWebsitesActivity extends AppCompatActivity {
    Button googleBtn;
    WebView myWebsite;
    Button faceBookBtn;
    Button youTubeBtn;
    Button improveBtn;
    Button instaBtn;
    Button amazonBtn;
    Button flipcartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_websites);
        initComponants();
        handelGoogleBtn();
        handleFacebookBtn();
        handleYouTube();
        handleImproveBtn();
        handleInstBtn();
        handleAmazonBtn();
        handleFlipkartBtn();
    }

    private void initComponants() {
        googleBtn = findViewById(R.id.google_btn);
        myWebsite = findViewById(R.id.website_wv);
        faceBookBtn = findViewById(R.id.facebook_btn);
        youTubeBtn = findViewById(R.id.yoytube_btn);
        improveBtn = findViewById(R.id.improve_btn);
        instaBtn = findViewById(R.id.insta_btn);
        amazonBtn = findViewById(R.id.amazon_btn);
        flipcartBtn = findViewById(R.id.flipcart_btn);
    }

    private void handelGoogleBtn() {
        googleBtn.setOnClickListener(v -> {
           myWebsite.loadUrl("https://www.google.co.in");
        });
    }

    private void handleYouTube() {
      youTubeBtn.setOnClickListener(v -> {
          myWebsite.loadUrl("https://www.youtube.com/");
      });
    }

    private void handleFacebookBtn() {
      faceBookBtn.setOnClickListener(v -> {
          myWebsite.loadUrl("https://www.facebook.com/");
      });
    }

    private void handleImproveBtn() {
        improveBtn.setOnClickListener(v -> {
            myWebsite.loadUrl("https://improve10x.com/");
        });
    }
    private void handleInstBtn(){
       instaBtn.setOnClickListener(v -> {
           myWebsite.loadUrl("https://www.instagram.com");
       });
    }
   private void handleAmazonBtn(){
      amazonBtn.setOnClickListener(v -> {
          myWebsite.loadUrl("https://www.amazon.in/home/main-page");
      });
   }
    private void handleFlipkartBtn() {
        flipcartBtn.setOnClickListener(v -> {
            myWebsite.loadUrl("http://www.flipkart.com/flipkart/online shopping\n");
        });
    }
}