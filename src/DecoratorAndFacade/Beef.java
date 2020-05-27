package DecoratorAndFacade;

public class Beef extends ToppingDecorator
{

	public Beef( Burger newBurger )
	{
		super( newBurger );
		
		System.out.println( "Adding Two Burger Buns With Chedder" );
		System.out.println( "Adding Ground Chuck Beef" );
	}
	
	public String getDescription()
	{
		return tempBurger.getDescription() + ", Ground Chuck Beef";
	}
	
	public double getCost()
	{
		return tempBurger.getCost() + 3.00;
	}
}