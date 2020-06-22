package ChainOfResponsibilityStateObserver;

public class Context {
	private String descriptionOfState;
	private State state;
	
	public Context(String descriptionOfState) {
		this.descriptionOfState = descriptionOfState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
