package JavaBasics;

public class sttatic {
	
	static int i=10;

	public void display()
	{
		System.out.println("hello rj");
	}
}

  class Nstatic extends sttatic{
	  
	public  void display()
	{
		System.out.println("hello praveen");
	}
	

  public static void main(String[] args)
  {  
	  Nstatic ns = new Nstatic();
	  ns.display();
	  
  }
  }