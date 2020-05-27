package DecoratorAndFacade;

public class Egg extends ToppingDecorator
{

	public Egg( Burger newBurger )
	{
		super( newBurger );
		
		System.out.println( "Adding Egg" );
	}
	
	public String getDescription()
	{
		return tempBurger.getDescription() + ", Egg";
	}
	
	public double getCost()
	{
		return tempBurger.getCost() + 1.00;
	}
}