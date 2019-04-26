package com.Manzi.myapplication.Waiter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.Manzi.myapplication.Admin.UpdateMenu;
import com.Manzi.myapplication.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import java.util.ArrayList;
import java.util.List;

public class Menu_Order extends AppCompatActivity {
 private ListView menulistView;
 DatabaseReference mUpdateMenu;
 List<UpdateMenu> updateMenuList;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        menulistView = findViewById(R.id.databasemenulistView);
         mUpdateMenu = FirebaseDatabase.getInstance().getReference("Menu");
         updateMenuList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_selectable_list_item,arrayList);
ListView order = (ListView)findViewById(R.id.order);

        menulistView.setAdapter(adapter);
        menulistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Menu_Order.this, arrayList.get(position),Toast.LENGTH_SHORT).show();
                //Andy hint APR 25th there was an ecxeption array list[position]

                String Tempholder= arrayList.toString();

                Intent intent = new Intent(Menu_Order.this,OrderSamary.class);

                intent.putExtra("Listviewclickvalue",arrayList);
                startActivity(intent);
            }
        });

    }

   // @Override
    protected void onStart() {

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
        menulistView.setAdapter(adapter);

        super.onStart();


    }
}
