package mobilephone.services;

import java.util.Scanner;

public class MessageServiceImpl implements MessageService {
	
	Scanner sc = new Scanner(System.in);
	private String contacts[] = {"Tim", "Tom", "Jim"};

	@Override
	public void sendMessage() {
		String response = "Y";
		int recipient;
		String message;
		
		while(response.equalsIgnoreCase("Y")) {
			
			System.out.println("Contacts list :");
			
			System.out.println("================");
			for(int i = 0; i < contacts.length; i++) {
				System.out.println("[" + (i + 1) + "] " + contacts[i]);
			}
			System.out.println("================");
			
			do {
				System.out.println("Select recipient : ");				
				recipient = sc.nextInt() - 1;
				
				if(recipient < 0 || recipient > contacts.length - 1)
					System.out.println("Enter a valid recipient");
				
			} while(recipient < 0 || recipient > contacts.length - 1);
			
				
			System.out.println("Enter message : ");
			message = sc.nextLine();
			message = sc.nextLine();
			
			System.out.println();
			System.out.println("-----Message Sent to " + contacts[recipient] + "----");
			System.out.println();
			System.out.println("Send another message? (Y/N)");
			response = sc.next();		
		}
		
	}

}
