package ChainOfResponsibilityStateObserver;

public interface State {
	public void applyState(Context context);
	public String getStateName();
}
