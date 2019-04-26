package com.Manzi.myapplication.Waiter;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.Manzi.myapplication.R;

public class OrderSamary extends AppCompatActivity{
    ListView order;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_order_sumary);

order = (ListView)findViewById(R.id.order);

String Tempholder = getIntent().getStringExtra("Listviewclickvalue");
 order.setTag(Tempholder);//there was an ecxeption setText




       }

    }
