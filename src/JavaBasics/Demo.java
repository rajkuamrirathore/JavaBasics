package JavaBasics;

public class Demo {
	  
	   static{
	        System.out.println("static block of parent class");
	    }
	   
	   public static void main(String args[])
	    {
	        StaticDemoChild obj = new StaticDemoChild();
	       // obj.display();
	    }
	}
	 class StaticDemoChild extends Demo{
	    static{
	        System.out.println("static block of child class");
	    }
	    public void display()
	    {
	        System.out.println("Just a method of child class");
	    }
	    
	}