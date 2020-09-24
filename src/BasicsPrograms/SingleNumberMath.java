package BasicsPrograms;



public class SingleNumberMath {

	public static int xorsinglenumber(int ar[]) {
		int n=ar.length;
		int res=ar[0];
		for(int i =1;i<n;i++)
		{
			res = res ^ ar[i];
		}
		
		
		return res;
		}
	
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4,4,5,6,6,7,7,8,8};
	int result =	SingleNumberMath.xorsinglenumber(arr);

System.out.println(result);
}

}
