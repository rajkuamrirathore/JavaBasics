package BasicsPrograms;
public class SumOfElemennts {
	static boolean status =false;
static int arr[] = {3,5,-1,8,12};
 
 
	static  int Maxelelement()
	{   int sum=0;
		 int max = arr[0];
		for(int i =0;i<arr.length;i++)
		{
			sum = sum+arr[i];
			if(max<arr[i])
				max=arr[i];
			
				}
		
		System.out.println(max);
		sum=sum-max;
		System.out.println(sum);
		
		if(sum==max)
			status=true;
		System.out.println(status);
		return 0;
		
	}
	
	
	public static void main(String[] args) {
	
		SumOfElemennts.Maxelelement();
	}
	
}