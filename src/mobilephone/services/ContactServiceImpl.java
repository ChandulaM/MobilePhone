package mobilephone.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {

	Scanner sc = new Scanner(System.in);

	
	//Method for adding contacts.
	public Map<String, String> addContact() {

		String decision = "Y";
		Map<String, String> contactList = new HashMap<String, String>();

		System.out.println("\n====================ADD CONTACTS====================");

		System.out.print("Enter the contact Name : ");
		String name = sc.next();
		System.out.print("Enter the contact Number : ");
		String number = sc.next();

		while (decision.equalsIgnoreCase("Y")) {
			contactList.put(number, name);
			System.out.println("=========================================");
			System.out.print("Do you want to add one more ? (Y/N)");
			decision = sc.next();
			System.out.println("=========================================");
			if (decision.equalsIgnoreCase("Y")) {
				System.out.print("Enter the contact Name : ");
				name = sc.next();
				System.out.print("Enter the contact Number : ");
				number = sc.next();
			} else if (decision.equalsIgnoreCase("N")) {
				break;
			} else {
				System.out.println("Enter only 'Y' or 'N'!");
				continue;
			}
		}
		System.out.println(contactList);
		return contactList;
	}
	
	

	//Method for searching contacts
	public void searchContact(HashMap<String, String> contactList) {
		String dis;
		System.out.println("\n====================SEARCH CONTACTS====================");
		System.out.print("Enter the Name : ");
		String name = sc.next();

		do {
			for (java.util.Map.Entry<String, String> entry : contactList.entrySet()) {
				if (entry.getValue().equals(name)) {
					System.out.println((entry.getValue() + " : " + entry.getKey()));
				}
			}

			System.out.println("=========================================");
			System.out.print("Do you want to continue? (Y/N)");
			dis = sc.next();
			System.out.println("=========================================");
			if (dis.equalsIgnoreCase("Y")) {
				System.out.print("Enter the Name : ");
				name = sc.next();
			} else if (dis.equalsIgnoreCase("N")) {
				break;
			} else {
				System.out.println("Enter only 'Y' or 'N'!");
				continue;
			}
		} while (dis.equalsIgnoreCase("Y"));

//		if(contactList.containsValue(name)) {
//			System.out.println(name + " : " + contactList.get(name));
//		}else {
//			System.out.println("Contact Not Found!!!");
//		}

	}
	
	


	//Method for removing contacts.
	public void removeContanct(HashMap<String, String> contactList) {
		String dis;
		String val = "";
		System.out.println("\n====================DELETE CONTACTS====================");
		System.out.print("Enter the Name to Delete : ");
		String name = sc.next();

		do {
			for (java.util.Map.Entry<String, String> entry : contactList.entrySet()) {
				if (entry.getValue().equals(name)) {
					val = entry.getKey();
				}
			}
			contactList.remove(val);
			System.out.println("Removed Successfully");
			System.out.println(contactList);
			System.out.println("=========================================");
			System.out.print("Do you want to continue? (Y/N)");
			dis = sc.next();
			System.out.println("=========================================");
			if (dis.equalsIgnoreCase("Y")) {
				System.out.print("Enter the Name to Delete : ");
				name = sc.next();
			} else if (dis.equalsIgnoreCase("N")) {
				break;
			} else {
				System.out.println("Enter only 'Y' or 'N'!");
				continue;
			}
		} while (dis.equalsIgnoreCase("Y"));

	}
	
	

	//Method for updating contacts.
	public void updateContact(HashMap<String, String> contactList) {
		String dis;
		String val = "";
		System.out.println("\n====================UPDATE CONTACTS====================");
		System.out.print("Enter the Name : ");
		String name = sc.next();
		System.out.print("Enter the New Number : ");
		String num = sc.next();

		do {
			for (java.util.Map.Entry<String, String> entry : contactList.entrySet()) {
				if (entry.getValue().equals(name)) {
					val = entry.getKey();
				}
			}
			contactList.remove(val);
			contactList.put(num, name);
			System.out.println("Updated Successfully");
			System.out.println(contactList);
			System.out.println("=========================================");
			System.out.print("Do you want to continue? (Y/N)");
			dis = sc.next();
			System.out.println("=========================================");
			if (dis.equalsIgnoreCase("Y")) {
				System.out.print("Enter the Name : ");
				name = sc.next();
				System.out.print("Enter the New Number : ");
				num = sc.next();
			} else if (dis.equalsIgnoreCase("N")) {
				break;
			} else {
				System.out.println("Enter only 'Y' or 'N'!");
				continue;
			}
		} while (dis.equalsIgnoreCase("Y"));

	}

}
