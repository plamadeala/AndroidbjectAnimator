package com.example.android_objectanimator;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/* proprety you can animate
    -
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View all = findViewById(R.id.XML);

        //cambio della posizione x del bottone
        Button translateX = findViewById(R.id.positionX);
        translateX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animatorALL = ObjectAnimator.ofFloat(all,"translationX",0f,100f,-100f,0f);
                ObjectAnimator animatorthis = ObjectAnimator.ofFloat(v,"translationX",0f,100f,-100f,0f);
                AnimatorSet set = new AnimatorSet();
                set.playTogether(animatorALL,animatorthis);
                set.setDuration(1000);
                set.start();
            }
        });

        //cambio della posizione y del bottone
        Button translateY = findViewById(R.id.positionY);
        translateY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animatorALL = ObjectAnimator.ofFloat(all,"translationY",0f,100f,-100f,0f);
                ObjectAnimator animatorthis = ObjectAnimator.ofFloat(v,"translationY",0f,100f,-100f,0f);
                AnimatorSet set = new AnimatorSet();
                set.playTogether(animatorALL,animatorthis);
                set.setDuration(1000);
                set.start();
            }
        });

        //cambio della rotazione del bottone la rotazione e in gradi
        Button rotation = findViewById(R.id.rotation);
       rotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animatorALL = ObjectAnimator.ofFloat(all,"rotation",0f,360f,-360f,0f);
                ObjectAnimator animatorthis = ObjectAnimator.ofFloat(v,"rotation",0f,360f,-360f,0f);
                AnimatorSet set = new AnimatorSet();
                set.playTogether(animatorALL,animatorthis);
                set.setDuration(5000);
                set.start();
            }
        });

       //cambio dell' aktezza del bottone
        Button scaleX = findViewById(R.id.scaleX);
        scaleX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animatorALL = ObjectAnimator.ofFloat(all,"scaleX",1f,2f,0f,1f);
                ObjectAnimator animatorthis = ObjectAnimator.ofFloat(v,"scaleX",1f,2f,0f,1f);
                AnimatorSet set = new AnimatorSet();
                set.playTogether(animatorALL,animatorthis);
                set.setDuration(1000);
                set.start();
            }
        });

        //cambio della larghezza del bottone
        Button scaleY = findViewById(R.id.scaleY);
        scaleY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animatorALL = ObjectAnimator.ofFloat(all,"scaleY",1f,2f,0f,1f);
                ObjectAnimator animatorthis = ObjectAnimator.ofFloat(v,"scaleY",1f,2f,0f,1f);
                AnimatorSet set = new AnimatorSet();
                set.playTogether(animatorALL,animatorthis);
                set.setDuration(1000);
                set.start();
            }
        });

        //cambio dell alpha del bottone
        Button alpha = findViewById(R.id.alpha);
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animatorALL = ObjectAnimator.ofFloat(all,"alpha",1f,0f,1f);
                ObjectAnimator animatorthis = ObjectAnimator.ofFloat(v,"alpha",1f,0f,1f);
                AnimatorSet set = new AnimatorSet();
                set.playTogether(animatorALL,animatorthis);
                set.setDuration(1000);
                set.start();
            }
        });
    }
}
