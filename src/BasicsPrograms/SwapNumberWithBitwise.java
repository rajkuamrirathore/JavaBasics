package BasicsPrograms;

public class SwapNumberWithBitwise {

	public static void main(String[] args) {
		int i=100;
		int j=200;
		System.out.println("before swapping");
		System.out.println(i);
		System.out.println(j);
		i=i^j;
		j=i^j;
		i=i^j;
		System.out.println("after swapping");
		System.out.println(i);
		System.out.println(j);

	}

}
