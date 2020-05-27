package DecoratorAndFacade;

public class Cheese extends ToppingDecorator
{

	public Cheese( Burger newBurger )
	{
		super( newBurger );
		
		System.out.println( "Adding Cheese" );
	}
	
	public String getDescription()
	{
		return tempBurger.getDescription() + ", Cheese";
	}
	
	public double getCost()
	{
		return tempBurger.getCost() + 2.00;
	}
}