package JavaBasics;

public class ClassB extends ClassA {
	ClassB get(){

	return this;
}
	void message()
	{
		System.out.println("hello child class");
	}
public static void main(String[] args){
	
	ClassA a = new ClassB();
	a.message();
}
}