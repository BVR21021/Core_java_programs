package com.venky;
 class Studentcal  {
	private int total;
	private int calculateTotal(int m1,int m2,int m3) {
	calculatePercentage(total );
 total=m1+m2+m3;
	return total;
}
private void calculatePercentage(double total ) {
	double avg=total%3;
System.out.println(avg);
}

}
 public class StudentCalculation{
		public static void main(String[] args) {
			Student s1=new Student();
			s1.setSno(1);
			s1.setSname("venky");
			s1.setM1(96);
			s1.setM2(91);
			s1.setM3(99);
			int a=s1.getM1();
			int b=s1.getM2();
			int c=s1.getM3();
			System.out.println(s1.getSno()+s1.getSname()+a+b+s1.getM3());
			calculateTotal(a,b,c);
			
		}
 }
			

