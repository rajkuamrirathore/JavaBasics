package JavaBasics;

public class Constructorchaining {

	
private	Constructorchaining()
	{ System.out.println("deafult consreutctor");}
	
	
public	Constructorchaining(int x)
	{ this();
		System.out.println(x);}
	
protected Constructorchaining(int x, int y)
	{ this(5);
		System.out.println(x+y);}
	
	
	
	public static void main(String[] args) {
	
		Constructorchaining ch= new Constructorchaining(15,10);
	}

}
