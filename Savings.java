
public class Savings implements Account{
	
	private static final int interest_rate=4;
	private String name;
	private final String account_no;
	private final String phone_no;
	private double balance;
	
	
	public Savings(double amt, String n, String accno, String phno) {
		// TODO Auto-generated constructor stub
		this.balance=amt;
		this.name=n;
		this.account_no=accno;
		this.phone_no=phno;
	}

	public void credit_amount(double val)
	{
		this.balance=this.balance+val;
	}
	public void debit_amount(double val) throws MyException
	{
		if(val>=balance)
		{
			throw new MyException("Not Enough Balance"); 
		}
		this.balance=this.balance-val;
	}
	public double get_balance()
	{
		return balance;
	}
	public void change_name(String s)
	{
		this.name=s;
	}
	public double calc_interest()
	{
		return (interest_rate*balance)/100;
	}
	
}
