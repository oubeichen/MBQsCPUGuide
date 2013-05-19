package com.mbq.mbqscpuguide;

 
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class AndroidListViewActivity extends ListActivity {
 private String[] strings = { "About this app", "Content", "CPU Governors", "IO Schedulers", "TCP Algorithms", "TricksterMOD Terms" };
 
	private String[] menuClassNames = { About.class.getName(), AboutSettings.class.getName(), Governors.class.getName(), IOSched.class.getName(), Recommendations.class.getName() };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        try
        {
            Intent intent = new Intent(this, Class.forName(menuClassNames[position]));
            startActivity(intent);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
