package ChainOfResponsibilityStateObserver;

public class WaitState implements State{
	
	private String stateName = "WAIT_STAGE";

	@Override
	public void applyState(Context context) {
		context.setState(this);
		
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
