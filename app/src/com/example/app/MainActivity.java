package com.example.app;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listViewSinhVien);
        ArrayList<SinhVien> mangsinhvien = new ArrayList<SinhVien>();
        mangsinhvien.add(new SinhVien(" Nguyễn Thị Thùy Dung", 1996));
        mangsinhvien.add(new SinhVien(" Hồ Thị Nha", 1996));
        mangsinhvien.add(new SinhVien(" Bùi Thanh Phương", 1996));
        mangsinhvien.add(new SinhVien(" Phạm Thị Ngọc Tuyết", 1996));
        mangsinhvien.add(new SinhVien(" Phạm Ngọc Vũ", 2000));
        ListAdapter adapter = new ListAdapter(
        		MainActivity.this,
        		R.layout.activity_dong_sinh_vien, 
        		mangsinhvien );
        lv.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
