/*package com.Manzi.myapplication.Admin;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.Manzi.myapplication.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.

 */
/*public class UpdatemenuFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_updatemenu, container, false);

        return root;
    }

    //firebase Var
    private DatabaseReference mUpdateMenu;

    //android layout
    private Button btnSubmit;
    private EditText edDescription, edPrice,edName;
    private ListView databasemenulistView;
    //arrayList
    private ArrayList<String> arrayList = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
   public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_updatemenu);

        mUpdateMenu = FirebaseDatabase.getInstance().getReference("Menu");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);

        btnSubmit =(Button) findViewById(R.id.btnSubmit);
        edDescription =(EditText) findViewById(R.id.edDescription);
        edPrice =(EditText) findViewById(R.id.edPrice);
        edName =(EditText) findViewById(R.id.edName);
        databasemenulistView =(ListView) findViewById(R.id.databasemenulistView);
        databasemenulistView.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mUpdateMenu.push().setValue(edName.getText().toString());
            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mUpdateMenu.push().setValue(edPrice.getText().toString());
            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mUpdateMenu.push().setValue(edDescription.getText().toString());
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
*/