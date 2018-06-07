/*class MyException extends Exception{
	
	

}*/
public class Main {

	public static void main(String[] args) {
		
		Account s=new Savings(10000.0,"Mukesh","2345638392","7895273826");
		
		s.credit_amount(2000.0);

		try
		{
			s.debit_amount(11000.0);
		}
		catch(MyException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		System.out.println(s.get_balance());
		
		Account c=new Current(5000.0,"Ramesh","2324343222","63754828333");
		c.change_name("Suresh");
		try
		{
			c.debit_amount(2000.0);
		}
		catch(MyException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println(c.get_balance());

	}
}
