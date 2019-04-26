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

public class UpdateMenu extends AppCompatActivity {



    //firebase Var
    public DatabaseReference mUpdateMenu;

    //android layout
    private Button btnSubmit;
    private EditText edDescription, edPrice,edName;
    public ListView databasemenulistView;
//arrayList
    private ArrayList<String> arrayList = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_updatemenu);

        mUpdateMenu = FirebaseDatabase.getInstance().getReference("Menu");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item,arrayList);

        btnSubmit =(Button) findViewById(R.id.btnSubmit);
       edDescription =(EditText) findViewById(R.id.edDescription);
        edPrice =(EditText) findViewById(R.id.edPrice);
        edName =(EditText) findViewById(R.id.edName);
databasemenulistView =(ListView) findViewById(R.id.databasemenulistView);
databasemenulistView.setAdapter(adapter);
        FirebaseAuth.getInstance();


btnSubmit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        mUpdateMenu.push().setValue("food "+edName.getText().toString()+"\n"+"Ksh: "+edPrice.getText().toString()+"\n"+"Description: "+edDescription.getText().toString());
    }
});
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mUpdateMenu.push().setValue(edName.getText().toString()+"\n"+"Ksh: "+edPrice.getText().toString()+"\n"+"Description: "+edDescription.getText().toString());
                Toast.makeText(UpdateMenu.this, "Menu Update Successful", Toast.LENGTH_SHORT).show();
            }
        });


mUpdateMenu.addChildEventListener(new ChildEventListener() {
    @Override
    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

        String string = dataSnapshot.getValue(String.class);
        arrayList.add(string);
        adapter.notifyDataSetChanged();
        


    }

    @Override
    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

    }

    @Override
    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

        String string = dataSnapshot.getValue(String.class);
        arrayList.remove(string);
        adapter.notifyDataSetChanged();

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
