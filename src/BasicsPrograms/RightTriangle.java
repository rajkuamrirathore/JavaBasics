package BasicsPrograms;

public class RightTriangle {

public static void main(String[] args) {
	
	int length=89,breadth=10,rem,noofcircle = 0;
	int rectarea=length*breadth;
	System.out.println("the are of square is " +rectarea);
	int radius =5;
	int circlearea= (int) (3.142*radius*radius);
	System.out.println("the are of square is " +circlearea);
	int a=6;
	int squarearea=a*a;
	System.out.println("the are of square is " +squarearea);
	int noofsquare=0;
	
	
		noofcircle=rectarea/circlearea;
		rem=rectarea%circlearea;
		System.out.println(rem);
		noofsquare=rem/squarearea;
	
	System.out.println("no of circles is " +noofcircle);
	System.out.println("no of square is " +noofsquare);
	
	
	
	
	
	
	
	
		}

	}
