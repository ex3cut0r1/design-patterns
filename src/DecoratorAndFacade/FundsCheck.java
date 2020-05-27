package DecoratorAndFacade;

public class FundsCheck
{
	private double cashInAccount = 1000.00;
	
	public double getCashInAccount()
	{
		return cashInAccount;
	}
	
	public void payMoney( double outcome )
	{
		cashInAccount -= outcome;
		System.out.println( "Payment is successfull!" );
		System.out.println( "Your ballanace is:" + getCashInAccount() );
	}
	
	public void recieveMoney( double income )
	{
		cashInAccount += income;
		System.out.println( "Revievement is successfull!" );
		System.out.println( "Your ballanace is:" + getCashInAccount() );
	}
	
	public boolean haveEnoughMoney( double moneyToCheck )
	{
		if( moneyToCheck > getCashInAccount() )
		{
			System.out.println( "You don't have enough money!" );
			System.out.println( "Your current ballance is:" + getCashInAccount() );

			return false;
		}
		else
		{
			return true;
		}
	}
}