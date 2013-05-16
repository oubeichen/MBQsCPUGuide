package com.mbq.mbqscpuguide;


	import android.app.ListActivity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.AdapterView;
	import android.widget.AdapterView.OnItemClickListener;
	import android.widget.ArrayAdapter;
	import android.widget.ListView;
	import android.widget.TextView;
	 
	public class About extends ListActivity {
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	         
	        // storing string resources into Array
	        String[] governorlist = getResources().getStringArray(R.array.governorlist);
	         
	        // Binding resources Array to ListAdapter
	        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, governorlist));
	         
	        ListView lv = getListView();
	 
	        // listening to single list item on click
	        lv.setOnItemClickListener(new OnItemClickListener() {
	          public void onItemClick(AdapterView<?> parent, View view,
	              int position, long id) {
	               
	              // selected item 
	              String product = ((TextView) view).getText().toString();
	               
	              // Launching new Activity on selecting single List Item
	              Intent i = new Intent(getApplicationContext(), AboutSettings.class);
	              // sending data to new activity
	              i.putExtra("product", product);
	              startActivity(i);
	             
	          }
	        });
	    }
	}

