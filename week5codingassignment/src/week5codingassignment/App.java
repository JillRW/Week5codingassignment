package week5codingassignment;

public class App {

	public static void main(String[] args) {	
		Logger asterisksLogger = new AsteriskLogger();
		asterisksLogger.log("Stars");
		
		asterisksLogger.error("Stars");
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Space");
		
		spacedLogger.error("Space");

	}
	

}
