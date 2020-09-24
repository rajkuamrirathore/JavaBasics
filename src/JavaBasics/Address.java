package JavaBasics;

public class Address {

	private static String city;
	private String state;

	public Address(String city, String state) {
		this.city=city;
		this.state=state;
	}
	public static String getcity()
	{
		return city;
	}
	public void setcity(String city1)
	{
		this.city=city1;
		
	}
	public String getstate()
	{
		return state;
	}
	public void setstate(String state1)
	{
		this.city=state1;
		
	}
	
}
