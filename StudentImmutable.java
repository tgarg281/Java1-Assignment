
public final class StudentImmutable {
	
	final String name;
	final int rollno;
	
	public StudentImmutable(String nm,int rno)
	{
		this.name=nm;
		this.rollno=rno;
	}
	
	public String get_name()
	{
		return this.name;
	}
	
	public int get_rollno()
	{
		return this.rollno;
	}

}
