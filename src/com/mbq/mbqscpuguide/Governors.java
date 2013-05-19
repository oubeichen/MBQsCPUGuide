package com.mbq.mbqscpuguide;

import android.app.*;
import android.os.*;
import android.widget.*;


public class Governors extends ListActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(this,
android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.governorlist)));


	}
	}
