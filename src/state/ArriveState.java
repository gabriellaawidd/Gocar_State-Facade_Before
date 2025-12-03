package state;

import models.Order;

public class ArriveState implements OrderState{
	
	private Order order;

	public ArriveState(Order order) {
		super();
		this.order = order;
	}

	@Override
	public void execute() {
		System.out.println("\n=== Arrive ===");
        System.out.println("Customer: " + order.getCustName());
        System.out.println("Arrived at: " + order.getDestination());
        System.out.println("Order completed!");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
		
	}

	@Override
	public OrderState getNextState() {
		// No next state
		return null;
	}


}
