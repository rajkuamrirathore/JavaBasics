package BasicsPrograms;

public class BinarySearch {
	
	int Binarysearch(int arr[])
	{ int n=0;
		int low=0,high=arr.length-1;
		System.out.println(arr.length);
		while(arr.length!=0)
		{
			int mid= (low+high)/2;
			if(n==arr[mid]|| n==arr[low]||n==arr[high])
			{
				return mid; }
			    
			 if(n>arr[mid])
			     {low=mid+1;}
			else 
			{high=mid-1;}
			
			
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int ar[] = {1,3,5,6,7,8,9,10};
		BinarySearch b= new BinarySearch();
		int result = b.Binarysearch(ar);
		if(result == -1)
			System.out.println("element not found in the given array");
		else
			System.out.println("element found at "+result+"th index");
			
	}

}
