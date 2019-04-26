package com.Manzi.myapplication.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.Manzi.myapplication.Waiter.OrderSamary;
import com.Manzi.myapplication.R;

public class Manager_Choice extends AppCompatActivity {
   Button btnManageUser,
    btnUpdateMenu,
    btnOrderReport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager__choice);

        btnManageUser=findViewById(R.id.btnManageUser);
        btnUpdateMenu = findViewById(R.id.  btnUpdateMenu);
        btnOrderReport= findViewById(R.id.btnOrderReport);

        btnManageUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ManageUser.class);
                startActivity(intent);
                Toast.makeText(Manager_Choice.this, "Menu Update Successful", Toast.LENGTH_SHORT).show();

        }
        });
        btnUpdateMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manage = new Intent(getApplicationContext(), UpdateMenu.class);
                startActivity(manage);
            }
        });
        btnOrderReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Manager_Choice.class);
                startActivity(intent);
                Toast.makeText(Manager_Choice.this, "GET PREMIUM VERSION", Toast.LENGTH_SHORT).show();

            }
        });

       /* btnOrderReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serve = new Intent(getApplicationContext(), OrderSamary.class);
                startActivity(serve);
            }
        });*/




    }
}
