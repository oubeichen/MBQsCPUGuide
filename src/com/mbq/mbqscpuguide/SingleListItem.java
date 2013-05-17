package com.mbq.mbqscpuguide;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.*;
import android.view.*;
import android.widget.AdapterView.*;


public class SingleListItem extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // storing string resources into Array
        final String[] list = getResources().getStringArray(R.array.ListItem);

        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.singlelistitemlist, R.id.sliListView, list));

        ListView lv = getListView();

        // listening to single list item on click
        lv.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
										int position, long id) {

					// Launching new Activity on selecting single List Item, I dont need this here and will edit it out soon
					Intent i = new Intent(getApplicationContext(), ShowIOSchedulerOptions.class);
					// sending data to new activity
					i.putExtra("list", list);
					startActivity(i);
				}
			});
	}} 
