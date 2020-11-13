package com.samuilolegovich.vedroid_loginapp;

import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;



public class TimerIm extends Thread {
    private ImageView imageView;

    public TimerIm(ImageView imageView) {
//        imageView = (ImageView) findViewById(R.id.imageView2);
        this.imageView = imageView;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        imageView.setImageResource(R.drawable.q2);
        MainActivity.end();

    }
}
