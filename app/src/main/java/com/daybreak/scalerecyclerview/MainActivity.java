package com.daybreak.scalerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private LottieAnimationView animation_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animation_view = (LottieAnimationView) findViewById(R.id.animation_view);
        animation_view.setAnimation("CheckSwitch.json");
        animation_view.loop(true);
    }
}
