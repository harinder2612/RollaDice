package com.harinder.rolladice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class twodices extends AppCompatActivity {
     ImageView im,im2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twodices);
        im= (ImageView) findViewById(R.id.dices1);
        im2= (ImageView) findViewById(R.id.dices2);
    }

    public void roll(View v)
    {
        Random rand = new Random();
        Random rand2 = new Random();
        int n,m;
          n = rand.nextInt(6) + 1;
        m = rand2.nextInt(6) + 1;
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
        switch (m)
        {
            case 1: im2.setImageResource(R.drawable.dice1);
                break;
            case 2: im2.setImageResource(R.drawable.dice2);
                break;
            case 3: im2.setImageResource(R.drawable.dice3);
                break;
            case 4: im2.setImageResource(R.drawable.dice4);
                break;
            case 5: im2.setImageResource(R.drawable.dice5);
                break;
            case 6: im2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
