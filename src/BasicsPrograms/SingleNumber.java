package BasicsPrograms;

public class SingleNumber {
	
	public static void main(String[] args) {
		int arr[] = {1,1,3,3,4,4,5,5,6,6,7,8,9};
		int n= arr.length;
		if(arr[0]!=arr[1])
		{
			System.out.println("Element found is "+arr[0]);
		}
		 if(arr[n-1]!=arr[n-2])
			System.out.println("Element found is "+arr[n-1]);
	
			
		for(int i=1;i<n-1;i++)
		{
			if((arr[i]!=arr[i+1]) && (arr[i]!=arr[i-1]))
			{
				System.out.println("Element found is "+arr[i]);
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	}