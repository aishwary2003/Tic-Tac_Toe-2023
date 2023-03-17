package com.example.myapplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean b10=true;

    public void change(View view){
        ImageView iv=findViewById(R.id.imageView3);
        if(b10) {
            iv.setImageResource(R.drawable.rath);
            b10 = false;
        }else{
            iv.setImageResource(R.drawable.b10);
            b10=true;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}