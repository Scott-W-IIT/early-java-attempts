public class AccountHolder {
	double balance;
	public String get;
	static double annualInterestRate;
	
	public AccountHolder(double bal) {
	/* set member field to start value	
	 * below is the CEO: conditional expression officer
	 */
balance = bal < 0 ? 0: bal; 
		
	}
	
	public void monthlyInterest()
	{
	
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/*
	 * accept bal arg to update current balance
	 */
    public void deposit(double bal)
    {
   
}
    /*
     * drop (discount) bal down, up to a limit
     * warn user if they reach limit
     * (consider making a menu)
     */
    public void withdraw(double bal)
    {
    	/*
    	 * Check current bal with local value
    	 * and update the reduction, but not below the limit
    	 */
    }
    
    
}
