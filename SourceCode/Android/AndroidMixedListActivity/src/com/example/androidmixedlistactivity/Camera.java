package com.example.androidmixedlistactivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Camera extends Activity implements View.OnClickListener {

	ImageView imageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.camera);
		imageView = (ImageView) findViewById(R.id.pictureId);
		findViewById(R.id.cameraButtonId).setOnClickListener(this);
	}


	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.cameraButtonId:
			Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(cameraIntent, 0);
			break;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == RESULT_OK) {
			Bundle extras = data.getExtras();
			Bitmap bitmap = (Bitmap) extras.get("data");
			imageView.setImageBitmap(bitmap);
		}
	}
}