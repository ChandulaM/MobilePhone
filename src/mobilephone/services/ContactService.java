package mobilephone.services;

import java.util.HashMap;
import java.util.Map;

public interface ContactService {
	public Map<String, String> addContact();

	public void removeContanct(HashMap<String, String> contactList);

	public void updateContact(HashMap<String, String> contactList);

	public void searchContact(HashMap<String, String> contactList);
}
