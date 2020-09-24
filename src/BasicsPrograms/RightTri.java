package BasicsPrograms;

public class RightTri {

	public static void main(String[] args) {
		int n=5,k=2*n-2;
		for(int i=5;i>=0;i--)
		{
			for(int j=0;j<k;j++)
			{
				System.out.print(" ");
			}
			//k=k-1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
