package ChainOfResponsibilityStateObserver;

public class RecieveLogger extends Logger {
	
	public RecieveLogger() {
		this.level = Logger.RECIEVE;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Info message: " + message);
		
	}

}
