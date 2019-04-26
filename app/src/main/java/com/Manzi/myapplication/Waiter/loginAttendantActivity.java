package com.Manzi.myapplication.Waiter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.Manzi.myapplication.LogINasActivity;
import com.Manzi.myapplication.R;

public class loginAttendantActivity extends AppCompatActivity {
    Button Btnback,BtnsignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_attendant);
        Btnback = findViewById(R.id.btn_back);
        BtnsignIn = findViewById(R.id.btn_signin);
        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(getApplicationContext(), LogINasActivity.class);
                startActivity(back);
            }
        });
        BtnsignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn= new Intent(getApplicationContext(),Menu_Order.class);
                startActivity(signIn);
            }
        });
    }
}
