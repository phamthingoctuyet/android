package com.example.listview_arraylist;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText txtten;
	TextView txtchon;
	Button btn;
	ListView lv;
	ArrayList<String>arrList=null;
	ArrayAdapter<String> adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtten=(EditText) findViewById(R.id.txtTen1);
        txtchon=(TextView) findViewById(R.id.txtselection1);
        lv=(ListView) findViewById(R.id.lvperson1);
        arrList=new ArrayList<String>();
        adapter=new ArrayAdapter<String>
        (this,android.R.layout.simple_list_item_1,arrList);
        lv.setAdapter(adapter);
        btn=(Button) findViewById(R.id.btnNhap1);
        btn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View arg0) {
        arrList.add(txtten.getText()+"");
        adapter.notifyDataSetChanged();
        }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        public void onItemClick(
        AdapterView<?> arg0,View arg1,
        int arg2,long arg3) {
       txtchon.setText("position : "+ arg2+"; value ="+arrList.get(arg2));
       }
       });
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
       public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
        int arg2, long arg3) {
        arrList.remove(arg2);
       adapter.notifyDataSetChanged();
       return false;
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
