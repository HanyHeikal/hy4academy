package com.example.androidimagelistactivity;

import com.example.androidimagelistactivity.adapter.MainMenuAdapter;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class MainMenu extends ListActivity {

	static final String MAIN_MENU[] = { "ButtonActivity", "Email",
			"Preference", "Music", "Image", "Camera", "Database", "Map" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.main_menu_adapter);
		setListAdapter(new MainMenuAdapter(this, MAIN_MENU));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main_menu_adapter, menu);
		return true;
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String selection = MAIN_MENU[position];
		
		try {
			Class selectionClass = Class.forName("com.example.androidimagelistactivity." + selection);
			Intent intent = new Intent(this, selectionClass);
			startActivity(intent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
