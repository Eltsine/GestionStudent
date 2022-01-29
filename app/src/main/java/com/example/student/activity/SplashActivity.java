package com.example.student.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.student.R;

public class SplashActivity extends AppCompatActivity {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        iv = findViewById(R.id.iv);

        iv.animate()
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .rotation(360f)
                .setDuration(2000);

        Thread t = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(3000);
                            startActivity(new Intent(SplashActivity.this, AddStudentActivity.class));
                            finish();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
        );
        t.start();
    }
}