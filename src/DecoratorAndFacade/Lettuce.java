package DecoratorAndFacade;

public class Lettuce extends ToppingDecorator
{

	public Lettuce( Burger newBurger )
	{
		super( newBurger );
		
		System.out.println( "Adding Green Leaf Lettuce" );
	}
	
	public String getDescription()
	{
		return tempBurger.getDescription() + ", Green Leaf Lettuce";
	}
	
	public double getCost()
	{
		return tempBurger.getCost() + 0.50;
	}
}