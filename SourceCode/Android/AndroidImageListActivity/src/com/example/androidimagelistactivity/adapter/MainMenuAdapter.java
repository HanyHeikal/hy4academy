package com.example.androidimagelistactivity.adapter;


import com.example.androidimagelistactivity.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainMenuAdapter extends ArrayAdapter<String> {
	
	private final Context context;
	private final String[] values;
	
	public MainMenuAdapter(Context context, String[] values) {
		super(context, R.layout.main_menu_adapter, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater layoutInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = layoutInflater.inflate(R.layout.main_menu_adapter,
				parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.main_label);
		textView.setText(values[position]);
		
		ImageView main_logo = (ImageView) rowView.findViewById(R.id.main_logo);
		TextView subText = (TextView) rowView.findViewById(R.id.main_sublabel);
		String option = values[position];
		
		if(option.equals("ButtonActivity")) {
			main_logo.setImageResource(R.drawable.tablet1);
			subText.setText("Button Demo");
		} else if (option.equals("Email")) {
			main_logo.setImageResource(R.drawable.tablet2);
			subText.setText("Email Demo");
		}

		return rowView;
	}
	
	

}
