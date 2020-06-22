package ChainOfResponsibilityStateObserver;

public class SendLogger extends Logger {
	
	public SendLogger() {
		this.level = Logger.SEND;
	}

	@Override
	protected void writeMessage(String message) {
		
		System.out.println("Info Message: " + message);
	}

}
