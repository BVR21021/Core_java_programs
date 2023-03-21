//import java.util.Scanner;

public class Perfect {
   public static void main(String[]args)
   {
	 //  Scanner sc=new Scanner(System.in);
	  // System.out.println("Enter the  range values");
	   //int lower=sc.nextInt();
	   //int upper=sc.nextInt();
	
	   //System.out.println("perfect number from"+lower+" to"+upper);
	   for(int n=1;n<=10000;n++)
	   {
		  int sum=0;
		  for(int i=1;i<=n/2;i++)
		  {
			  if(n%i==0)  
			  {
				  sum=sum+i;
			  }	 
		  }
		 
		  if(sum==n)
		  {
			  System.out.println(n+"Factors sum is"+sum);
			  System.out.println(n+"Is Perfect Number.....");
		  }
	   }
			   
   }
	

}
