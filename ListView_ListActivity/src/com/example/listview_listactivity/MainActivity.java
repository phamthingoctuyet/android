package com.example.listview_listactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String arr[]={"Intel","SamSung","Nokia","Simen","AMD","KIC","ECD"};
        ListView lv=(ListView) findViewById(R.id.lvperson);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>
		(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(adapter);
		final TextView txt=(TextView) findViewById(R.id.txtselection);
		lv.setOnItemClickListener(
				new AdapterView.OnItemClickListener() {
					public void onItemClick(AdapterView<?> arg0,
							View arg1, 
							int arg2,
							long arg3) {
						txt.setText("position :"+arg2+" ; value ="+arr[arg2]);
					}
				});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
