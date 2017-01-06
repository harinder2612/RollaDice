package com.harinder.rolladice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im = (ImageView) findViewById(R.id.dices1);
        im.setImageResource(R.drawable.dice1);
    }

    public void add(View v)
    {Random rand = new Random();

        int  n = rand.nextInt(6) + 1;
        switch (n)
        {
            case 1: im.setImageResource(R.drawable.dice1);
                break;
            case 2: im.setImageResource(R.drawable.dice2);
                break;
            case 3: im.setImageResource(R.drawable.dice3);
                break;
            case 4: im.setImageResource(R.drawable.dice4);
                break;
            case 5: im.setImageResource(R.drawable.dice5);
                break;
            case 6: im.setImageResource(R.drawable.dice6);
                break;
        }

    }


}

