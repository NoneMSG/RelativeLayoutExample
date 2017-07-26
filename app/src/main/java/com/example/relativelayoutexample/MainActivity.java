package com.example.relativelayoutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtton1Click( View view ) {
        Intent intent = new Intent( this, RelativeLayout01Activity.class );
        startActivity(intent);
    }

    public void onButtton2Click( View view ) {
        Intent intent = new Intent( this, RelativeLayout02Activity.class );
        startActivity(intent);
    }

}
