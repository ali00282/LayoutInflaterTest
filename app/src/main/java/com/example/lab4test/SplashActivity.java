package com.example.lab4test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import static android.view.animation.AnimationUtils.loadAnimation;

public class SplashActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        getSupportActionBar().hide();
//        iv = (ImageView) findViewById(R.id.splashAndroidPic);
//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splash_anim);
//        iv.setAnimation(animation);

        Thread td = new Thread() {


            public void run() {

                try {
                    iv = (ImageView) findViewById(R.id.splashAndroidPic);
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splash_anim);
                    iv.setAnimation(animation);

                    sleep(3000);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent it = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(it);
                }
            }
        };td.start();
    }}

//        animation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//
//                finish();
//
//                Intent it = new Intent(getApplicationContext(), MainActivity.class);
//                startActivityForResult(it, 345);
//
////                startActivity(new Intent(SplashActivity.this, MainActivity.class));
//            }

//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });




