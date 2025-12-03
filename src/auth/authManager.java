package auth;

import java.util.HashMap;

public class authManager {
	
	private HashMap<String, String> users;

	public authManager() {
		this.users = new HashMap<String, String>();
	}

	public void register (String username, String password) {
		if (users.containsKey(username)) {
			System.out.println("Username already exists!");
			System.out.println();
		}
		else {
			users.put(username, password);
			System.out.println("Registration successful for " + username + "!");
			System.out.println();
		}
	}
	
	public String login (String username, String password) {
		if (users.containsKey(username)) {
			if (users.get(username).equals(password)) {
				System.out.println("Login successful! Welcome " + username + "!");
                return username;
			}
			else {
				System.out.println("Invalid password!");
				return null;
			}
		}
		else {
			System.out.println("Username not found!");
			return null;
		}
	}

}
