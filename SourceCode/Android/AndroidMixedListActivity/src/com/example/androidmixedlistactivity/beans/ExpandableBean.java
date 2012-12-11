package com.example.androidmixedlistactivity.beans;

import java.util.ArrayList;

public class ExpandableBean {
	
	private ArrayList<String> groups;
	private ArrayList<ArrayList<ArrayList<String>>> childs;

	public ArrayList<String> getGroups() {
		return groups;
	}

	public void setGroups(ArrayList<String> groups) {
		this.groups = groups;
	}

	public ArrayList<ArrayList<ArrayList<String>>> getChilds() {
		return childs;
	}

	public void setChilds(ArrayList<ArrayList<ArrayList<String>>> childs) {
		this.childs = childs;
	}

	@Override
	public String toString() {
		return "ExpandableBean [groups=" + groups + ", childs=" + childs + "]";
	}

}
