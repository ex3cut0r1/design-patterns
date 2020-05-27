package DecoratorAndFacade;

import java.util.Scanner;

public class OrderAndDelivery
{
	public static Scanner sc = new Scanner(System.in);
 
	public static void main( String[] args )
	{
		System.out.println( "Welcome to Sinan's Burger" );
		System.out.println( "Select one of the options below:" );
		System.out.println( "1 - Classic Burger" );
		System.out.println( "2 - Classic Burger With Cheese" );
		System.out.println( "3 - Classic Burger With Egg" );
		
		String input = sc.nextLine();
		
		switch( input )
		{
		case "1":
			Burger classicBurger = new Pickle( new Lettuce( new Tomato( new Beef( new PlainBurger() ) ) ) );
			
			System.out.println( "Ingreedients:" + classicBurger.getDescription() );
			System.out.println( "Cost:" + classicBurger.getCost() + "$" );
			System.out.println( "Type in address for delivery:" );
			sc.nextLine();
			System.out.println( "Type in your number:" );
			sc.nextInt();
			System.out.println( "Type in your card number:" );
			int cardNumber = sc.nextInt();
			System.out.println( "Type in your security code:" );
			int securityCode = sc.nextInt();
			TerminalFacade accessTerminalFacade = new TerminalFacade( cardNumber, securityCode );
			accessTerminalFacade.payBill( classicBurger.getCost() );
			break;
		case "2":
			Burger burgerWithCheese = new Cheese( new Pickle( new Lettuce( new Tomato( new Beef( new PlainBurger() ) ) ) ) );
			
			System.out.println( "Ingreedients:" + burgerWithCheese.getDescription() );
			System.out.println( "Cost:" + burgerWithCheese.getCost() + "$" );
			System.out.println( "Type in address for delivery:" );
			sc.nextLine();
			System.out.println( "Type in your number:" );
			sc.nextInt();
			System.out.println( "Type in your card number:" );
			int cardNumber1 = sc.nextInt();
			System.out.println( "Type in your security code:" );
			int securityCode1 = sc.nextInt();
			TerminalFacade accessTerminalFacade1 = new TerminalFacade( cardNumber1, securityCode1 );
			accessTerminalFacade1.payBill( burgerWithCheese.getCost() );
			break;
		case "3":
			Burger burgerWithEggs = new Egg (new Pickle( new Lettuce( new Tomato( new Beef( new PlainBurger() ) ) ) ) );
			
			System.out.println( "Ingreedients:" + burgerWithEggs.getDescription() );
			System.out.println( "Cost:" + burgerWithEggs.getCost() + "$" );
			System.out.println( "Type in address for delivery:" );
			sc.nextLine();
			System.out.println( "Type in your number:" );
			sc.nextInt();
			System.out.println( "Type in your card number:" );
			int cardNumber2 = sc.nextInt();
			System.out.println( "Type in your security code:" );
			int securityCode2 = sc.nextInt();
			TerminalFacade accessTerminalFacade2 = new TerminalFacade( cardNumber2, securityCode2 );
			accessTerminalFacade2.payBill( burgerWithEggs.getCost() );
			break;
		default:
			System.out.println( "There is no such option" );
		}
	}
}