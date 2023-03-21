
/*class Adder{  
	  public static void main(String args[]){ 
		 String s="abc12";int sum=0,sum1=0,sum2=0;
		 System.out.println(s);
		 for(int i=0; i<=s.length()-1;i++) {
		char ch=s.charAt(i);
		if(ch>='0'&&ch<='9') {
			ch=(char)(ch-48);
		}
		int a=ch;
		sum=sum+a;
		 }
		 System.out.println(sum);
		 while(sum!=0) {
			 int x=sum%10;
			 sum1=sum1+x;
			 sum=sum/10;
		 } 
		 System.out.println(sum1);
		 if(sum1>9) {
			 while(sum1!=0)
			 {
			int b=sum1%10;
				 sum=sum+b;
				 sum1=sum1/10;	 
			 }
			 System.out.println(sum);
		 }
 }
}
*/


package com.venky;
public class Adder{
 public static int getSingleDigit(int n){
  int res=0;
  while(n>0){
  int rr=n%10;
  res+=rr;n=n/10;
  }
  return res;
  }
  public static void main(String args[]){
  String s="abc123";
 int sum=0;
 for(int i=0;i<=s.length()-1;i++){
  char ch=s.charAt(i);
		if(ch>='0'&&ch<='9') {
			ch=(char)(ch-48);
		}
		int a=ch;
		sum=sum+a;
  }
  int lucky=getSingleDigit(sum);
  int result=0;
  if(lucky>9){
  result =getSingleDigit(lucky);
  }
  else{
  result=lucky;
  System.out.println(lucky);
 }
}
} 
 