
public class Exception {

	public static void main(String[] args) 
	{
		try
		{
		System.out.println("division pogram started");
		int quotient=1;
		int n=1;
		int d=0;
		quotient=n/d;
		System.out.println(quotient);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("division failed");
			
		
		}
		System.out.println("division program completed");
	}

}
