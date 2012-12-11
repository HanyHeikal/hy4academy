package com.example.androidtutorials.adapters;

import java.util.ArrayList;

import com.example.androidtutorials.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;


public class ExpandableAdapter extends BaseExpandableListAdapter {

	private ArrayList<String> groups;
	private ArrayList<ArrayList<ArrayList<String>>> children;
	private Context context;

	public ExpandableAdapter(Context context, ArrayList<String> groups,
			ArrayList<ArrayList<ArrayList<String>>> children) {
		this.context = context;
		this.groups = groups;
		// this.children = childs;
		this.children = children;
	}

	@Override
	public boolean areAllItemsEnabled() {
		return true;
	}

	@Override
	public ArrayList<String> getChild(int groupPosition, int childPosition) {
		return children.get(groupPosition).get(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {

		String child = (String) ((ArrayList<String>) getChild(groupPosition,
				childPosition)).get(0);

		if (convertView == null) {
			LayoutInflater infalInflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = infalInflater.inflate(
					R.layout.main_menu_expandable_item, null);
		}

		TextView childtxt = (TextView) convertView
				.findViewById(R.id.TextViewChild01);

		childtxt.setText(child);

		return convertView;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return children.get(groupPosition).size();
	}

	@Override
	public String getGroup(int groupPosition) {
		return groups.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return groups.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {

		String group = (String) getGroup(groupPosition);

		if (convertView == null) {
			LayoutInflater infalInflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = infalInflater.inflate(
					R.layout.main_menu_expandable_group, null);
		}

		TextView grouptxt = (TextView) convertView
				.findViewById(R.id.TextViewGroup);

		grouptxt.setText(group);

		return convertView;
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}

	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		return true;
	}

}
