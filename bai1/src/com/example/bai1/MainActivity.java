package com.example.bai1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btntong2so1(View v)
    {
    	EditText txtsoa=(EditText)
    			findViewById(R.id.editsoa);
    	int a=Integer.parseInt(txtsoa.getText()+"");
    			
    	EditText txtsob=(EditText)
    			findViewById(R.id.editsob);
    	int b=Integer.parseInt(txtsob.getText()+"");
    	TextView txtkq1=(TextView) findViewById(R.id.txtkq1);
    	txtkq1.setText((a+b)+"");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
