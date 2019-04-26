/*package com.Manzi.myapplication.Waiter;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.Manzi.myapplication.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Order extends Fragment{

    ListView databasemenulistView;
    FirebaseDatabase  mUpdateMenu;
    DatabaseReference reference;
    ArrayList<menuClass>arrayList;
    ArrayAdapter<menuClass> adapter;
    menuClass menuClass;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.order, container, false);

        return rootView;


        menuClass = new menuClass();
        databasemenulistView = (ListView) findViewById(R.id.databasemenulistView);
        databasemenulistView = FirebaseDatabase.getInstance();
        reference = getReference( "menuClass");
        databasemenulistView = new ArrayList<>();
        adapter = new ArrayAdapter<menuClass>(this,R.layout.fragment_updatemenu,R.id.edName,arrayList);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                menuClass = dataSnapshot.getValue(com.Manzi.myapplication.Waiter.menuClass.class);
                arrayList.add(menuClass);


            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reference = getReference(edPrice);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot da:dataSnapshot.getChildren() )

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reference = getRefrence(edDescription);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }



    }


*/