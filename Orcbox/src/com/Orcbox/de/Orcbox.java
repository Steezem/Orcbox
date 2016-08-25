package com.Orcbox.de;

import java.util.Scanner;

public class Orcbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		String[] arguments = new String[5];
		ArrayList2D list = new ArrayList2D();

		System.out.println("A new Musicplayer is up to come");
		scan = new Scanner(System.in);

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
			list.addToInnerArray(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4]);
			System.out.println("Zum Beenden jetzt *n* eingeben und mit Enter bestätigen.");
		} while (!(scan.nextLine().equals("n")));

		list.printList();
	}

}
