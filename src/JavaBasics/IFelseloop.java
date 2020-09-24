package JavaBasics;

public class IFelseloop {

	public static void main(String[] args) {
		// write logic to find the greatest among 3 numbers
		
		int a =1000000;
		int b=200, c=4560;
		if((a>b) &(a>c))
		
			System.out.println("a is the greatest");
		
			else if(b>c)
				System.out.println("b is the greatest");
			
			else 
				System.out.println("c is the greatest");
		 System.out.println("****************************");
		
		// type casting (widening-- converting smaller to bigger
		int d= 470;
		long l=d;
		System.out.println(l);
		
		 System.out.println("****************************");
		//Narrowing---- converting bigger to smaller
		double dd= 36.57;
		byte b1 = (byte) dd;
		System.out.println(b1);
		 System.out.println("****************************");
		//operators airthematic
		int x = 5;
	    x ^= 3;
	    System.out.println(x);
	    System.out.println("****************************");
	    //for loop
	    for(int i=10;i>=-10;i=i-1)
	    	System.out.println(i);
		
		}

	}


