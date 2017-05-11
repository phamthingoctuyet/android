package com.example.bai2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDoi= (Button) findViewById(R.id.btnDoi);
        btnDoi.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View arg0) {
        		EditText editText1 = (EditText) findViewById(R.id.editnamduonglich);
        		int Year= Integer.parseInt(editText1.getText()+ "");
        		String can = null,chi = null;
        		switch(Year%10){
        			case 0 : can = "Canh"; break;
        			case 1 : can = "Tân"; break;
        			case 2 : can = "Nhâm"; break;
        			case 3 : can = "Qúy"; break;
        			case 4 : can = "Gíap"; break;
        			case 5 : can = "Ât"; break;
        			case 6 : can = "Bính"; break;
        			case 7 : can = "Đinh"; break;
        			case 8 : can = "Mậu"; break;
        			case 9 : can = "Ký"; break;	
        		}
        		switch(Year%12) {
        			case 0 : chi = "Thân"; break;
        			case 1 : chi = "Dậu"; break;
        			case 2 : chi = "Tuất"; break;
        			case 3 : chi = "Hợi"; break;
        			case 4 : chi = "Tý"; break;
        			case 5 : chi = "Sửu"; break;
        			case 6 : chi = "Dần"; break;
        			case 7 : chi = "Mẹo"; break;
        			case 8 : chi = "Thìn"; break;
        			case 9 : chi = "Tỵ"; break;
        			case 10 : chi = "Ngọ"; break;
        			case 11 : chi = "Mùi"; break;
        		}
        		TextView txtkq = (TextView)findViewById(R.id.textnamAL);
                txtkq.setText(can+""+chi);
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
