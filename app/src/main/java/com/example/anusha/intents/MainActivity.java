package com.example.anusha.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view)
    {
        Uri u=Uri.parse("tel:");
        Intent i=new Intent(Intent.ACTION_CALL,u);
        startActivity(i);

    }
}
