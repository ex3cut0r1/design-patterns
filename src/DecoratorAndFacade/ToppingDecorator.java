package DecoratorAndFacade;

public abstract class ToppingDecorator implements Burger
{
	
	protected Burger tempBurger;
	
	public ToppingDecorator( Burger newBurger )
	{
		tempBurger = newBurger;
	}
	
	public String getDescription()
	{
		return tempBurger.getDescription();
	}
	
	public double getCost()
	{
		return tempBurger.getCost();
	}
}