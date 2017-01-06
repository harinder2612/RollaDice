package com.harinder.rolladice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
    }

    public void one(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    public void two(View v)
    {
        Intent intent=new Intent(this,twodices.class);
        startActivity(intent);

    }

    public void three(View v)
    {
        Intent intent=new Intent(this,threedices.class);
        startActivity(intent);

    }
}
