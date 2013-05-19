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

	 setListAdapter(new ArrayAdapter<String>(this,
android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.list)));

		
	 }
		 }
