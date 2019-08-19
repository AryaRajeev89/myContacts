package com.arkscoding.studio.mycontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] IMAGES = {R.drawable.fl10,
            R.drawable.fl1,
            R.drawable.fl2,
            R.drawable.fl3,
            R.drawable.fl4,
            R.drawable.fl5,
            R.drawable.fl6,
            R.drawable.fl7,
            R.drawable.fl8,
            R.drawable.fl9 };

    String[] NAMES = {
            "Amelia",
            "George",
            "Isla",
            "Harry",
            "Ava",
            "Noah",
            "Emily",
            "Jack",
            "Sophia",
            "Charlie",};


    String[] PHONES = {"111-000-1234",
            "222-999-1234",
            "333-888-1234",
            "444-777-1234",
            "555-666-1234",
            "666-555-1234",
            "777-444-1234",
            "888-333-1234",
            "999-222-1234",
            "000-111-1234"};

    ListView listView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.contact);
        CustomAdaptor customAdaptor=new CustomAdaptor();
        listView.setAdapter(customAdaptor);

    }
    //inner class for extending BaseAdapter

    class CustomAdaptor extends BaseAdapter
    {

        @Override
        //gerCount is like a for loop (i=10)
        public int getCount() {
            return NAMES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            view=getLayoutInflater().inflate(R.layout.phonelayout,null);
            ImageView pic=(ImageView)view.findViewById(R.id.imageView);
            TextView name=(TextView)view.findViewById(R.id.name);
            TextView phone=(TextView)view.findViewById(R.id.phone_no);
            pic.setImageResource(IMAGES[i]);
            name.setText(NAMES[i]);
            phone.setText(PHONES[i]);
            return view;
        }
    }
}
