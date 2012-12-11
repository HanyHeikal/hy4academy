package com.example.androidmixedlistactivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;

public class Music extends Activity implements OnClickListener {

//	MediaPlayer musicFile;
	boolean checkMusic;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.music);

		findViewById(R.id.radioPlay).setOnClickListener(this);
		findViewById(R.id.radioStop).setOnClickListener(this);

		// read preference value
		SharedPreferences sharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		checkMusic = sharedPreferences.getBoolean("checkbox", true);

//		musicFile = MediaPlayer.create(this, R.raw.asturias);
//		if (true == checkMusic) {
//			musicFile.start();
//		}
	}

	@Override
	protected void onPause() {
		super.onPause();
		System.out.println("onPause() method executed.");
		if (true == checkMusic) {
//			musicFile.release();
		}
		finish();
	}

	@Override
	protected void onStop() {
		super.onStop();
		System.out.println("onStop() method executed");
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.radioPlay:
			if (true == checkMusic) {
//				musicFile.start();
			}
			break;
		case R.id.radioStop:
			if (true == checkMusic) {
//				musicFile.pause();
			}
			break;
		}
	}

	SimpleOnGestureListener simpleOnGestureListener = new SimpleOnGestureListener() {
		@Override
		public boolean onDoubleTap(MotionEvent e) {
			return super.onDoubleTap(e);
		}

		@Override
		public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
				float velocityY) {
			String swipe = "";
			float sensitvity = 50;

			if ((e1.getX() - e2.getX()) > sensitvity) {
				swipe += "Swipe Left\n";
				// finish();
			} else if ((e2.getX() - e1.getX()) > sensitvity) {
				swipe += "Swipe Right\n";
//				musicFile.release();
				finish();
			} else {
				swipe += "\n";
			}

			if ((e1.getY() - e2.getY()) > sensitvity) {
				swipe += "Swipe Up\n";
			} else if ((e2.getY() - e1.getY()) > sensitvity) {
				swipe += "Swipe Down\n";
			} else {
				swipe += "\n";
			}
			return super.onFling(e1, e2, velocityX, velocityY);
		}

		@Override
		public void onLongPress(MotionEvent e) {
			super.onLongPress(e);
		}

		@Override
		public boolean onSingleTapConfirmed(MotionEvent e) {
			return super.onSingleTapConfirmed(e);
		}
	};

	GestureDetector gestureDetector = new GestureDetector(
			simpleOnGestureListener);

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		return gestureDetector.onTouchEvent(event);
	}

}
