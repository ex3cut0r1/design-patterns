package DecoratorAndFacade;

public class TerminalFacade
{
	private int cardNumber, secutiryCode;
	
	CardNumberCheck cardNumChecker;
	SecutiryCodeCheck securityCodeChecker;
	FundsCheck fundsChecker;
	WelcomeToTerminal terminalWelcome;
	
	public TerminalFacade( int newCardNum, int newSecurityCode )
	{
		cardNumber			= newCardNum;
		secutiryCode		= newSecurityCode;
		terminalWelcome		= new WelcomeToTerminal();
		cardNumChecker		= new CardNumberCheck();
		securityCodeChecker	= new SecutiryCodeCheck();
		fundsChecker		= new FundsCheck();
	}
	
	public int getCardNumber()
	{
		return cardNumber;
	}
	
	public int getSecurityCode()
	{
		return secutiryCode;
	}
	
	public void payBill( double ownedCash )
	{
		if(
			cardNumChecker.cardActive( getCardNumber() ) &&
			securityCodeChecker.isCodeCorrect( getSecurityCode() ) &&
			fundsChecker.haveEnoughMoney( ownedCash )
		)
		{
			System.out.println( "Transaction Complete!\n" );
			fundsChecker.payMoney( ownedCash );
		}
		else
		{
			System.out.println( "Trasnsaction is incomplete!\n" );
		}
	}
}