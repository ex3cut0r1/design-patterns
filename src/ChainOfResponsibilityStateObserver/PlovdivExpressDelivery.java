package ChainOfResponsibilityStateObserver;

import java.util.Scanner;

import Observer2.Brand;
import Observer2.CarBrand;
import Observer2.Model;

public class PlovdivExpressDelivery {
	
	public static Scanner sc = new Scanner(System.in);
	
	private static Logger getChain() {
		Logger sendLogger = new SendLogger();
		Logger recieveLogger = new RecieveLogger();
		
		sendLogger.setNextLogger(recieveLogger);
		return sendLogger;
	}
	
	public static void main( String[] args ) {
		System.out.println( "Welcome to Plovdiv Express Delivery" );
		System.out.println( "Select one of the options below:" );
		
		System.out.println( "1 - Recieve Package" );
		System.out.println( "2 - Send Package" );
		System.out.println( "0 - Exit" );
		
		int input = sc.nextInt();
		
		while(input != 0 ) {
			if( input == 1 )
			{
				Context employees = new Context("Employees");
				
				PreparationState prepState = new PreparationState();
				WaitState waitState = new WaitState();
				
				waitState.applyState(employees);
				
				
				State employeesState = employees.getState();
				String currentState = employeesState.getStateName();
				System.out.println("currentState: " + currentState);
				System.out.println("Welcome to the recieving section");
				System.out.println("This is the product you are about to recieve");
				Model model = new Model();
				CarBrand car1 = new Brand( "Mercedes Benz" );
				model.addCarBrand( car1 );
				model.setCarModel( "S63 AMG" );
				prepState.applyState(employees);
				State employeesState1 = employees.getState();
				String currentState1 = employeesState1.getStateName();
				System.out.println("currentState: " + currentState1);
				System.out.println("Thanks for working with us");
				System.out.println("Your car is outside");
				System.out.println("currentState: " + currentState);
				Logger chain = getChain();
				chain.logMessage(2, "Product is Recieved");
				chain.logMessage(1, "Delivery Money Are Sent");
				break;
			
			}
			else if( input == 2 )
			{
				int input2 = sc.nextInt();
				System.out.println("Please Select A Sending Destination");
				System.out.println( "1 - Foreign Country" );
				System.out.println( "2 - City in Bulgaria" );
				System.out.println( "3 - Address in Plovdiv" );
				System.out.println( "0 - Exit" );
				while(input2 != 0 )
				{
					Context employees = new Context("Employees");
					
					PreparationState prepState = new PreparationState();
					WaitState waitState = new WaitState();
					
					waitState.applyState(employees);
					
					
					State employeesState = employees.getState();
					String currentState = employeesState.getStateName();
					System.out.println("currentState: " + currentState);
					System.out.println("Welcome to the sending section");
					System.out.println("What product are you about to send");
					Model model = new Model();
					CarBrand car1 = new Brand( "Bugatti" );
					model.addCarBrand( car1 );
					model.setCarModel( "Chiron" );
					if( input2 == 1 )
					{
						System.out.println("Delivery Address is Germany,Munich");
					}
					else if( input2 == 2 )
					{
						System.out.println("Delivery Address is Bulgaria,Plovdiv");
					}
					else if( input2 == 3 )
					{
						System.out.println("Delivery Address is Plovdiv,Plovdiv University-New Building");
					}
					
					prepState.applyState(employees);
					State employeesState1 = employees.getState();
					String currentState1 = employeesState1.getStateName();
					System.out.println("currentState: " + currentState1);
					System.out.println("Thanks for working with us");
					System.out.println("Your gift car is being prepared for delivery");
					System.out.println("currentState: " + currentState);
					Logger chain = getChain();
					chain.logMessage(1, "Delivery Money Are Sent");
					chain.logMessage(2, "Delivery Money Are Recieved");
					break;
				}
				
				break;
			}
			else if( input == 0 )
			{
				System.exit(0);
			}
			else
			{
				System.out.println("wrong selection");
				break;
			}
		}
	}
}