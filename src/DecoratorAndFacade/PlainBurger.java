package DecoratorAndFacade;

public class PlainBurger implements Burger
{
	@Override
	public String getDescription()
	{
		return "Two Burger Buns With Cheddar";
	}

	@Override
	public double getCost()
	{
		return 1.50;
	}
}