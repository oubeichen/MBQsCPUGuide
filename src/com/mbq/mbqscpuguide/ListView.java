package com.mbq.mbqscpuguide;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;



public class ListView extends Activity {
	 ListView l;
	    
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	       String  arr[]={"About","Governors","IO Schedulers","TricksterMOD terms","Help"};
	  ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, arr);
	  l.setAdapter(adapter);
	  
	        
	    }

		private void setAdapter(ArrayAdapter<String> adapter) {
			// TODO Auto-generated method stub
			
		}
	}