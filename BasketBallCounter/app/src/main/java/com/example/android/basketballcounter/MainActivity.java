package com.example.android.basketballcounter;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RotateAnimation rotate = new RotateAnimation(0, 1000, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(5000);
        rotate.setInterpolator(new LinearInterpolator());

        ImageView image = (ImageView) findViewById(R.id.basketball_logo);

        image.startAnimation(rotate);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent redirect_to_second_screen = new Intent(MainActivity.this, second_screen.class);
                startActivity(redirect_to_second_screen);
                finish();


            }
        }, 2000);   //2 seconds
    }
}
