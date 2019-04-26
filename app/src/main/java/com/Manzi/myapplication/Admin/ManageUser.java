package com.Manzi.myapplication.Admin;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.Manzi.myapplication.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ManageUser extends AppCompatActivity {
    //firebase Var
    private DatabaseReference mManageUser;

    //android layout

    private Button btnADD,btnDelete;
    private EditText edUsername,edIdnumber,pasUser,edTelnumber,edSalary;
    private ListView databaseuserlistview;
    FirebaseAuth addUser;
    //arrayList
    private ArrayList<String> arrayList = new ArrayList<>();
    private ArrayAdapter<String> Users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_manage__user);
        mManageUser = FirebaseDatabase.getInstance().getReference("Waiter");
        Users = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);


        btnADD =(Button) findViewById(R.id.btnADD);
        edUsername =(EditText) findViewById(R.id.edUsername);
        edIdnumber =(EditText) findViewById(R.id.edIdnumber);
        pasUser =(EditText) findViewById(R.id.pasUser);
        edTelnumber =(EditText) findViewById(R.id.edTelnumber);
        edSalary =(EditText) findViewById(R.id.edSalary);
        addUser=FirebaseAuth.getInstance();

        databaseuserlistview =(ListView)findViewById(R.id.databaseuserlistview);
        databaseuserlistview.setAdapter(Users);

        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mManageUser.push().setValue("Name: "+edUsername.getText().toString()+"\n"+"ID NO: "+edIdnumber.getText().toString()+"\n"+"Tel NO: "+edTelnumber.getText().toString()+"\n"+"Password: "+pasUser.getText().toString()+"\n"+"Ksh: "+edSalary.getText().toString());

            }
        });

        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mManageUser.push().setValue("Name: "+edUsername.getText().toString()+"\n"+"ID NO: "+edIdnumber.getText().toString()+"\n"+"Tel No: "+edTelnumber.getText().toString()+"\n"+"Password: "+pasUser.getText().toString()+"\n"+"Ksh: "+edSalary.getText().toString());
                Toast.makeText(ManageUser.this, "Data Update Successful", Toast.LENGTH_SHORT).show();

            }
        });


        mManageUser.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                String string = dataSnapshot.getValue(String.class);
                arrayList.add(string);
                Users.notifyDataSetChanged();



            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                String string = dataSnapshot.getValue(String.class);
                arrayList.remove(string);
               Users.notifyDataSetChanged();

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
