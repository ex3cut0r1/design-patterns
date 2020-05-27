package DecoratorAndFacade;

public class Tomato extends ToppingDecorator
{

	public Tomato( Burger newBurger )
	{
		super( newBurger );
		
		System.out.println( "Adding Tomato Slices" );
	}
	
	public String getDescription()
	{
		return tempBurger.getDescription() + ", Tomato Slices";
	}
	
	public double getCost()
	{
		return tempBurger.getCost() + 0.50;
	}
}