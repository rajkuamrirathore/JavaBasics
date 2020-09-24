package JavaBasics;

public class Aggregation {
	private int id;
	public String name;
	Address address;
	
	public Aggregation(int id, String name, Address address)
	{
		this.id=id;
		this.name=name;
	this.address=address;
		
	}
	public void display() {
		System.out.println(id+ "  " +name);
		System.out.println(Address.getcity());
	}
	
	public static void main(String[] args)
	{ Address ad = new Address("blore","KA");
	Aggregation ag = new Aggregation(10,"rajj",ad);
	
     ag.display();
     Static s= new Static();
     s.display();
	}

}
