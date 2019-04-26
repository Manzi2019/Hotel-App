package com.Manzi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.Manzi.myapplication.Admin.Manager_Choice;
import com.Manzi.myapplication.Admin.loginasManagerActivity;
import com.Manzi.myapplication.Waiter.loginAttendantActivity;

public class LogINasActivity extends AppCompatActivity {
    Button BtnAttendant, BtnServe, BtnManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_inas);
        BtnAttendant=findViewById(R.id.btnattendant);
        BtnManage = findViewById(R.id.btnmanage);
        BtnServe= findViewById(R.id.btnserve);
        BtnAttendant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), loginAttendantActivity.class);
                startActivity(intent);
            }
        });
        BtnManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manage = new Intent(getApplicationContext(), Manager_Choice.class);
                startActivity(manage);
            }
        });
        BtnServe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serve = new Intent(getApplicationContext(), loginasHeadChefActivity.class);
                startActivity(serve);
                Toast.makeText(LogINasActivity.this, "GET PREMIUM VERSION", Toast.LENGTH_SHORT).show();
            }
        });

    }

    }

