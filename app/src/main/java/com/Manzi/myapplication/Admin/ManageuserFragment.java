/*package com.Manzi.myapplication.Admin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.Manzi.myapplication.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


import static android.R.layout.simple_list_item_1;

/**
 * A simple {@link Fragment} subclass.

 */
/*public class ManageuserFragment extends Fragment {
    //firebase Var
    private DatabaseReference mManageUser;

    //android layout

    private Button btnADD,btnDelete;
    private EditText edUsername,edIdnumber,pasUser,edTelnumber,edSalary;
    private ListView databaseuserlistview;
    FirebaseAuth addUser;
    //arrayList
    private ArrayList<String> arrayList = new ArrayList<>();
    private ArrayAdapter<String> Users = new ArrayAdapter<String>(this, simple_list_item_1,arrayList);


    public ManageuserFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_manage__user, container, false);

        return root;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_manage__user);
        mManageUser = FirebaseDatabase.getInstance().getReference();


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
                mManageUser.push().setValue(edUsername.getText().toString());
            }
        });
        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mManageUser.push().setValue(edIdnumber.getText().toString());
            }
        });
        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mManageUser.push().setValue(pasUser.getText().toString());
            }
        });
        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mManageUser.push().setValue(edTelnumber.getText().toString());
            }
        });
        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mManageUser.push().setValue(edSalary.getText().toString());
            }
        });




    }

    public void setContentView(int fragment_manage__user) {

    }

    public Object findViewById(int databaseuserlistview) {
        return null;
    }
}
*/