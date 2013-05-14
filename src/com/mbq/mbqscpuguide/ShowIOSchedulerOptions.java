package com.mbq.mbqscpuguide;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ShowIOSchedulerOptions extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
        // storing string resources into Array
        String[] schedlist = getResources().getStringArray(R.array.ioschedlist);
         
        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.ioschedview, R.id.iosched, schedlist));
        
         
    }
}

