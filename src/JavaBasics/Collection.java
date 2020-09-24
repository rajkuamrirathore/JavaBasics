package JavaBasics;

import java.util.ArrayList;
import java.util.List;



public  class Collection {
	 
	 public static void main(String args[])
		{
		 DisplayMessage d=new DisplayMessage();     //creation of base class object
			d.hello();
	 
			d=new DisplayMessage();    
		}}

	
	 class DisplayMsg
	{
		 public static void hello()    //static method 
			{
				System.out.println("Hello...Good morning");
			}
	}	
	 
	 class  DisplayMessage extends DisplayMsg
		{
		 
			public static void hello()      //redefining of base class static method in derived class
			{
				System.out.println("Hello...everyone");
			}
		}
		
		
	