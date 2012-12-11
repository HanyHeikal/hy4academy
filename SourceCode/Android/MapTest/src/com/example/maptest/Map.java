package com.example.maptest;

import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MotionEvent;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;

public class Map extends MapActivity {

	MapView map;
	long start;
	long stop;
	MyLocationOverlay compass;
	MapController controller;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        map = (MapView) findViewById(R.id.mvMain);
        map.setBuiltInZoomControls(true);
//        Touchy t = new Touchy();
//        List<Overlay> overlayList = map.getOverlays();
//        overlayList.add(t);
//        compass = new MyLocationOverlay(Map.this, map);
//        overlayList.add(compass);
//        controller = map.getController();
//        GeoPoint point = new GeoPoint(51543234, 7848593);
//        controller.animateTo(point);
//        controller.setZoom(6);
    }

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		compass.disableCompass();
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		compass.enableCompass();
		super.onResume();
	}

	class Touchy extends Overlay {
		public boolean onTouchEvent(MotionEvent e, MapView m) {
			if(e.getAction() == MotionEvent.ACTION_DOWN) {
				start = e.getEventTime();
			}
			
			if(e.getAction() == MotionEvent.ACTION_UP) {
				stop = e.getEventTime();
			}
			
			if (stop - start > 1500) {
				AlertDialog alert = new AlertDialog.Builder(Map.this).create();
				alert.setTitle("Pick an Option");
				alert.setMessage("Please Pick an option");
				alert.setButton("Place a pin", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				});
				alert.show();
			}
			
			return true;
		}
	}
}
