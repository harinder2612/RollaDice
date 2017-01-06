package com.harinder.rolladice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class threedices extends AppCompatActivity {
    ImageView im,im2,im3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threedices);
        im= (ImageView) findViewById(R.id.dices1);
        im2= (ImageView) findViewById(R.id.dices2);
        im3= (ImageView) findViewById(R.id.dices3);
    }

    public void roll(View v)
    {
        Random rand = new Random();
        int n,m,l;
        n = rand.nextInt(6) + 1;
        m = rand.nextInt(6) + 1;
        l=rand.nextInt(6) + 1;
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
        switch (l)
        {
            case 1: im3.setImageResource(R.drawable.dice1);
                break;
            case 2: im3.setImageResource(R.drawable.dice2);
                break;
            case 3: im3.setImageResource(R.drawable.dice3);
                break;
            case 4: im3.setImageResource(R.drawable.dice4);
                break;
            case 5: im3.setImageResource(R.drawable.dice5);
                break;
            case 6: im3.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
