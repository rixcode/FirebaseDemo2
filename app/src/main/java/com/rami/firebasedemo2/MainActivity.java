package com.rami.firebasedemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //First step; from pressing a button to a new activity!
    private Button sellbtn;

    private Button buybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //config - for button -> activity
        sellbtn = (Button) findViewById(R.id.sellbtn);
        sellbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSellActivity();
            }
                                   }

        );

        buybtn = (Button) findViewById(R.id.buybtn);
        buybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBuyActivity();
            }
        });



    }
    //Last step for initializing sellbtn activity!
    public void openSellActivity() {
        Intent intent = new Intent(this, SellActivity.class);
        startActivity(intent);
    }

    public void openBuyActivity() {
        Intent intent = new Intent(this, BuyActivity.class);
        startActivity(intent);
    }

}