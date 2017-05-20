package com.canada.youngsickim.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);

        ArrayList<String> listTitle = new ArrayList<String>();
        ArrayList<String> listsubTitle = new ArrayList<String>();
        ArrayList<String> listImages = new ArrayList<String>();

        for(int i = 1; i < 7; i++) {
            listTitle.add("This is title textView" + i);
            listsubTitle.add("I made a ListView right now!! the list row number is" + i);
            listImages.add("thumb_" + i);
        }

        listView.setAdapter(new ListViewAdapter(this,listTitle,listsubTitle,listImages));
    }
}
