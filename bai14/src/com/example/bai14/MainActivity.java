package com.example.bai14;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
	ArrayList<employee>arrEmployee=new ArrayList<employee>();
	MyArrayAdapter adapter=null;
	ListView lvNhanvien=null;
	Button btnNhap;
	ImageButton btnRemoveAll;
	EditText editMa,editTen;
	RadioGroup genderGroup;
	@Override
	protected void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	btnNhap=(Button) findViewById(R.id.btnNhap);
	btnRemoveAll=(ImageButton) findViewById(R.id.btnxoa);
	editMa=(EditText) findViewById(R.id.editma);
	editTen=(EditText) findViewById(R.id.editten);
	genderGroup=(RadioGroup) findViewById(R.id.radioGroup1);
	lvNhanvien=(ListView) findViewById(R.id.lvnhanvien);
	arrEmployee=new ArrayList<employee>();
	adapter=new MyArrayAdapter(this,R.layout.my_item_layout,arrEmployee);
	lvNhanvien.setAdapter(adapter);
	btnNhap.setOnClickListener(new OnClickListener() {
	@Override
	public void onClick(View arg0) {
	xulyNhap();
	}
	});
	btnRemoveAll.setOnClickListener(new OnClickListener(){
	@Override
	public void onClick(View arg0) {
	xulyXoa();
	}
	});
	}
	public void xulyNhap(){
	String ma=editMa.getText()+"";
	String ten=editTen.getText()+"";
	boolean gioitinh=false;
	if(genderGroup.getCheckedRadioButtonId()==R.id.radNu)
	gioitinh=true;
	employee emp=new employee();
	emp.setId(ma);
	emp.setName(ten);
	emp.setGender(gioitinh);
	arrEmployee.add(emp);
	adapter.notifyDataSetChanged();
	editMa.setText("");
	editTen.setText("");
	editMa.requestFocus();
	}
	public void xulyXoa(){
	for(int i=lvNhanvien.getChildCount()-1;i>=0;i--)
	{
	View v=lvNhanvien.getChildAt(i);
	CheckBox chk=(CheckBox) v.findViewById(R.id.chkitem);
	if(chk.isChecked())
	{
	arrEmployee.remove(i);
	}
	}
	adapter.notifyDataSetChanged();
	}
}

    
