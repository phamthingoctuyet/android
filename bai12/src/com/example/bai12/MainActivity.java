package com.example.bai12;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button btnTT,btnTiep,btnTK;
	ImageButton btnThoat;
	EditText editTen,editSl,editTongKh,editTongKhVip,ediTongTT;
	TextView txtTT;
	CheckBox chkVip;
	DanhSachKhachHang danhsach=new DanhSachKhachHang();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControls();   
        addEvents();
    }
    private void getControls() 
    {  
    	btnTT=(Button) findViewById(R.id.btntinhtt);    
    	btnTiep=(Button) findViewById(R.id.btntiep);     
    	btnTK=(Button) findViewById(R.id.btnthongke); 
    	btnThoat=(ImageButton) findViewById(R.id.imgbtnthoat);     
    	editTen=(EditText) findViewById(R.id.edittenkh);    
    	editSl=(EditText) findViewById(R.id.editsoluongsach);     
    	editTongKh=(EditText) findViewById(R.id.edittongsokh);    
    	editTongKhVip=(EditText) findViewById(R.id.edittongsokhlavip);     
    	ediTongTT=(EditText) findViewById(R.id.edittongdt);     
    	txtTT=(TextView) findViewById(R.id.txtthanhtien);     
    	chkVip =(CheckBox) findViewById(R.id.chklavip);     
    }
    private void addEvents()  
    {    
    	btnTT.setOnClickListener(new ProcessMyEvent());     
    	btnTiep.setOnClickListener(new ProcessMyEvent());     
    	btnTK.setOnClickListener(new ProcessMyEvent());    	
    	btnThoat.setOnClickListener(new ProcessMyEvent());    
    }
    private void doTinhTien()    
    {   
    	KhachHang kh=new KhachHang();    
    	kh.setTenKh(editTen.getText()+"");   
    	kh.setSlmua(Integer.parseInt(editSl.getText()+""));  	
    	kh.setVip(chkVip.isChecked());  
    	txtTT.setText(kh.tinhThanhTien()+"");   
    	danhsach.addKhachHang(kh);    
    }
     
    private void doTiep()    
    {     
    	editTen.setText("");     
    	editSl.setText("");    
    	txtTT.setText("");   
    	editTen.requestFocus();    
    }
     
    private void doThongKe()   
    {
    	editTongKh.setText(danhsach.tongKhachHang()+"");
    	editTongKhVip.setText(danhsach.tongKhachHangVip()+"");
    	ediTongTT.setText(danhsach.tongDoanhThu()+"");    
    }
     
    private void doThoat()   
    {
     
    	AlertDialog.Builder builder=new AlertDialog.Builder(this);    
    	builder.setTitle("hỏi thoát chương trình");    
    	builder.setMessage("Muốn thoát chương trình này?");    
    	builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {    
     
    		public void onClick(DialogInterface dialog, int which) {    
    			dialog.cancel();   
    		}   
    	});  
    	builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
     
    	public void onClick(DialogInterface dialog, int which) { 
    		finish();
    	}
    	}); 
    	builder.create().show(); 
    }    
   
    

    	

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	public int getid() {
		// TODO Auto-generated method stub
		return 0;
	}
	private class ProcessMyEvent implements OnClickListener
    
    {
     
	    @Override
	     
	    public void onClick(View arg0) {
	     
		    int id = arg0.getId();
			if (id == R.id.btntinhtt) {
				doTinhTien();
			} else if (id == R.id.btntiep) {
				doTiep();
			} else if (id == R.id.btnthongke) {
				doThongKe();
			} else if (id == R.id.imgbtnthoat) {
				doThoat();
			}
	     
	    }
    }
    
}
