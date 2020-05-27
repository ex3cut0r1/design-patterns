package DecoratorAndFacade;

public class SecutiryCodeCheck
{
	private int secutiryCode = 1234567;
	
	public int getSecutiryCode()
	{
		return secutiryCode;
	}
	
	public boolean isCodeCorrect( int securityCodeToCheck )
	{
		if( securityCodeToCheck == getSecutiryCode() )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}