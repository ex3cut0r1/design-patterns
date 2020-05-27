package DecoratorAndFacade;

public class Pickle extends ToppingDecorator
{

	public Pickle( Burger newBurger )
	{
		super( newBurger );
		
		System.out.println( "Adding Dill Pickle Slices" );
	}
	
	public String getDescription()
	{
		return tempBurger.getDescription() + ", Dill Pickle Slices";
	}
	
	public double getCost()
	{
		return tempBurger.getCost() + 0.50;
	}
}