package com.mbq.mbqscpuguide;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AboutSettings extends ListActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //here we set the main layout
        // this is the parrent layout...here we will add the view we created
        setContentView(R.layout.main);

        //call the main layout from xml
        LinearLayout mainLayout = (LinearLayout)findViewById(R.id.main_layout_id);

        //create a view to inflate the layout_item (the xml with the textView created before)
        View view = getLayoutInflater().inflate(R.layout.layout_item, mainLayout,false);

        //add the view to the main layout
        mainLayout.addView(view);
    }
}
 