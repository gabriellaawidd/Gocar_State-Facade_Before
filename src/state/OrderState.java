package state;


public interface OrderState {
	void execute();
	OrderState getNextState();

}
