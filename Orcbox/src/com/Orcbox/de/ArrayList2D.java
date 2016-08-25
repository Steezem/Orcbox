package com.Orcbox.de;

import java.util.ArrayList;

public class ArrayList2D {

	ArrayList<ArrayList<String>> aList;
	ArrayList<String> sList;

	public ArrayList2D() {
		aList = new ArrayList<ArrayList<String>>();
		sList = new ArrayList<String>();
	}

	public void printList() {
		for (String s : sList) {
			System.out.println(s);
		}
	}
	
	public void addToInnerArray(String title, String interpret, String album, String length){
		sList.add(title);
		sList.add(interpret);
		sList.add(album);
		sList.add(length);
		aList.add(sList);
	}
}
