package BasicsPrograms;

public class LeftTriangle {
	
	public static void  starleft(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		starleft(5);
	}

}
