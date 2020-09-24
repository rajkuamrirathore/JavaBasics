package BasicsPrograms;

public class Amstrong {

	public static void main(String[] args) {
		
		
		int arr[] = {153,56,87};
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			int temp=arr[i];
			while(arr[i]!=0)
			{
				int rem = arr[i]%10;
				 sum = sum+(rem*rem*rem);
				 arr[i]=arr[i]/10;
				// System.out.println(sum);
				// System.out.println(arr[i]);
			}
			if(temp==sum)
			System.out.println("Number found amstrong"+ temp);
			else
				System.out.println("Number not found amstrong"+ temp);
		}

	}

}
