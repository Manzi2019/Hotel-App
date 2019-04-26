package com.Manzi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.Manzi.myapplication.Waiter.Menu_Order;
import com.Manzi.myapplication.Waiter.OrderSamary;

public class loginasHeadChefActivity extends AppCompatActivity {
Button Btnback,BtnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginas_serve);
        Btnback = findViewById(R.id.btn_back);
        BtnSignIn = findViewById(R.id.btn_signin);
        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(getApplicationContext(),LogINasActivity.class);
                startActivity(back);
            }
        });
        BtnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ordered = new Intent(getApplicationContext(),loginasHeadChefActivity.class);
                startActivity(ordered);
            }
        });

    }


}
