/*package com.Manzi.myapplication.Admin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.Manzi.myapplication.Admin.UpdateMenu;
import com.Manzi.myapplication.Admin.ManageUser;
import com.Manzi.myapplication.Waiter.OrderSamary;
import com.Manzi.myapplication.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
/*public class ManagerSectionsPagerAdapter extends FragmentPagerAdapter {

    public ManagerSectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                UpdatemenuFragment tabItem = new UpdatemenuFragment();
                return tabItem;
            case 1:
                ManageuserFragment tabItem1 = new ManageuserFragment();
                return tabItem1;
            case 2:
                OrderreportFragment tabItem2 = new OrderreportFragment();
                return tabItem2;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }


    public CharSequence getpageTitle(int position) {
        switch (position) {

            case 0:
                return "Update Menu";
            case 1:
                return "Manage User";
            case 2:
                return "Order Report";
        }
        return null;

    }

    public class ManageUser extends AppCompatActivity {
        //firebase Var
        private DatabaseReference mManageUser;

        //android layout

        private Button btnADD, btnDelete;
        private EditText edUsername, edIdnumber, pasUser, edTelnumber, edSalary;
        private ListView databaseuserlistview;
        FirebaseAuth addUser;
        //arrayList
        private ArrayList<String> arrayList = new ArrayList<>();
        private ArrayAdapter<String> Users;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_manage__user);
            mManageUser = FirebaseDatabase.getInstance().getReference();
            Users = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);


            btnADD = (Button) findViewById(R.id.btnADD);
            edUsername = (EditText) findViewById(R.id.edUsername);
            edIdnumber = (EditText) findViewById(R.id.edIdnumber);
            pasUser = (EditText) findViewById(R.id.pasUser);
            edTelnumber = (EditText) findViewById(R.id.edTelnumber);
            edSalary = (EditText) findViewById(R.id.edSalary);
            addUser = FirebaseAuth.getInstance();

            databaseuserlistview = (ListView) findViewById(R.id.databaseuserlistview);
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
    }
}
*/


