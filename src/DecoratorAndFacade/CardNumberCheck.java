package DecoratorAndFacade;

public class CardNumberCheck
{
	private int cardNumber = 123456789;
	
	public int getCardNumber()
	{
		return cardNumber;
	}
	
	public boolean cardActive( int cardNumberToCheck )
	{
		if( cardNumberToCheck == getCardNumber() )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}