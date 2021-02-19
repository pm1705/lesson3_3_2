package com.example.lesson3_3;

import androidx.appcompat.app.AppCompatActivity;

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
        btn = (Button)findViewById(R.id.button);
        i=1;
    }

    public void clicked(View view) {
        if (i==6){
            btn.setText("Enough! new start NOW! >:( ");
            i=1;
        }
        else{
            btn.setText("click number "+i);
            i++;
        }
    }
}