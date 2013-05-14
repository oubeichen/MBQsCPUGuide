package com.mbq.mbqscpuguide;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
 
public class IOSched extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
        // storing string resources into Array
        final String[] schedlist = getResources().getStringArray(R.array.ioschedlist);
         
        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.ioschedview, R.id.iosched, schedlist));
         
        ListView lv = getListView();
 
        // listening to single list item on click
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
               
              // Launching new Activity on selecting single List Item
              Intent i = new Intent(getApplicationContext(), ShowIOSchedulerOptions.class);
              // sending data to new activity
              i.putExtra("schedlist", schedlist);
              startActivity(i);
             
          }
        });
    }
}