package com.Orcbox.de;

import java.util.ArrayList;
import java.util.Scanner;

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

	public void addToInnerArray(String title, String interpret, String album, String length, String path) {
		sList.add(title);
		sList.add(interpret);
		sList.add(album);
		sList.add(length);
		sList.add(path);
		aList.add(sList);
		sList = new ArrayList<String>();
	}
	
	public void InputSongdetails() {
	    String[] arguments = new String[5];
	    Scanner scan = new Scanner(System.in);
	    
	    do {
		System.out.println("Titel:");
		arguments[0] = scan.nextLine();
		System.out.println("Interpret:");
		arguments[1] = scan.nextLine();
		System.out.println("Album:");
		arguments[2] = scan.nextLine();
		System.out.println("Länge:");
		arguments[3] = scan.nextLine();
		System.out.println("Pfad:");
		arguments[4] = scan.nextLine();
		addToInnerArray(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4]);
		System.out.println("Zum Beenden jetzt *n* eingeben und mit Enter bestätigen.");
	} while (!(scan.nextLine().equals("n")));
	    
	}
}

