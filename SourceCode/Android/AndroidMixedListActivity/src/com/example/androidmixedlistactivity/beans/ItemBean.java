package com.example.androidmixedlistactivity.beans;

public class ItemBean {
	
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public ItemBean(String item) {
		super();
		this.item = item;
	}

	@Override
	public String toString() {
		return "ItemBean [item=" + item + "]";
	}
	
	

}
