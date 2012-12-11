package com.example.androidtutorials;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidtutorials.adapters.ExpandableAdapter;
import com.example.androidtutorials.adapters.MainMenuAdapter;
import com.example.androidtutorials.beans.ExpandableBean;
import com.example.androidtutorials.beans.ItemBean;
import com.example.androidtutorials.constants.AndroidTutorialsConstants;

public class MainMenu extends ListActivity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        
        findViewById(R.id.exitButton).setOnClickListener(this);
        List<ItemBean> values = loadListActivityData();
        MainMenuAdapter adapter = new MainMenuAdapter(this, values);
        setListAdapter(adapter);
        
        ExpandableListView l = (ExpandableListView) findViewById(R.id.ExpandableListView01);
		ExpandableBean expandableBean = loadExpandableData();
		ExpandableAdapter adapter1 = new ExpandableAdapter(this,
				expandableBean.getGroups(), expandableBean.getChilds());
		l.setAdapter(adapter1); 
    }

    private List<ItemBean> loadListActivityData() {
    	ArrayList<ItemBean> list = new ArrayList<ItemBean>();
    	ItemBean itemBean = new ItemBean(AndroidTutorialsConstants.BUTTON_ACTIVITY);
    	list.add(itemBean);
    	itemBean = new ItemBean(AndroidTutorialsConstants.EMAIL);
    	list.add(itemBean);
    	itemBean = new ItemBean(AndroidTutorialsConstants.MUSIC);
    	list.add(itemBean);
    	itemBean = new ItemBean(AndroidTutorialsConstants.PREFERENCE);
    	list.add(itemBean);
    	itemBean = new ItemBean(AndroidTutorialsConstants.IMAGE);
    	list.add(itemBean);
    	itemBean = new ItemBean(AndroidTutorialsConstants.CAMERA);
    	list.add(itemBean);
    	itemBean = new ItemBean(AndroidTutorialsConstants.DATABASE);
    	list.add(itemBean);
    	itemBean = new ItemBean(AndroidTutorialsConstants.MAP);
    	list.add(itemBean);
    	return list;
    }
    
    private ExpandableBean loadExpandableData() {
    	ArrayList<String> groups = new ArrayList<String>();
		ArrayList<ArrayList<ArrayList<String>>> childs = new ArrayList<ArrayList<ArrayList<String>>>();
		ExpandableBean expandableBean = new ExpandableBean();

		groups.add("Android Tutorial Details");

		childs.add(new ArrayList<ArrayList<String>>());
		childs.get(0).add(new ArrayList<String>());
		childs.get(0)
				.get(0)
				.add("A tutorial is a method of transferring knowledge "
						+ "and may be used as a part of a learning process. "
						+ "More interactive and specific than a book or a lecture; "
						+ "a tutorial seeks to teach by example and supply the "
						+ "information to complete a certain task. ");
		
//		childs.add(new ArrayList<ArrayList<String>>());
//		childs.get(0).add(new ArrayList<String>());
//		childs.get(0).get(0).add("Example 0");
//		childs.add(new ArrayList<ArrayList<String>>());
//		childs.get(0).add(new ArrayList<String>());
//		childs.get(0).get(1).add("Example 1");
//		childs.add(new ArrayList<ArrayList<String>>());
//		childs.get(0).add(new ArrayList<String>());
//		childs.get(0).get(2).add("Example 2");
//		expandableBean.setGroups(groups);
//		expandableBean.setChilds(childs);
		
		expandableBean.setGroups(groups);
		expandableBean.setChilds(childs);

		return expandableBean; 
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		
		case R.id.exitButton:
			finish();
			break;
		}
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		ItemBean selectedItem = (ItemBean) getListAdapter().getItem(position);
		String option = selectedItem.getItem();
		
		if (option.equals(AndroidTutorialsConstants.BUTTON_ACTIVITY)) {
			Bundle bundle = new Bundle();
			bundle.putString("date", new Date().toString());
			Intent buttonIntent = new Intent(this, ButtonActivity.class);
			buttonIntent.putExtras(bundle);
//			startActivity(buttonIntent);
			startActivityForResult(buttonIntent, 0);
		} else if (option.equals(AndroidTutorialsConstants.EMAIL)) {
			Intent eIntent = new Intent(this, Email.class);
			startActivity(eIntent);
		} else if (option.equals(AndroidTutorialsConstants.MUSIC)) {
			Intent musicIntent = new Intent(this, Music.class);
			startActivity(musicIntent);
		} else if (option.equals(AndroidTutorialsConstants.PREFERENCE)) {
			Intent preferenceIntent = new Intent(this, Preference.class);
			startActivity(preferenceIntent);
		} else if (option.equals(AndroidTutorialsConstants.IMAGE)) {
			Intent imageIntent = new Intent(this, Image.class);
			startActivity(imageIntent);
		} else if (option.equals(AndroidTutorialsConstants.CAMERA)) {
			Intent camIntent = new Intent(this, Camera.class);
			startActivity(camIntent);
		} else if (option.equals(AndroidTutorialsConstants.DATABASE)) {
			Intent dbIntent = new Intent(this, Database.class);
			startActivity(dbIntent);
		} else if (option.equals(AndroidTutorialsConstants.MAP)) {
			
		} 
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(resultCode == RESULT_OK) {
			Bundle b = data.getExtras();
			String s = b.getString("answer");
			Toast.makeText(this, "ButtonActivity Result is: " + s, Toast.LENGTH_LONG).show();
		}
	}
}
