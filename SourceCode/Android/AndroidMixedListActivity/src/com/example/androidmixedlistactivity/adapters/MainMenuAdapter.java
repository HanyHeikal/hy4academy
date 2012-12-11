package com.example.androidmixedlistactivity.adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidmixedlistactivity.R;
import com.example.androidmixedlistactivity.beans.ItemBean;
import com.example.androidmixedlistactivity.constants.AndroidTutorialsConstants;

public class MainMenuAdapter extends ArrayAdapter<ItemBean> {

	private final Context context;
	private final List<ItemBean> values;
	public MainMenuAdapter(Context context, List<ItemBean> values) {
		super(context, R.layout.main_menu, values);
		this.context = context;
		this.values = values;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.main_menu_adapter, parent,
				false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		String option = values.get(position).getItem();
//		System.out.println(option);
		textView.setText(option);
		
		ImageView leftIcon = (ImageView) rowView.findViewById(R.id.left_icon);
		TextView subText = (TextView) rowView.findViewById(R.id.sublabel);
		
		if(option.equals(AndroidTutorialsConstants.BUTTON_ACTIVITY)) {
//			leftIcon.setImageResource(R.drawable.tablet1);
			subText.setText("Button Demo");
		} else if (option.equals(AndroidTutorialsConstants.EMAIL)) {
			leftIcon.setImageResource(R.drawable.tablet1);
			subText.setText("Emai Demo");
		} else if (option.equals(AndroidTutorialsConstants.MUSIC)) {
			leftIcon.setImageResource(R.drawable.tablet2);
			subText.setText("Music Demo");
		} else if (option.equals(AndroidTutorialsConstants.PREFERENCE)) {
			leftIcon.setImageResource(R.drawable.tablet3);
			subText.setText("Preference Demo");
		} else if (option.equals(AndroidTutorialsConstants.IMAGE)) {
			leftIcon.setImageResource(R.drawable.tablet4);
			subText.setText("Image Demo");
		} else if (option.equals(AndroidTutorialsConstants.CAMERA)) {
			leftIcon.setImageResource(R.drawable.tablet5);
			subText.setText("Camera Demo");
		} else if (option.equals(AndroidTutorialsConstants.DATABASE)) {
			leftIcon.setImageResource(R.drawable.tablet6);
			subText.setText("Database Demo");
		} else if (option.equals(AndroidTutorialsConstants.MAP)) {
			leftIcon.setImageResource(R.drawable.tablet7);
			subText.setText("Map Demo");
		} 
		return rowView;
	}
	
	
}
