package com.mbq.mbqscpuguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.TextView;



public class ListView extends Activity {
	 ListView l;
	    
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	       String  classNames[]={"About this app","Governors","IO Schedulers","TricksterMOD terms", "TCP Congestion", "Governor recommendations", "Tips"};
	  ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, classNames);
	  l.setAdapter(adapter);
	  
	        
	    }



		protected void setAdapter(ArrayAdapter<String> adapter) {
			// TODO Auto-generated method stub
			
			{
	}
ListView view = getListView();
view.setOnItemClickListener(new OnItemClickListener() {
	public void onItemClick(AdapterView<?> parent, View view,
			int position, long id) {
		
		String classNames = ((TextView) view).getText().toString();
		
		Intent i = new Intent(getApplicationContext(), About.class);
		
		i.putExtra("ClassNames", classNames);
		
		startActivity(i);
	}
});
}



		private ListView getListView() {
			// TODO Auto-generated method stub
			return null;
		}



		private void setOnItemClickListener(
				OnItemClickListener onItemClickListener) {
			// TODO Auto-generated method stub
			
		}}
