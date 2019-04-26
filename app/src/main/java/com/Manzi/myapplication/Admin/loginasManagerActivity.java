package com.Manzi.myapplication.Admin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Manzi.myapplication.Admin.Manager_Choice;
import com.Manzi.myapplication.LogINasActivity;
import com.Manzi.myapplication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class loginasManagerActivity extends AppCompatActivity {
    private EditText Idnumber,edName,edPassword;
    private Button Btnback, BtnSignIn;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginas_manager);

        edPassword =(EditText) findViewById(R.id.edPassword);
        edName = (EditText) findViewById(R.id.edName);
        Idnumber = (EditText) findViewById(R.id.edIdnumber);
        Btnback = (Button) findViewById(R.id.btn_back);
        BtnSignIn = (Button) findViewById(R.id.btn_signin);
        firebaseAuth=FirebaseAuth.getInstance();
        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(getApplicationContext(), LogINasActivity.class);
                startActivity(back);
            }
        });
        BtnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String Email=Idnumber.getText().toString();
               String Password=edPassword.getText().toString().trim();
               if(Email.isEmpty()){
                   Toast.makeText(loginasManagerActivity.this, "Email Required", Toast.LENGTH_LONG).show();
                   return;
               } else if(Password.isEmpty()){
                   Toast.makeText(loginasManagerActivity.this, "Password Required", Toast.LENGTH_SHORT).show();
                   return;
               }
               else{

                   firebaseAuth.signInWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                       @Override
                       public void onComplete(@NonNull Task<AuthResult> task) {
                           if(task.isSuccessful()){
                               Toast.makeText(loginasManagerActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                               Intent goToManagerActivity=new Intent(loginasManagerActivity.this, Manager_Choice.class);
                               startActivity(goToManagerActivity);
                           }
                           else{
                               Toast.makeText(loginasManagerActivity.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();

                           }

                       }
                   });

               }
            }
        });
    }
   }
