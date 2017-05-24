package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<SinhVien> {
	public ListAdapter( Context context, int textViewResourceId){
		super (context, textViewResourceId);
	}
	public View getView(int position, View convertView, ViewGroup parent){
		View v = convertView;
		if(v == null){
			LayoutInflater vi;
			vi = LayoutInflater.from(getContext());
			v = vi.inflate(R.layout.activity_dong_sinh_vien,null);
		}
		SinhVien p = getItem(position);
		if(p != null){
			TextView tt1 = (TextView) v.findViewById(R.id.textViewHoTen);
			tt1.setText(p.HoTen);
			TextView tt2 = (TextView) v.findViewById(R.id.textViewNamSinh);
			tt2.setText(String.valueOf(p.NamSinh));
		}
		return v;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
