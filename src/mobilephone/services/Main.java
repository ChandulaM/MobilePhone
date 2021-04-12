package mobilephone.services;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ContactService con = new ContactServiceImpl();
		HashMap<String, String> addedContacts = null;
		Scanner scanner = new Scanner(System.in);

		String dis2;
		do {
			System.out.println("\n====================CHOOSE AN OPTION====================");
			System.out.println("1.Add Contact.\n2.Search Contact.\n3.Update Contact\n4.Remove Contact.");
			System.out.print("====================\nYour Option(1/2/3/4)? : ");
			int dis = scanner.nextInt();
			System.out.println("====================");
			switch (dis) {
			case 1:
				addedContacts = (HashMap<String, String>) con.addContact();
				break;
			case 2:
				con.searchContact(addedContacts);
				break;
			case 3:
				con.updateContact(addedContacts);
				break;
			case 4:
				con.removeContanct(addedContacts);
				break;
			default:
				System.out.println("Choose only option numbers!!!");
				break;
			}
			System.out.println("\n\n=========================================");
			System.out.print("Select Another Option(Y/N)?");
			 dis2 = scanner.next();
			System.out.println("=========================================");
			if (dis2.equalsIgnoreCase("Y")) {
				continue;
			} else if (dis2.equalsIgnoreCase("N")) {
				break;
			} else {
				System.out.println("Enter only 'Y' or 'N'!");
			}
		} while (dis2.equalsIgnoreCase("Y"));

	}

}
