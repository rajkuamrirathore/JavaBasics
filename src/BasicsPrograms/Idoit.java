package BasicsPrograms;

public class Idoit {

	 public static void main(String[] args) {
         int arr[] = {1,3,3,4,4,5,5,6,6,7,8,9};
         int temp = arr[1];
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]==arr[i+1])
             {
                 temp = arr[i];
                 continue;
             }
             else
             {
             if(!(arr[i]==temp))
                 System.out.println(arr[i]);
             }
             }
	 }}