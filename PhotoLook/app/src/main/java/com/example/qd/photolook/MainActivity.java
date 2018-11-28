package com.example.qd.photolook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.qd.photolook.utils.PhotoView;

public class MainActivity extends AppCompatActivity {
    private PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        photoView = findViewById(R.id.photoView);

        photoView.enable();
    }
}
