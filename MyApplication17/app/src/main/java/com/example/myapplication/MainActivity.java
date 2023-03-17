package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    boolean isBen=true;
    public void change(View view)
    {
        ImageView iv = findViewById(R.id.imageView);
        if(isBen)
        {
            iv.setImageResource(R.drawable.rath);
            isBen = false;
        }
        else
        {
            iv.setImageResource(R.drawable.b10);
            isBen=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}