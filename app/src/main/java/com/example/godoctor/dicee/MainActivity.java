package com.example.godoctor.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollbutton;
        rollbutton = (Button) findViewById(R.id.rollButton);
       final  ImageView leftImageView;
        leftImageView = (ImageView)findViewById(R.id.imageView_left);
       final  ImageView rightImageView;
        rightImageView = (ImageView)findViewById(R.id.imageView_right);
       final  int[] diceArray = {R.drawable.dice1,
                           R.drawable.dice2,
                           R.drawable.dice3,
                          R.drawable.dice4,
                          R.drawable.dice5,
                          R.drawable.dice6
                          };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","Hey this is my first click");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Random","number is--> " +number);
                leftImageView.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                Log.d("Random","number for 2nd dicee--> " +number);
                rightImageView.setImageResource(diceArray[number]);
            }
        });
    }
}
