package pro1;

abstract class cartoon 
{
	abstract void ben();
	void tom()
	{
		System.out.println("Tom and Jerry is very famous");
	}
}

class tv extends cartoon
{
	void ben()
	{
		System.out.println("Ben10 is my favorite childhood cartoon!!!");
	}

	public static void main(String[] args) 
	{
		tv obj=new tv();
		obj.ben();
		obj.tom();
	}
		

	}


