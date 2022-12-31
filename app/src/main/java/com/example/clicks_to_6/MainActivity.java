package com.example.clicks_to_6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.number_of_clicks_to_6);
        i = 0;
    }

    @SuppressLint("SetTextI18n")
    public void click_button(View view) {
        if (i < 6){
            i++;
            btn.setText("This is click number: " + i);}
        else{
            btn.setText("Enough to click. Go to new start");
            i = 0;
        }
    }
}