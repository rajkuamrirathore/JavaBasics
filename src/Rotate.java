
public class Rotate {

	public static void main(String[] args) {
		int arr[] = {5,3,4,1};
		int n =3;
		int temp,abc;
		abc =arr[0];
		arr[0]=arr[n];
		arr[n]=abc;
		for(int i=0;i<n-1;i++)
		{
			temp = arr[i+1];
			arr[i+1]=arr[i];
			arr[i] =temp;
			//System.out.println(arr[i]);
		}
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		
	}

}
