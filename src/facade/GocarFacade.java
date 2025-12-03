package facade;

import models.Order;
import state.OrderState;
import state.findState;

public class GocarFacade {
	
	public void orderGocar(String custName, String pickupLoc, String destination) {
		
		System.out.println("\n=== Starting Gocar Order Process ===");
		
		Order order = new Order(custName, pickupLoc, destination);
		OrderState currState = new findState(order);
		
		while (currState != null) {
			currState.execute();
			currState = currState.getNextState();
		}
		
		System.out.println("=== Order Process Complete ===");
	}
}
