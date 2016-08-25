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
		for (ArrayList<String> l : aList) {
			for (String s : l) {
				System.out.print(s + ",");
			}
			System.out.println();
		}
	}

	public void addSong(String title, String interpret, String album, String length, String path) {
		sList.add(title);
		sList.add(interpret);
		sList.add(album);
		sList.add(length);
		sList.add(path);
		aList.add(sList);
		sList = new ArrayList<String>();
	}
}

