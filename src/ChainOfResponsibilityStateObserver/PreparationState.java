package ChainOfResponsibilityStateObserver;

public class PreparationState implements State {
	
	private String stateName = "PREPARATION_STAGE";

	@Override
	public void applyState(Context context) {
		context.setState(this);
		
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
