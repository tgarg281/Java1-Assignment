
public interface Account {
	
	public void credit_amount(double val);
	public void debit_amount(double val) throws MyException;
	public double get_balance();
	public void change_name(String name);
	public double calc_interest();

}

