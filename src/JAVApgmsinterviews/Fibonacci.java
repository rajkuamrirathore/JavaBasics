package JAVApgmsinterviews;

public class Fibonacci {

	public static void main(String args[])
	{
		int t1=0,t2=1,n=10,sum, i=0;
		System.out.println("the fbonacci sroes is ");
		while(t1<=100){
			System.out.print(t1+ "+" );
			sum=t1+t2;
			t1=t2;
			t2=sum;
				}
		
	}
}
