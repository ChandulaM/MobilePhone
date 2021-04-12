package mobilephone.services;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		ContactService con = new ContactServiceImpl();
		HashMap<String, String> lisHashMap = (HashMap<String, String>) con.addContact();
		con.searchContact(lisHashMap);
		con.removeContanct(lisHashMap);
		con.updateContact(lisHashMap);
		
	}

}
