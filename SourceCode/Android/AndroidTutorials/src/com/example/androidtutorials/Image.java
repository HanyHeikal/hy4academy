package com.example.androidtutorials;

import android.app.Activity;
import android.os.Bundle;

public class Image extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ImageView imageView = new ImageView(this);
		setContentView(imageView);
	}
	
	

}
