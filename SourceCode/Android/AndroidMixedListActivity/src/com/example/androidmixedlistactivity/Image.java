package com.example.androidmixedlistactivity;

import android.app.Activity;
import android.os.Bundle;

public class Image extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ImageView imageView = new ImageView(this);
		setContentView(imageView);
		
	}

}
