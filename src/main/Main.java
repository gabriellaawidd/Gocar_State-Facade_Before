package main;

import java.util.Scanner;

import auth.authManager;
import facade.GocarFacade;

public class Main {

	public Main() {
		
		Scanner sc = new Scanner(System.in);
		String loggedUser = null;
		authManager auth = new authManager();
		
		
		System.out.println("=== Welcome to Gocar Application ===");
		
		// Menu 1: Authentication
		while (loggedUser == null) {
			System.out.println("\n--- Authentication Menu ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print(">> ");
            
            int choice = sc.nextInt(); sc.nextLine();
            
            if (choice == 1) {
            	System.out.print("Enter username: ");
                String username = sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();
                
                auth.register(username, password);
                
                continue;
            }
            
            else if (choice == 2) {
            	System.out.print("Enter username: ");
                String loginUsername = sc.nextLine();
                System.out.print("Enter password: ");
                String loginPassword = sc.nextLine();
                
                loggedUser = auth.login(loginUsername, loginPassword);
                
                if (loggedUser == null) {
                	continue;
                }
                else {
                	break;
                }
            }
            
            else if (choice == 3) {
            	System.out.println("Thank you for using Gocar!");
            	return;
            }
		}
		
		
		// Menu 2: Application
		while (true) {
			String pickup;
			String destination;
			
			System.out.println("\n--- Gocar Application ---");
            System.out.println("Welcome, " + loggedUser + "!");
            System.out.println("1. Order Gocar");
            System.out.println("2. Exit");
            System.out.print(">> ");
            
            int choice = sc.nextInt(); sc.nextLine();
			
            if (choice == 1) {
            	System.out.print("Enter your pickup location: ");
                pickup = sc.nextLine();
                System.out.print("Enter your destination: ");
                destination = sc.nextLine();
                
                // FACADE
                GocarFacade facade = new GocarFacade();
                facade.orderGocar(loggedUser, pickup, destination);
                
                continue;
            }
            
            else if (choice == 2) {
            	System.out.println("Thank you for using Gocar, " + loggedUser + "!");
                return;
            }
            else {
            	System.out.println("Invalid option!");
            }
		}
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
