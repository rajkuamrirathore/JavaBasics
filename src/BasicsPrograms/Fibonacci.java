package BasicsPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=100;
		int num=1584;
		boolean numberfound=false;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<=count;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			if(num==n1||num==n2||num==n3)
			{
				numberfound	=true;
				break;
				}
			
			n1=n2;
			n2=n3;
			
			
		}
		if(numberfound)
		
			System.out.println("number found");
		else 
				System.out.println("number not found");
		
			
			

	}

}
