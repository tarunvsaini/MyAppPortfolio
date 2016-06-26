package com.tarun.saini.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int callerId=v.getId();

        switch (callerId)
        {
            case R.id.button:
                Toast.makeText(getApplicationContext(),"This button will launch my Movies app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(),"This button will launch my Super Duo app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(),"This button will launch my Joke telling app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(),"This button will launch my Material design newsreader app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(),"This button will launch my Android Wear app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(getApplicationContext(),"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
